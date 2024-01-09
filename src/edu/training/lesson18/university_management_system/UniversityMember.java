package edu.training.lesson18.university_management_system;

import java.util.Objects;

public abstract class UniversityMember {

	private String name;
	private int id;
	private String email;

	public UniversityMember() {

	}

	public UniversityMember(String name, int id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
	}

	abstract void displayMemberDetails();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniversityMember other = (UniversityMember) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "UniversityMember [name=" + name + ", id=" + id + ", email=" + email + "]";
	}

}
