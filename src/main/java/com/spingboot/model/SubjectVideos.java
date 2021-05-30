package com.spingboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubjectVideos")
public class SubjectVideos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String subject_id;
	private String video;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	@Override
	public String toString() {
		return "SubjectVideos [id=" + id + ", subject_id=" + subject_id + ", video=" + video + "]";
	}

}
