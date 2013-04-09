package edu.unbosque.model;

// Generated 8/04/2013 03:56:28 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Status generated by hbm2java
 */
@Entity
@Table(name = "status", catalog = "semillero")
public class Status implements java.io.Serializable {

	private Integer idStatus;
	private String name;
	private Set<Users> userses = new HashSet<Users>(0);

	public Status() {
	}

	public Status(String name, Set<Users> userses) {
		this.name = name;
		this.userses = userses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_status", unique = true, nullable = false)
	public Integer getIdStatus() {
		return this.idStatus;
	}

	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "status")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

}