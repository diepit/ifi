package com.ifi.model;
// Generated Feb 24, 2018 2:22:47 AM by Hibernate Tools 5.2.5.Final

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

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * ActivityCodes generated by hbm2java
 */
@Entity
@Table(name = "activity_codes", catalog = "assigment")
public class ActivityCodes implements java.io.Serializable {

	private Integer activityCode;
	private String activityDescription;
	private Set<Activities> activitieses = new HashSet<Activities>(0);

	public ActivityCodes() {
	}

	public ActivityCodes(String activityDescription, Set<Activities> activitieses) {
		this.activityDescription = activityDescription;
		this.activitieses = activitieses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "activity_code", unique = true, nullable = false)
	public Integer getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(Integer activityCode) {
		this.activityCode = activityCode;
	}

	@Column(name = "activity_description")
	public String getActivityDescription() {
		return this.activityDescription;
	}

	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "activityCodes")
	@JsonBackReference
	public Set<Activities> getActivitieses() {
		return this.activitieses;
	}

	public void setActivitieses(Set<Activities> activitieses) {
		this.activitieses = activitieses;
	}

}
