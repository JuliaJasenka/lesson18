package edu.training.lesson18.university_management_system;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Иванов И.И.", 1111111, "ivanov@gmail.com",
				Arrays.asList(new Course("Философия"), new Course("Математика"), new Course("Филология")), 8.0);
		Student student2 = new Student("Петров П.П.", 2222222, "petrov@gmail.com",
				Arrays.asList(new Course("Химия"), new Course("Математика"), new Course("Биология")), 8.5);

		student1.displayMemberDetails();
		student2.displayMemberDetails();
		System.out.println();

		student1.addCourse(new Course("Иностранный язык"));
		student1.displayMemberDetails();
		System.out.println();
		
		Faculty faculty1 = new Faculty("Фёдоров Ф.Ф.", 3333333, "fedorov@gmail.com", "Высшая математика",
				Arrays.asList(new Course("Теория вероятности"), new Course("Ввведение в математический анализ")));
		Faculty faculty2 = new Faculty("Курочкин К.К.", 4444444, "fedorov@gmail.com", "Филологии",
				Arrays.asList(new Course("Иностранный язык"), new Course("Литература")));
		
		faculty1.displayMemberDetails();
		System.out.println();
		
		MathResearch mathResearch = new MathResearch(faculty1, List.of(student1, student2));
		mathResearch.conductResearch();
		mathResearch.getFacultyInfo();
		mathResearch.getStudentInfo();
	}

}
