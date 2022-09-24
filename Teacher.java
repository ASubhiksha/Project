package entity;

import java.util.Scanner;

public class Teacher extends Person implements PersonOperation {

	public int Class = 0;
	public char Section = ' ';
	public int Standard = 0;
	public char section = ' ';
	public String subject = " ";
	public int salary = 0;

	public void insert() {
		super.insert();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Teacher class:");
		Standard = scanner.nextInt();

		System.out.println("Enter Teacher section:");
		section = scanner.next().charAt(0);

		System.out.println("Enter Teacher Subject:");
		subject = scanner.next();

		System.out.println("Enter Teacher salary:");
		salary = scanner.nextInt();

	}

	public void display() {
		super.display();
		System.out.println("Teacher class:" + Standard + "\nsection " + section + "\nHandling subject:" + subject
				+ "\nSalary:" + salary);

	}

	public void searchByStandardSection(Teacher[] arr2, int Standard, char section, int totalteac,
			Teacher[] returnarr) {

		int matchedcount = 0;

		for (int i = 0, j = 0; i < totalteac; i++) {

			if (arr2[i].Standard == Standard && arr2[i].section == section) {

				returnarr[matchedcount] = arr2[i];
			}

		}

	}

	public void searchBysubject(Teacher[] arr2, String subject, int totalteac,Teacher[] returnarr) {

		
		int matchedcount = 0;

		for (int i = 0, j = 0; i < totalteac; i++) {

			if (arr2[i].subject.equals(subject)) {

				returnarr[matchedcount] = arr2[i];
			}

		}
		

	}

	public void displayarr(Teacher[] arr2, int totalteac) {
		boolean isRecordPresent = false;
		for (int i = 0; i < totalteac; i++) {

			if (arr2[i] != null) {
				isRecordPresent = true;
				arr2[i].display();
				System.out.println("**********   ***********");
			}
		}
		if (isRecordPresent == false) {
			System.out.println("No record Found");
			System.out.println("**********   ***********");
		}
	}

}
