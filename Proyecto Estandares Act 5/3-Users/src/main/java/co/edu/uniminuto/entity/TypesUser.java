package co.edu.uniminuto.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the types_users database table.
 * 
 */
@Entity
@Table(name="types_users")
@NamedQuery(name="TypesUser.findAll", query="SELECT t FROM TypesUser t")
public class TypesUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="typ_id")
	private int typId;

	@Column(name="typ_description")
	private String typDescription;

	@Column(name="typ_status")
	private String typStatus;


	public TypesUser() {
	}

	public int getTypId() {
		return this.typId;
	}

	public void setTypId(int typId) {
		this.typId = typId;
	}

	public String getTypDescription() {
		return this.typDescription;
	}

	public void setTypDescription(String typDescription) {
		this.typDescription = typDescription;
	}

	public String getTypStatus() {
		return this.typStatus;
	}

	public void setTypStatus(String typStatus) {
		this.typStatus = typStatus;
	}

}