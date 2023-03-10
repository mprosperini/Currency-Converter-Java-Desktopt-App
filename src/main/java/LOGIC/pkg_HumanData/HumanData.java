package LOGIC.pkg_HumanData;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public abstract class HumanData implements Serializable {
// ---- ---- ---- ---- ---- ---- ----- ATTRIBUTES ---- ---- ---- ---- ---- ---- ---- ---- //    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nationalid;
    @Basic
    private String firstname;
    private String lastname;
    private String phone;
    private String mail;
    private String gender;
    @Temporal(TemporalType.DATE)
    private Date birthdate;

// ---- ---- ---- ---- ---- ---- ----- GETTERS ---- ---- ---- ---- ---- ---- ---- ---- //    
    public String getName() {
        return firstname;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return nationalid;
    }

    public String getSex() {
        return gender;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getMail() {
        return mail;
    }
    
    

// ---- ---- ---- ---- ---- ---- ----- SETTERS ---- ---- ---- ---- ---- ---- ---- ---- //    
    public void setName(String firstname) {
        this.firstname = firstname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(String nationalid) {
        this.nationalid = nationalid;
    }

    public void setSex(String gender) {
        this.gender = gender;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    
}
