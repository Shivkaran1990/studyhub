package com.spingboot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "webinar")
public class Webinar {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "webinar_id")
	private Integer id;
	private String webinarSubject;
	
	@OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "webinar_id", referencedColumnName = "webinar_id")
	private List<Course> courses;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWebinarSubject() {
		return webinarSubject;
	}
	public void setWebinarSubject(String webinarSubject) {
		this.webinarSubject = webinarSubject;
	}
	
	@Override
	public String toString() {
		return "Webinar [id=" + id + ", webinarSubject=" + webinarSubject + ", course=" + courses + "]";
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
