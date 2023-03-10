package LOGIC.pkg_HumanData;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-06T22:01:26", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(HumanData.class)
public abstract class HumanData_ { 

    public static volatile SingularAttribute<HumanData, String> firstname;
    public static volatile SingularAttribute<HumanData, Date> birthdate;
    public static volatile SingularAttribute<HumanData, String> nationalid;
    public static volatile SingularAttribute<HumanData, String> mail;
    public static volatile SingularAttribute<HumanData, String> gender;
    public static volatile SingularAttribute<HumanData, String> phone;
    public static volatile SingularAttribute<HumanData, String> lastname;

}