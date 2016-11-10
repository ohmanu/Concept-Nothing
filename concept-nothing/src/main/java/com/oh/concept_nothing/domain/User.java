package com.oh.concept_nothing.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

@Entity(name = "user")
public class User implements Serializable{
	private static final long serialVersionUID = 1851585218972519644L;

	private static final String SALT = "bonsmrjsht";
	
	@Id
	@Column(name="iduser")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String login;
	private String password;
	
	public User() {};
	
	public User(String login, String password) {
		this.login = login;
		this.password = encode(password);
	}
	
	private String encode(String password) {
		return new Md5PasswordEncoder().encodePassword(password, SALT);
	}

	public long getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
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
		User other = (User) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + "]";
	}
}
