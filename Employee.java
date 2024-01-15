package Project;

import java.util.Date;

public class Employee extends Person {
	private String employeeID;
	private int experience;
	private String position;
	private int workday;
	private double salaryBasic;

	public Employee() {
		super();
	}

	public Employee(String employeeID, int experience, String position, int workday, double salaryBasic) {
		super();
		this.employeeID = employeeID;
		this.experience = experience;
		this.position = position;
		this.workday = workday;
		this.salaryBasic = salaryBasic;
	}

	public Employee(String name, Date date_Of_Birth, String gender, String address, String hometown,
			String phoneNumber, String email, String religion, String employeeID, int experience, String position,
			int workday, double salaryBasic) {
		super(name, date_Of_Birth, gender, address, hometown, phoneNumber, email, religion);
		this.employeeID = employeeID;
		this.experience = experience;
		this.position = position;
		this.workday = workday;
		this.salaryBasic = salaryBasic;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getWorkday() {
		return workday;
	}

	public void setWorkday(int workday) {
		this.workday = workday;
	}

	public double getSalaryBasic() {
		return salaryBasic;
	}

	public void setSalaryBasic(double salaryBasic) {
		this.salaryBasic = salaryBasic;
	}

	public void input() {
		super.input();
		System.out.print("Enter employee ID: ");
		this.employeeID = sc.nextLine();
		System.out.print("Enter experience: ");
		this.experience = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter position: ");
		this.position = sc.nextLine();
		System.out.print("Enter workday: ");
		this.workday = sc.nextInt();
		System.out.print("Enter salary basic: ");
		this.salaryBasic = sc.nextDouble();
		sc.nextLine();
	}

	public void output() {
		super.output();
		System.out.format("%-15s%-15d%-12s%-12d%-15.2f%-18.2f%-18.2f", employeeID, experience, position, workday,
				salaryBasic, calculate_bonus(), calculate_salary());
	}

	public double calculate_salary() {
		if (this.experience >= 3) {
			return this.salaryBasic + (this.salaryBasic * 2.6) + calculate_bonus();
		} else {
			return this.salaryBasic + (this.salaryBasic * 1.8) + calculate_bonus();
		}
	}

	public double calculate_bonus() {
		if (this.workday >= 28) {
			return 500000;
		}
		return 0;
	}
}
