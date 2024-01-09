package edu.training.lesson18.university_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MathResearch extends Research{

	private Faculty faculty;
	private List<Student>students = new ArrayList<>();
	
	public MathResearch(Faculty faculty, List<Student> students) {
		this.faculty = faculty;
		this.students.addAll(students);
	}
	
	public void addStudent (Student student) {
		students.add(student);
	}
	
	public void changeFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public void getStudentInfo() {
		for(Student student: students) {
			student.displayMemberDetails();
		}
	}
	
	public void getFacultyInfo() {
		faculty.displayMemberDetails();
	}
	
	@Override
	void conductResearch() {
		System.out.println("Math research.");
	}

	@Override
	public int hashCode() {
		return Objects.hash(faculty, students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MathResearch other = (MathResearch) obj;
		return Objects.equals(faculty, other.faculty) && Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		return "MathResearch [faculty=" + faculty + ", students=" + students + "]";
	}
}

