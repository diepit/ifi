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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Location generated by hbm2java
 */
@Entity
@Table(name = "location", catalog = "assigment")
public class Location implements java.io.Serializable {

	private Integer locationCode;
	private String locationDecription;
	private Set<Projects> projectses = new HashSet<Projects>(0);

	public Location() {
	}

	public Location(String locationDecription, Set<Projects> projectses) {
		this.locationDecription = locationDecription;
		this.projectses = projectses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "location_code", unique = true, nullable = false)
	public Integer getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(Integer locationCode) {
		this.locationCode = locationCode;
	}

	@Column(name = "location_decription")
	public String getLocationDecription() {
		return this.locationDecription;
	}

	public void setLocationDecription(String locationDecription) {
		this.locationDecription = locationDecription;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "location")
	@JsonBackReference
	public Set<Projects> getProjectses() {
		return this.projectses;
	}

	public void setProjectses(Set<Projects> projectses) {
		this.projectses = projectses;
	}

}
