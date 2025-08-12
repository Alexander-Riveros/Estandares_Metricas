package co.edu.uniminuto.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the users_datas database table.
 * 
 */
@Entity
@Table(name="users_datas")
@NamedQuery(name="UsersData.findAll", query="SELECT u FROM UsersData u")
public class UsersData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="use_id")
	private int useId;

	@Column(name="use_document")
	private String useDocument;

	@Column(name="use_email")
	private String useEmail;

	@Column(name="use_lastNames")
	private String useLastName;

	@Column(name="use_names")
	private String useNames;

	@Column(name="use_password")
	private String usePassword;

	@Column(name="use_status")
	private String useStatus;

	//bi-directional many-to-one association to TypesUser
	@ManyToOne
	@JoinColumn(name="typ_id")
	private TypesUser typesUser;

	public UsersData() {
	}

	public int getUseId() {
		return this.useId;
	}

	public void setUseId(int useId) {
		this.useId = useId;
	}

	public String getUseDocument() {
		return this.useDocument;
	}

	public void setUseDocument(String useDocument) {
		this.useDocument = useDocument;
	}

	public String getUseEmail() {
		return this.useEmail;
	}

	public void setUseEmail(String useEmail) {
		this.useEmail = useEmail;
	}

	public String getUseNames() {
		return this.useNames;
	}

	public void setUseNames(String useNames) {
		this.useNames = useNames;
	}

	public String getUsePassword() {
		return this.usePassword;
	}

	public void setUsePassword(String usePassword) {
		this.usePassword = usePassword;
	}

	public String getUseStatus() {
		return this.useStatus;
	}

	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

	public TypesUser getTypesUser() {
		return this.typesUser;
	}

	public void setTypesUser(TypesUser typesUser) {
		this.typesUser = typesUser;
	}
	public String getUseLastName() {
		return useLastName;
	}

	public void setUseLastName(String useLastName) {
		this.useLastName = useLastName;
	}
}