package edu.training.lesson18.university_management_system;

import java.util.Objects;

public class Course {
private String courseName;

public Course() {
	
}

public Course(String courseName) {
	this.courseName = courseName;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

@Override
public int hashCode() {
	return Objects.hash(courseName);
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
	return Objects.equals(courseName, other.courseName);
}

@Override
public String toString() {
	return courseName;
}

}
