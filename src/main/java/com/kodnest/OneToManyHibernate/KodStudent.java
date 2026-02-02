package com.kodnest.OneToManyHibernate;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class KodStudent {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
 @Column
	String name;
	@Column
	String email;
	@Column
	String phone;
	@OneToMany(mappedBy="kodstudent",cascade=CascadeType.ALL)
	List <Course> course;

	public KodStudent() {
		super();
	}

	public KodStudent(int id, String name, String email, String phone, List<Course> course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.course = course;
	}

	public KodStudent(String name, String email, String phone, List<Course> course) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.course = course;
	}

	public KodStudent(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "KodStudent [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", course="
				+ course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, email, id, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KodStudent other = (KodStudent) obj;
		return Objects.equals(course, other.course) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	
}
