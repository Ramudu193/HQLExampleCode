package com.kodnest.OneToManyHibernate;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String course_name;
	
	@ManyToOne
	@JoinColumn(name="student_id",referencedColumnName="id")
	KodStudent kodstudent;

	public Course() {
		super();
	}

	public Course(int id, String course_name, KodStudent kodstudent) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.kodstudent = kodstudent;
	}

	public Course(String course_name, KodStudent kodstudent) {
		super();
		this.course_name = course_name;
		this.kodstudent = kodstudent;
	}

	public Course(String course_name) {
		super();
		this.course_name = course_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public KodStudent getKodstudent() {
		return kodstudent;
	}

	public void setKodstudent(KodStudent kodstudent) {
		this.kodstudent = kodstudent;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name + ", kodstudent=" + kodstudent + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course_name, id, kodstudent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(course_name, other.course_name) && id == other.id
				&& Objects.equals(kodstudent, other.kodstudent);
	}
	
	
}
