package Project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
	private String name;
	private Date date_Of_Birth;
	private String gender;
	private String address;
	private String hometown;
	private String phoneNumber;
	private String email;
	private String religion;
	
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat df  = new SimpleDateFormat("dd-MM-yyyy");
		
	public Person() {
		super();
	}

	public Person(String name, Date date_Of_Birth, String gender, String address, String hometown, String phoneNumber,
			String email, String religion) {
		super();
		this.name = name;
		this.date_Of_Birth = date_Of_Birth;
		this.gender = gender;
		this.address = address;
		this.hometown = hometown;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.religion = religion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_Of_Birth() {
		return df.format(date_Of_Birth);
	}

	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public void input() {
		System.out.print("\nEnter full name: ");
		this.name = sc.nextLine();
		try {
			System.out.print("Enter date of birth (dd-mm-yyyy): ");
			this.date_Of_Birth = df.parse(sc.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("Enter your address: ");
		this.address = sc.nextLine();
		System.out.print("Enter your gender: ");
		this.gender = sc.nextLine();
		System.out.print("Enter your hometown: ");
		this.hometown = sc.nextLine();
		System.out.print("Enter your phone number: ");
		this.phoneNumber = sc.nextLine();
		System.out.print("Enter your Email: ");
		this.email = sc.nextLine();
		System.out.print("Enter your religion: ");
		this.religion = sc.nextLine();

	}

	public void output() {
		System.out.format("\n%-18s%-17s%-12s%-12s%-12s%-15s%-20s%-12s", name, df.format(date_Of_Birth), gender, address, hometown,
				phoneNumber, email, religion);
	}
}
