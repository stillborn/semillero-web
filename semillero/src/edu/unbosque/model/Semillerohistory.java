package edu.unbosque.model;

// Generated 8/04/2013 03:56:28 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Semillerohistory generated by hbm2java
 */
@Entity
@Table(name = "semillerohistory", catalog = "semillero")
public class Semillerohistory implements java.io.Serializable {

	private Integer idSemilleroHistory;
	private Semilleros semilleros;
	private Date actionDate;
	private String actionDescription;

	public Semillerohistory() {
	}

	public Semillerohistory(Semilleros semilleros) {
		this.semilleros = semilleros;
	}

	public Semillerohistory(Semilleros semilleros, Date actionDate,
			String actionDescription) {
		this.semilleros = semilleros;
		this.actionDate = actionDate;
		this.actionDescription = actionDescription;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_semilleroHistory", unique = true, nullable = false)
	public Integer getIdSemilleroHistory() {
		return this.idSemilleroHistory;
	}

	public void setIdSemilleroHistory(Integer idSemilleroHistory) {
		this.idSemilleroHistory = idSemilleroHistory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Semilleros_id_semillero", nullable = false)
	public Semilleros getSemilleros() {
		return this.semilleros;
	}

	public void setSemilleros(Semilleros semilleros) {
		this.semilleros = semilleros;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "action_date", length = 19)
	public Date getActionDate() {
		return this.actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	@Column(name = "action_description", length = 45)
	public String getActionDescription() {
		return this.actionDescription;
	}

	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}

}
