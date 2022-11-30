package emsi.pfa.model;
import javax.persistence.*;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String prenom;
	private String mdp;
	private String tel;
	private String email;
	
	
	public User() {
	}
	public User(String nom, String prenom, String mdp, String tel, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.tel = tel;
		this.email = email;
	}
	public User(int id, String nom, String prenom, String mdp, String tel, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.tel = tel;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp + ", tel=" + tel + ", email="
				+ email + "]";
	}
	
	

}
