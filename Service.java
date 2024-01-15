package Project;

import java.util.Scanner;

public class Service implements IHotel{
	private String serviceID;
	private String serviceName;
	private String serviceType;
	private String isActive;
	private double unitPrice;
	private int number_of_service;
	private int time_of_used;
	private String location;
	private int rating;
	private int point;
	private String contact_information;

	Scanner sc = new Scanner(System.in);

	public Service() {
		super();
	}

	public Service(String serviceID, String serviceName, String serviceType, String isActive, double unitPrice,
			int number_of_service, int time_of_used, String location, int rating, int point,
			String contact_information) {
		super();
		this.serviceID = serviceID;
		this.serviceName = serviceName;
		this.serviceType = serviceType;
		this.isActive = isActive;
		this.unitPrice = unitPrice;
		this.number_of_service = number_of_service;
		this.time_of_used = time_of_used;
		this.location = location;
		this.rating = rating;
		this.point = point;
		this.contact_information = contact_information;
	}

	public String getServiceID() {
		return serviceID;
	}

	public void setServiceID(String serviceID) {
		this.serviceID = serviceID;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getNumber_of_service() {
		return number_of_service;
	}

	public void setNumber_of_service(int number_of_service) {
		this.number_of_service = number_of_service;
	}

	public int getTime_of_used() {
		return time_of_used;
	}

	public void setTime_of_used(int time_of_used) {
		this.time_of_used = time_of_used;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getContact_information() {
		return contact_information;
	}

	public void setContact_information(String contact_information) {
		this.contact_information = contact_information;
	}

	@Override
	public double calculate_discount() {
		double dis = 0;
		if (this.number_of_service >= 3 && this.time_of_used >= 3 && this.point > 200) {
			dis = this.unitPrice * 0.25;
		} else if (this.time_of_used >= 3 && this.point > 100) {
			dis = this.unitPrice * 0.15;
		} else if (this.point > 100) {
			dis = this.unitPrice * 0.1;
		}
		return dis;
	}

	@Override
	public double calculate_tax() {
		return this.unitPrice * 0.05;
	}

	public double calculate_price() {
		return (this.unitPrice * this.number_of_service * this.time_of_used) + calculate_tax() - calculate_discount();
	}

	public void input_service() {
		System.out.print("\nEnter service ID: ");
		this.serviceID = sc.nextLine();
		System.out.print("Enter service name: ");
		this.serviceName = sc.nextLine();
		System.out.print("Enter service type (VIP/Normal): ");
		this.serviceType = sc.nextLine();
		System.out.print("Enter is active: ");
		this.isActive = sc.nextLine();
		System.out.print("Enter unit price: ");
		this.unitPrice = sc.nextDouble();
		System.out.print("Enter number of service: ");
		this.number_of_service = sc.nextInt();
		System.out.print("Enter time of used: ");
		this.time_of_used = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter location: ");
		this.location = sc.nextLine();
		System.out.print("Enter rating (1->5): ");
		this.rating = sc.nextInt();
		System.out.print("Enter point: ");
		this.point = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter contact information: ");
		this.contact_information = sc.nextLine();
	}

	public void output_service() {
		System.out.format("\n%-15s%-18s%-18s%-15s%-15.2f%-22d%-20d%-15s%-15d%-12d%-22s%-20.2f%-20.2f%-20.2f", serviceID,
				serviceName, serviceType, isActive, unitPrice, number_of_service, time_of_used, location, rating, point,
				contact_information, calculate_discount(), calculate_tax(), calculate_price());
	}
}
