package PERSISTENCE;

import LOGIC.pkg_HumanData.HumanData;
import PERSISTENCE.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author saberx
 */
public class HumanDataJpaController implements Serializable {

    public HumanDataJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManagerFactory emf = null;

    public HumanDataJpaController() {
        emf = Persistence.createEntityManagerFactory("bankprojectPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(HumanData humanData) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(humanData);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(HumanData humanData) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            humanData = em.merge(humanData);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = humanData.getId();
                if (findHumanData(id) == null) {
                    throw new NonexistentEntityException("The humanData with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            HumanData humanData;
            try {
                humanData = em.getReference(HumanData.class, id);
                humanData.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The humanData with id " + id + " no longer exists.", enfe);
            }
            em.remove(humanData);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<HumanData> findHumanDataEntities() {
        return findHumanDataEntities(true, -1, -1);
    }

    public List<HumanData> findHumanDataEntities(int maxResults, int firstResult) {
        return findHumanDataEntities(false, maxResults, firstResult);
    }

    private List<HumanData> findHumanDataEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(HumanData.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public HumanData findHumanData(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(HumanData.class, id);
        } finally {
            em.close();
        }
    }

    public int getHumanDataCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<HumanData> rt = cq.from(HumanData.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
