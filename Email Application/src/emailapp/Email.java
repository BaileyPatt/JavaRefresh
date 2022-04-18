package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private String email;
	private int mailboxCapacity;

	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);

		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	}

	private String setDepartment() {
		System.out.println(
				"Department Codes\n1 For Sales\n2 For Development\n3 For Accounting\n0 For None\nEnter your Department Code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Development";
		} else if (depChoice == 3) {
			return "Accounting";
		} else {
			return "No Department";
		}
	}

	private String randomPassword(int length) {
		String passwordSet = "BaileyPatt";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}

		return new String(password);
	}

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;

	}

	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\nCompany Email: " + email + "\nMAILBOX CAPACITY: "
				+ mailboxCapacity + "mb";
	}

}
