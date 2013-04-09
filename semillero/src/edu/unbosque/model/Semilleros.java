package edu.unbosque.model;

// Generated 8/04/2013 03:56:28 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Semilleros generated by hbm2java
 */
@Entity
@Table(name = "semilleros", catalog = "semillero")
public class Semilleros implements java.io.Serializable {

	private Integer idSemillero;
	private String name;
	private String semilleroscol;
	private String mission;
	private String vision;
	private String generalObjectives;
	private String specificObjectives;
	private String workStrategy;
	private String webpage;
	private Date creationDate;
	private String image;
	private Set<Messages> messageses = new HashSet<Messages>(0);
	private Set<Researchlines> researchlineses = new HashSet<Researchlines>(0);
	private Set<Semilleroattachments> semilleroattachmentses = new HashSet<Semilleroattachments>(
			0);
	private Set<Publications> publicationses = new HashSet<Publications>(0);
	private Set<Messages> messagesesForSemillerosIdSemilleroTo = new HashSet<Messages>(
			0);
	private Set<Messages> messagesesForSemillerosIdSemilleroFrom = new HashSet<Messages>(
			0);
	private Set<Semillerohistory> semillerohistories = new HashSet<Semillerohistory>(
			0);
	private Set<Semillerosocial> semillerosocials = new HashSet<Semillerosocial>(
			0);
	private Set<Semilleroevents> semilleroeventses = new HashSet<Semilleroevents>(
			0);
	private Set<Workstrategies> workstrategieses = new HashSet<Workstrategies>(
			0);
	private Set<Researchareas> researchareases = new HashSet<Researchareas>(0);
	private Set<News> newses = new HashSet<News>(0);
	private Set<Semilleroschedule> semilleroschedules = new HashSet<Semilleroschedule>(
			0);
	private Set<Users> userses = new HashSet<Users>(0);
	private Set<Users> userses_1 = new HashSet<Users>(0);
	private Set<Users> userses_2 = new HashSet<Users>(0);

	public Semilleros() {
	}

	public Semilleros(String mission, String vision, Date creationDate,
			String image) {
		this.mission = mission;
		this.vision = vision;
		this.creationDate = creationDate;
		this.image = image;
	}

	public Semilleros(String name, String semilleroscol, String mission,
			String vision, String generalObjectives, String specificObjectives,
			String workStrategy, String webpage, Date creationDate,
			String image, Set<Messages> messageses,
			Set<Researchlines> researchlineses,
			Set<Semilleroattachments> semilleroattachmentses,
			Set<Publications> publicationses,
			Set<Messages> messagesesForSemillerosIdSemilleroTo,
			Set<Messages> messagesesForSemillerosIdSemilleroFrom,
			Set<Semillerohistory> semillerohistories,
			Set<Semillerosocial> semillerosocials,
			Set<Semilleroevents> semilleroeventses,
			Set<Workstrategies> workstrategieses,
			Set<Researchareas> researchareases, Set<News> newses,
			Set<Semilleroschedule> semilleroschedules, Set<Users> userses,
			Set<Users> userses_1, Set<Users> userses_2) {
		this.name = name;
		this.semilleroscol = semilleroscol;
		this.mission = mission;
		this.vision = vision;
		this.generalObjectives = generalObjectives;
		this.specificObjectives = specificObjectives;
		this.workStrategy = workStrategy;
		this.webpage = webpage;
		this.creationDate = creationDate;
		this.image = image;
		this.messageses = messageses;
		this.researchlineses = researchlineses;
		this.semilleroattachmentses = semilleroattachmentses;
		this.publicationses = publicationses;
		this.messagesesForSemillerosIdSemilleroTo = messagesesForSemillerosIdSemilleroTo;
		this.messagesesForSemillerosIdSemilleroFrom = messagesesForSemillerosIdSemilleroFrom;
		this.semillerohistories = semillerohistories;
		this.semillerosocials = semillerosocials;
		this.semilleroeventses = semilleroeventses;
		this.workstrategieses = workstrategieses;
		this.researchareases = researchareases;
		this.newses = newses;
		this.semilleroschedules = semilleroschedules;
		this.userses = userses;
		this.userses_1 = userses_1;
		this.userses_2 = userses_2;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_semillero", unique = true, nullable = false)
	public Integer getIdSemillero() {
		return this.idSemillero;
	}

	public void setIdSemillero(Integer idSemillero) {
		this.idSemillero = idSemillero;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Semilleroscol", length = 45)
	public String getSemilleroscol() {
		return this.semilleroscol;
	}

	public void setSemilleroscol(String semilleroscol) {
		this.semilleroscol = semilleroscol;
	}

	@Column(name = "mission", nullable = false, length = 200)
	public String getMission() {
		return this.mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}

	@Column(name = "vision", nullable = false, length = 200)
	public String getVision() {
		return this.vision;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	@Column(name = "general_objectives", length = 200)
	public String getGeneralObjectives() {
		return this.generalObjectives;
	}

	public void setGeneralObjectives(String generalObjectives) {
		this.generalObjectives = generalObjectives;
	}

	@Column(name = "specific_objectives", length = 500)
	public String getSpecificObjectives() {
		return this.specificObjectives;
	}

	public void setSpecificObjectives(String specificObjectives) {
		this.specificObjectives = specificObjectives;
	}

	@Column(name = "work_strategy", length = 200)
	public String getWorkStrategy() {
		return this.workStrategy;
	}

	public void setWorkStrategy(String workStrategy) {
		this.workStrategy = workStrategy;
	}

	@Column(name = "webpage", length = 45)
	public String getWebpage() {
		return this.webpage;
	}

	public void setWebpage(String webpage) {
		this.webpage = webpage;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "creation_date", nullable = false, length = 10)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "image", nullable = false, length = 45)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "semilleros_has_messages", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Messages_id_message", nullable = false, updatable = false) })
	public Set<Messages> getMessageses() {
		return this.messageses;
	}

	public void setMessageses(Set<Messages> messageses) {
		this.messageses = messageses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "semilleros_has_researchlines", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ResearchLines_id_researchline", nullable = false, updatable = false) })
	public Set<Researchlines> getResearchlineses() {
		return this.researchlineses;
	}

	public void setResearchlineses(Set<Researchlines> researchlineses) {
		this.researchlineses = researchlineses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "semilleros")
	public Set<Semilleroattachments> getSemilleroattachmentses() {
		return this.semilleroattachmentses;
	}

	public void setSemilleroattachmentses(
			Set<Semilleroattachments> semilleroattachmentses) {
		this.semilleroattachmentses = semilleroattachmentses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "semilleros_has_publications", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Publications_id_publication", nullable = false, updatable = false) })
	public Set<Publications> getPublicationses() {
		return this.publicationses;
	}

	public void setPublicationses(Set<Publications> publicationses) {
		this.publicationses = publicationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "semillerosBySemillerosIdSemilleroTo")
	public Set<Messages> getMessagesesForSemillerosIdSemilleroTo() {
		return this.messagesesForSemillerosIdSemilleroTo;
	}

	public void setMessagesesForSemillerosIdSemilleroTo(
			Set<Messages> messagesesForSemillerosIdSemilleroTo) {
		this.messagesesForSemillerosIdSemilleroTo = messagesesForSemillerosIdSemilleroTo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "semillerosBySemillerosIdSemilleroFrom")
	public Set<Messages> getMessagesesForSemillerosIdSemilleroFrom() {
		return this.messagesesForSemillerosIdSemilleroFrom;
	}

	public void setMessagesesForSemillerosIdSemilleroFrom(
			Set<Messages> messagesesForSemillerosIdSemilleroFrom) {
		this.messagesesForSemillerosIdSemilleroFrom = messagesesForSemillerosIdSemilleroFrom;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "semilleros")
	public Set<Semillerohistory> getSemillerohistories() {
		return this.semillerohistories;
	}

	public void setSemillerohistories(Set<Semillerohistory> semillerohistories) {
		this.semillerohistories = semillerohistories;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "semilleros_has_semillerosocial", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SemilleroSocial_id_semilleroSocial", nullable = false, updatable = false) })
	public Set<Semillerosocial> getSemillerosocials() {
		return this.semillerosocials;
	}

	public void setSemillerosocials(Set<Semillerosocial> semillerosocials) {
		this.semillerosocials = semillerosocials;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "semilleros_has_semilleroevents", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "SemilleroEvents_id_semilleroEvents", nullable = false, updatable = false) })
	public Set<Semilleroevents> getSemilleroeventses() {
		return this.semilleroeventses;
	}

	public void setSemilleroeventses(Set<Semilleroevents> semilleroeventses) {
		this.semilleroeventses = semilleroeventses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "semilleros_has_workstrategies", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "WorkStrategies_id_workStrategies", nullable = false, updatable = false) })
	public Set<Workstrategies> getWorkstrategieses() {
		return this.workstrategieses;
	}

	public void setWorkstrategieses(Set<Workstrategies> workstrategieses) {
		this.workstrategieses = workstrategieses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "semilleros_has_researchareas", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ResearchAreas_id_researcharea", nullable = false, updatable = false) })
	public Set<Researchareas> getResearchareases() {
		return this.researchareases;
	}

	public void setResearchareases(Set<Researchareas> researchareases) {
		this.researchareases = researchareases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "semilleros")
	public Set<News> getNewses() {
		return this.newses;
	}

	public void setNewses(Set<News> newses) {
		this.newses = newses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "semilleros")
	public Set<Semilleroschedule> getSemilleroschedules() {
		return this.semilleroschedules;
	}

	public void setSemilleroschedules(Set<Semilleroschedule> semilleroschedules) {
		this.semilleroschedules = semilleroschedules;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "students_by_semillero", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Users_id_user", nullable = false, updatable = false) })
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "leaders_by_semillero", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Users_id_user", nullable = false, updatable = false) })
	public Set<Users> getUserses_1() {
		return this.userses_1;
	}

	public void setUserses_1(Set<Users> userses_1) {
		this.userses_1 = userses_1;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "teaching_by_semillero", catalog = "semillero", joinColumns = { @JoinColumn(name = "Semilleros_id_semillero", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Users_id_user", nullable = false, updatable = false) })
	public Set<Users> getUserses_2() {
		return this.userses_2;
	}

	public void setUserses_2(Set<Users> userses_2) {
		this.userses_2 = userses_2;
	}

}
