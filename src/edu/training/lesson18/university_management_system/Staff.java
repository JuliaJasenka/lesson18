package edu.training.lesson18.university_management_system;

import java.util.Objects;

public class Staff extends UniversityMember {

	private String department;
	private String jobTitle;

	public Staff(String name, int id, String email, String department, String jobTitle) {
		super(name, id, email);
		this.department = department;
		this.jobTitle = jobTitle;
	}

	void displayMemberDetails() {
		System.out.println("Имя сотрудника: " + getName() + ", id сотрудника: " + getId() + ", email сотрудника: "
				+ getEmail() + "факультет: " + department + "должность: " + jobTitle);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, jobTitle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		return Objects.equals(department, other.department) && Objects.equals(jobTitle, other.jobTitle);
	}

	@Override
	public String toString() {
		return "Staff [department=" + department + ", jobTitle=" + jobTitle + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getEmail()=" + getEmail() + "]";
	}

}
