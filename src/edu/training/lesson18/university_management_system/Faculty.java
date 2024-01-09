package edu.training.lesson18.university_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends UniversityMember {

	private String department;
	private List<Course> coursesTeaching = new ArrayList<>();
	
	public Faculty() {
		
	}

	public Faculty(String name, int id, String email, String department, List<Course> coursesTeaching) {
		super(name, id, email);

		this.department = department;
		this.coursesTeaching.addAll(coursesTeaching);
	}

	public void addCourse(Course courseName) {
		coursesTeaching.add(courseName);
	}

	void displayMemberDetails() {
		System.out.println("Имя преподавателя: " + getName() + ", id преподавателя: " + getId()
				+ ", email преподавателя: " + getEmail() + ", факультет: " + getDepartment()
				+ ", курсы, которые преподает: " + getCoursesTeaching());
	}

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Course> getCoursesTeaching() {
		return coursesTeaching;
	}

	public void setCoursesTeaching(List<Course> coursesTeaching) {
		this.coursesTeaching = coursesTeaching;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(coursesTeaching, department);
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
		Faculty other = (Faculty) obj;
		return Objects.equals(coursesTeaching, other.coursesTeaching) && Objects.equals(department, other.department);
	}

	@Override
	public String toString() {
		return "Faculty [department=" + department + ", coursesTeaching=" + coursesTeaching + ", getName()=" + getName()
				+ ", getId()=" + getId() + ", getEmail()=" + getEmail() + "]";
	}

}
