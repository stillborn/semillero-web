package edu.unbosque.model;

// Generated 8/04/2013 03:56:28 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Semilleroevents generated by hbm2java
 */
@Entity
@Table(name = "semilleroevents", catalog = "semillero")
public class Semilleroevents implements java.io.Serializable {

	private int idSemilleroEvents;
	private String name;
	private String description;
	private Set<Semilleros> semilleroses = new HashSet<Semilleros>(0);

	public Semilleroevents() {
	}

	public Semilleroevents(int idSemilleroEvents) {
		this.idSemilleroEvents = idSemilleroEvents;
	}

	public Semilleroevents(int idSemilleroEvents, String name,
			String description, Set<Semilleros> semilleroses) {
		this.idSemilleroEvents = idSemilleroEvents;
		this.name = name;
		this.description = description;
		this.semilleroses = semilleroses;
	}

	@Id
	@Column(name = "id_semilleroEvents", unique = true, nullable = false)
	public int getIdSemilleroEvents() {
		return this.idSemilleroEvents;
	}

	public void setIdSemilleroEvents(int idSemilleroEvents) {
		this.idSemilleroEvents = idSemilleroEvents;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "semilleros_has_semilleroevents", catalog = "semillero", joinColumns = { @JoinColumn(name = "SemilleroEvents_id_semilleroEvents", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) })
	public Set<Semilleros> getSemilleroses() {
		return this.semilleroses;
	}

	public void setSemilleroses(Set<Semilleros> semilleroses) {
		this.semilleroses = semilleroses;
	}

}