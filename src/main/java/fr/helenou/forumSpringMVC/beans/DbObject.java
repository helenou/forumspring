/*
 * package fr.helenou.forumSpringMVC.beans;
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.MappedSuperclass; import javax.persistence.Transient;
 * import javax.persistence.Version;
 * 
 * import lombok.Getter; import lombok.Setter; import lombok.ToString;
 * 
 * @MappedSuperclass @Getter @Setter @ToString public abstract class DbObject
 * implements Serializable {
 * 
 * private static final long serialVersionUID = 1L;
 * 
 * @Id
 * 
 * @GeneratedValue (strategy = GenerationType.AUTO) private int id;
 * 
 * @Version private int version;
 * 
 * @Transient private int calculer;
 * 
 * 
 * // @PrePersist // public void prePersist() { //
 * System.out.println("prePersist"); // } // // @PostPersist // public void
 * postPersist() { // System.out.println("postPersist"); // } // // @PostLoad //
 * public void postLoad() { // System.out.println("postLoad"); // calculer=23;
 * // } //
 * 
 * 
 * }
 */