package Project;

import java.util.Date;

public class Customer extends Person {
	private String numberID;
	private String nationality;
	private String numberAccount;
	private double advance_Payment;

	public Customer() {
		super();
	}
		
	public Customer(String numberID, String nationality, String numberAccount, double advance_Payment) {
		super();
		this.numberID = numberID;
		this.nationality = nationality;
		this.numberAccount = numberAccount;
		this.advance_Payment = advance_Payment;
	}

	public Customer(String name, Date date_Of_Birth, String gender, String address, String hometown,
			String phoneNumber, String email, String religion, String numberID, String nationality,
			String numberAccount, double advance_Payment) {
		super(name, date_Of_Birth, gender, address, hometown, phoneNumber, email, religion);
		this.numberID = numberID;
		this.nationality = nationality;
		this.numberAccount = numberAccount;
		this.advance_Payment = advance_Payment;
	}

	public String getNumberID() {
		return numberID;
	}

	public void setNumberID(String numberID) {
		this.numberID = numberID;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(String numberAccount) {
		this.numberAccount = numberAccount;
	}

	public double getAdvance_Payment() {
		return advance_Payment;
	}

	public void setAdvance_Payment(double advance_Payment) {
		this.advance_Payment = advance_Payment;
	}

	public void input() {
		super.input();
		System.out.print("Enter your number ID: ");
		this.numberID = sc.nextLine();
		System.out.print("Enter your nationality: ");
		this.nationality = sc.nextLine();
		System.out.print("Enter number account: ");
		this.numberAccount = sc.nextLine();
		System.out.print("Enter advance payment: ");
		this.advance_Payment = sc.nextDouble();
		sc.nextLine();
	}

	public void output() {
		super.output();
		System.out.format("%-12s%-15s%-18s%-18.2f", numberID, nationality, numberAccount, advance_Payment);
	}
}
