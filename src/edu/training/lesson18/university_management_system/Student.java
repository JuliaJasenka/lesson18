package edu.training.lesson18.university_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends UniversityMember {
	private List<Course> coursesList = new ArrayList<>();
	private double gpa;

	public Student(String name, int id, String email, List<Course> coursesList, double gpa) {
		super(name, id, email);
		this.coursesList.addAll(coursesList);
		this.gpa = gpa;
	}

	public void addCourse(Course courseName) {
	//	if (coursesList == null) {
	//		coursesList = new ArrayList<>();
	//	}
		coursesList.add(courseName);
	}

	void displayMemberDetails() {
		System.out.println("Имя студента: " + getName() + ", id студента: " + getId() + ", email студента: "
				+ getEmail() + ", курсы, которые изучает: " + getCoursesList() + ", средний балл: " + getGpa());
	}

	public List<Course> getCoursesList() {
		return coursesList;
	}

	public void setCoursesList(List<Course> coursesList) {
		this.coursesList = coursesList;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(coursesList, gpa);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(coursesList, other.coursesList) && gpa == other.gpa;
	}

	@Override
	public String toString() {
		return "Student [coursesList=" + coursesList + ", gpa=" + gpa + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getEmail()=" + getEmail() + "]";
	}

}
