package com.oh.concept_nothing.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "shot")
public class Shot implements Serializable{
	private static final long serialVersionUID = 3453051828628062828L;
	
	@Id
	@Column(name="idshot")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String source;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	public Shot() {}
	
	public Shot(String title, String source, Date date) {
		this.title = title;
		this.source = source;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shot other = (Shot) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shot [id=" + id + ", title=" + title + ", source=" + source + ", date=" + date + "]";
	}
}
