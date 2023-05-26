package LOGIC.pkg_Clients;

import LOGIC.pkg_HumanData.HumanData;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public abstract class Clients extends HumanData {
    
    
     private long clientNumber ;
    
    private Date clientSince;
    
    
    
}
