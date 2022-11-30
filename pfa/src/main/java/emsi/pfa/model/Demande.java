package emsi.pfa.model;

import java.sql.Date;

import javax.persistence.*;



@Entity
public class Demande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String typeBesoin;
	private String etat;
	private Date date;
	
	@ManyToOne
	private User users;
	public Demande() {}
	
	public Demande(String description, String typeBesoin, String etat, Date date) {
		super();
		this.description = description;
		this.typeBesoin = typeBesoin;
		this.etat = etat;
		this.date = date;
	}
	public Demande(int id, String description, String typeBesoin, String etat, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.typeBesoin = typeBesoin;
		this.etat = etat;
		this.date = date;
	}
	
	public Demande(String description, String typeBesoin, String etat, Date date, User users) {
		super();
		this.description = description;
		this.typeBesoin = typeBesoin;
		this.etat = etat;
		this.date = date;
		this.users = users;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypeBesoin() {
		return typeBesoin;
	}
	public void setTypeBesoin(String typeBesoin) {
		this.typeBesoin = typeBesoin;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Demande [id=" + id + ", description=" + description + ", typeBesoin=" + typeBesoin + ", etat=" + etat
				+ ", date=" + date + ", users=" + users + "]";
	}
	
	
	

}
