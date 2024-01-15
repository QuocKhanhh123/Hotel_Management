package Project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Hotel_Management {
	ArrayList<Customer> list_Customer = new ArrayList<Customer>();
	ArrayList<Employee> list_Employee = new ArrayList<Employee>();
	ArrayList<RoomVIP> list_RoomVIP = new ArrayList<RoomVIP>();
	ArrayList<RoomNormal> list_RoomNormal = new ArrayList<RoomNormal>();
	ArrayList<Service> list_Services = new ArrayList<Service>();

	Scanner sc = new Scanner(System.in);
	SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

	public void addNew() {
		int select;
		do {
			System.out.println("\n--What list information do you want to add ?--");
			System.out.println("|               1.Customer                   |");
			System.out.println("|               2.Employee                   |");
			System.out.println("|               3.Room VIP                   |");
			System.out.println("|               4.Room Normal                |");
			System.out.println("|               5.Service                    |");
			System.out.println("|               0.Exit                       |");
			System.out.println("----------------------------------------------");
			System.out.print("  Enter your select: ");
			select = sc.nextInt();
			sc.nextLine();

			if (select == 1) {
				Customer customer = new Customer();
				customer.input();
				list_Customer.add(customer);
			} else if (select == 2) {
				Employee employee = new Employee();
				employee.input();
				list_Employee.add(employee);
			} else if (select == 3) {
				RoomVIP roomVIP = new RoomVIP();
				roomVIP.input();
				list_RoomVIP.add(roomVIP);
			} else if (select == 4) {
				RoomNormal roomNormal = new RoomNormal();
				roomNormal.input();
				list_RoomNormal.add(roomNormal);
			} else if (select == 5) {
				Service service = new Service();
				service.input_service();
				list_Services.add(service);
			}

			else if (select != 0) {
				System.out.println("\n  Invalid selection, please re-enter !");
			}
		} while (select != 0);
	}

	public void showList() {
		int select;
		do {
			System.out.println("\n--What list information do you want to display ?--");
			System.out.println("|          1.List Information Customer           |");
			System.out.println("|          2.List Information Employee           |");
			System.out.println("|          3.List Information Room VIP           |");
			System.out.println("|          4.List Information Room Normal        |");
			System.out.println("|          5.List Information Service            |");
			System.out.println("|          0.Exit                                |");
			System.out.println("--------------------------------------------------");
			System.out.print("  Enter your select: ");
			select = sc.nextInt();
			sc.nextLine();
			if (select == 1) {
				System.out.println("\n\t\t\t\tInformation list Customer: \n");
				System.out.format("%-18s%-17s%-12s%-12s%-12s%-15s%-20s%-12s%-12s%-15s%-18s%-18s", "Full Name",
						"Date Of Birth", "Gender", "Address", "Hometown", "Phone Number", "Email", "Religion",
						"Number ID", "Nationality", "Number account", "Advance payment");
				for (Customer customer : list_Customer) {
					customer.output();
				}
				System.out.println();
			} else if (select == 2) {
				System.out.println("\n\t\t\t\tInformation list Employee: \n");
				System.out.format("%-18s%-17s%-12s%-12s%-12s%-15s%-20s%-12s%-15s%-15s%-12s%-12s%-15s%-18s%-18s",
						"Full Name", "Date Of Birth", "Gender", "Address", "Hometown", "Phone Number", "Email",
						"Religion", "Employee ID", "Experience", "Position", "Workday", "Salary basic",
						"Calculate bonus", "Calculate salary");
				for (Employee employee : list_Employee) {
					employee.output();
				}
				System.out.println();
			} else if (select == 3) {
				System.out.println("\n\t\t\t\tInformation list Room VIP: \n");
				System.out.format(
						"%-12s%-12s%-12s%-12s%-15s%-12s%-18s%-18s%-12s%-18s%-23s%-15s%-15s%-20s%-20s%-20s%-20s%-20s",
						"Room type", "Area", "Status", "Capacity", "Floor level", "View", "Check in time",
						"Check out time", "Notes", "ID Room VIP", "Vip manager contact", "Furniture", "Unit price",
						"Number of room", "Number of night", "Calculate discount", "Calculate tax", "Calculate price");
				for (RoomVIP roomVIP : list_RoomVIP) {
					roomVIP.output();
				}
				System.out.println();
			} else if (select == 4) {
				System.out.println("\n\t\t\t\tInformation list Room Normal: \n");
				System.out.format("%-12s%-12s%-12s%-12s%-15s%-12s%-18s%-18s%-12s%-18s%-15s%-20s%-20s%-20s%-20s%-20s",
						"Room type", "Area", "Status", "Capacity", "Floor level", "View", "Check in time",
						"Check out time", "Notes", "ID Room Normal", "Unit price", "Number of room", "Number of night",
						"Calculate discount", "Calculate tax", "Calculate price");
				for (RoomNormal roomNormal : list_RoomNormal) {
					roomNormal.output();
				}
				System.out.println();
			} else if (select == 5) {
				System.out.println("\n\t\t\t\tInformation list Service: \n");
				System.out.format("%-15s%-18s%-18s%-15s%-15s%-22s%-20s%-15s%-15s%-12s%-22s%-20s%-20s%-20s",
						"Service ID", "Service name", "Service type", "Is Active", "Unit price", "Number of service",
						"Time of used", "Location", "Rating", "Point", "Contact information", "Calculate discount",
						"Calculate tax", "Calculate price");
				for (Service service : list_Services) {
					service.output_service();
				}
				System.out.println();
			} else if (select != 0) {
				System.out.println("\n  Invalid selection, please re-enter !");
			}
		} while (select != 0);
	}

	public void find() {
		int select;
		do {
			System.out.println("\n--What list information do you want to find ?--");
			System.out.println("|         1.List Information Customer         |");
			System.out.println("|         2.List Information Employee         |");
			System.out.println("|         3.List Information Room VIP         |");
			System.out.println("|         4.List Information Room Normal      |");
			System.out.println("|         5.List Information Service          |");
			System.out.println("|         0.Exit                              |");
			System.out.println("-----------------------------------------------");
			System.out.print("  Enter your select: ");
			select = sc.nextInt();
			sc.nextLine();

			if (select == 1) {
				System.out.print("\n  Enter ID Customer to find: ");
				String cus = sc.nextLine();
				for (Customer customer : list_Customer) {
					if (customer.getNumberID().equals(cus)) {
						System.out.println("\n\t\t\t\tInformation Customer after find: ");
						System.out.format("%-18s%-17s%-12s%-12s%-12s%-15s%-20s%-12s%-12s%-15s%-18s%-18s", "Full Name",
								"Date Of Birth", "Gender", "Address", "Hometown", "Phone Number", "Email", "Religion",
								"Number ID", "Nationality", "Number account", "Advance payment");
						customer.output();
						System.out.println();
						return;
					}
				}
				System.out.println("\n  Customer with ID " + cus + " not found !");

			} else if (select == 2) {
				System.out.print("\n  Enter ID Employee to find: ");
				String emp = sc.nextLine();
				for (Employee employee : list_Employee) {
					if (employee.getEmployeeID().equals(emp)) {
						System.out.println("\n\t\t\t\tInformation Employee after find: ");
						System.out.format("%-18s%-17s%-12s%-12s%-12s%-15s%-20s%-12s%-15s%-15s%-12s%-12s%-15s%-18s%-18s",
								"Full Name", "Date Of Birth", "Gender", "Address", "Hometown", "Phone Number", "Email",
								"Religion", "Employee ID", "Experience", "Position", "Workday", "Salary basic",
								"Calculate bonus", "Calculate salary");
						employee.output();
						System.out.println();
						return;
					}
				}
				System.out.println("\n  Employee with ID " + emp + " not found !");

			} else if (select == 3) {
				System.out.print("\n  Enter ID Room VIP to find: ");
				String vip = sc.nextLine();
				for (RoomVIP roomVIP : list_RoomVIP) {
					if (roomVIP.getRoomVipID().equals(vip)) {
						System.out.println("\n\t\t\t\tInformation Room VIP after find: ");
						System.out.format(
								"%-12s%-12s%-12s%-12s%-15s%-12s%-18s%-18s%-12s%-18s%-23s%-15s%-15s%-20s%-20s%-20s%-20s%-20s",
								"Room type", "Area", "Status", "Capacity", "Floor level", "View", "Check in time",
								"Check out time", "Notes", "ID Room VIP", "Vip manager contact", "Furniture",
								"Unit price", "Number of room", "Number of night", "Calculate discount",
								"Calculate tax", "Calculate price");
						roomVIP.output();
						System.out.println();
						return;
					}
				}
				System.out.println("\n  Room VIP with ID " + vip + " not found !");

			} else if (select == 4) {
				System.out.print("\n  Enter ID Room Normal to find: ");
				String nor = sc.nextLine();
				for (RoomNormal normal : list_RoomNormal) {
					if (normal.getRoomNormalID().equals(nor)) {
						System.out.println("\n\t\t\t\tInformation Room Normal after find: ");
						System.out.format(
								"%-12s%-12s%-12s%-12s%-15s%-12s%-18s%-18s%-12s%-18s%-15s%-20s%-20s%-20s%-20s%-20s",
								"Room type", "Area", "Status", "Capacity", "Floor level", "View", "Check in time",
								"Check out time", "Notes", "ID Room Normal", "Unit price", "Number of room",
								"Number of night", "Calculate discount", "Calculate tax", "Calculate price");
						normal.output();
						System.out.println();
						return;
					}
				}
				System.out.println("\n  Room Normal with ID " + nor + " not found !");

			} else if (select == 5) {
				System.out.print("\n  Enter ID Service to find: ");
				String ser = sc.nextLine();
				for (Service service : list_Services) {
					if (service.getServiceID().equals(ser)) {
						System.out.println("\n\t\t\t\tInformation Service after find: ");
						System.out.format("%-15s%-18s%-18s%-15s%-15s%-22s%-20s%-15s%-15s%-12s%-22s%-20s%-20s%-20s",
								"Service ID", "Service name", "Service type", "Is Active", "Unit price",
								"Number of service", "Time of used", "Location", "Rating", "Point",
								"Contact information", "Calculate discount", "Calculate tax", "Calculate price");
						service.output_service();
						System.out.println();
						return;
					}
				}
				System.out.println("\n  Service with ID " + ser + " not found !");

			} else if (select != 0) {
				System.out.println("\n  Invalid selection, please re-enter !");
			}
		} while (select != 0);
	}

	public void update() {
		int select;
		do {
			System.out.println("\n--What list information do you want to update ?--");
			System.out.println("|         1.List Information Customer           |");
			System.out.println("|         2.List Information Employee           |");
			System.out.println("|         3.List Information Room VIP           |");
			System.out.println("|         4.List Information Room Normal        |");
			System.out.println("|         5.List Information Service            |");
			System.out.println("|         0.Exit                                |");
			System.out.println("-------------------------------------------------");
			System.out.print("  Enter your select: ");
			select = sc.nextInt();
			sc.nextLine();
			if (select == 1) {
				System.out.print("\n  Enter ID Customer to update: ");
				String cus = sc.nextLine();
				for (Customer customer : list_Customer) {
					if (customer.getNumberID().equals(cus)) {
						System.out.println("\n\t\tEnter Customer information to update: ");
						customer.input();
						System.out.println("\n  Update successfull !\n");
						return;
					}
				}
				System.out.println("\n  Customer with ID " + cus + " not found !");

			} else if (select == 2) {
				System.out.print("\n  Enter ID Employee to update: ");
				String emp = sc.nextLine();
				for (Employee employee : list_Employee) {
					if (employee.getEmployeeID().equals(emp)) {
						System.out.println("\n\t\tEnter Employee information to update: ");
						employee.input();
						System.out.println("\n  Update successfull !\n");
						return;
					}
				}
				System.out.println("\n  Employee with ID " + emp + " not found !");

			} else if (select == 3) {
				System.out.print("\n  Enter ID Room VIP to update: ");
				String vip = sc.nextLine();
				for (RoomVIP roomVIP : list_RoomVIP) {
					if (roomVIP.getRoomVipID().equals(vip)) {
						System.out.println("\n\t\tEnter information Room VIP to update: ");
						roomVIP.input();
						System.out.println("\n  Update successfull !\n");
						return;
					}
				}
				System.out.println("\n  Room VIP with ID " + vip + " not found !");

			} else if (select == 4) {
				System.out.print("\n  Enter ID Room Normal to update: ");
				String nor = sc.nextLine();
				for (RoomNormal normal : list_RoomNormal) {
					if (normal.getRoomNormalID().equals(nor)) {
						System.out.println("\n\t\tEnter information Room Normal to update: ");
						normal.input();
						System.out.println("\n  Update successfull !\n");
						return;
					}
				}
				System.out.println("\n  Room Normal with ID " + nor + " not found !");

			} else if (select == 5) {
				System.out.print("  Enter ID Service to update: ");
				String ser = sc.nextLine();
				for (Service service : list_Services) {
					if (service.getServiceID().equals(ser)) {
						System.out.println("\n\t\tEnter information Service to update: ");
						service.input_service();
						System.out.println("\n  Update successfull !\n");
						return;
					}
				}
				System.out.println("\n  Service with ID " + ser + " not found !");

			} else if (select != 0) {
				System.out.println("\n  Invalid selection, please re-enter !");
			}
		} while (select != 0);
	}

	public void delete() {
		int select;
		do {
			System.out.println("\n--What list information do you want to delete ?--");
			System.out.println("|         1.List Information Customer           |");
			System.out.println("|         2.List Information Employee           |");
			System.out.println("|         3.List Information Room VIP           |");
			System.out.println("|         4.List Information Room Normal        |");
			System.out.println("|         5.List Information Service            |");
			System.out.println("|         0.Exit                                |");
			System.out.println("-------------------------------------------------");
			System.out.print("  Enter your select: ");
			select = sc.nextInt();
			sc.nextLine();
			if (select == 1) {
				System.out.print("\n  Enter ID Customer to delete: ");
				String cus = sc.nextLine();
				for (Customer customer : list_Customer) {
					if (customer.getNumberID().equals(cus)) {
						list_Customer.remove(customer);
						System.out.println("\n  Delete Customer with ID " + cus + " successfull !");
						return;
					}
				}
				System.out.println("\n  Customer with ID " + cus + " not found !");

			} else if (select == 2) {
				System.out.print("\n  Enter ID Employee to delete: ");
				String emp = sc.nextLine();
				for (Employee employee : list_Employee) {
					if (employee.getEmployeeID().equals(emp)) {
						System.out.println("\n  Delete Employee with ID " + emp + " successfull !");
						list_Employee.remove(employee);
						return;
					}
				}
				System.out.println("\n  Employee with ID " + emp + " not found !");

			} else if (select == 3) {
				System.out.print("\n  Enter ID Room VIP to delete: ");
				String vip = sc.nextLine();
				for (RoomVIP roomVIP : list_RoomVIP) {
					if (roomVIP.getRoomVipID().equals(vip)) {
						System.out.println("\n  Delete Room VIP with ID " + vip + " successfull !");
						list_RoomVIP.remove(roomVIP);
						return;
					}
				}
				System.out.println("\n  Room VIP with ID " + vip + " not found !");

			} else if (select == 4) {
				System.out.print("\n  Enter ID Room Normal to delete: ");
				String nor = sc.nextLine();
				for (RoomNormal normal : list_RoomNormal) {
					if (normal.getRoomNormalID().equals(nor)) {
						System.out.println("\n  Delete Room Normal with ID " + nor + " successfull !");
						list_RoomNormal.remove(normal);
						return;
					}
				}
				System.out.println("\n  Room Normal with ID " + nor + " not found !");

			} else if (select == 5) {
				System.out.print("\n  Enter ID Service to delete: ");
				String ser = sc.nextLine();
				for (Service service : list_Services) {
					if (service.getServiceID().equals(ser)) {
						System.out.println("\n  Delete Service with ID " + ser + " successfull !");
						list_Services.remove(service);
						return;
					}
				}
				System.out.println("\n  Service with ID " + ser + " not found !");

			} else if (select != 0) {
				System.out.println("\n  Invalid selection, please re-enter !");
			}
		} while (select != 0);
	}

	public void sort() {
		int select;
		do {
			System.out.println("\n--What list information do you want to sort ?--");
			System.out.println("|       1.List Information Customer           |");
			System.out.println("|       2.List Information Employee           |");
			System.out.println("|       3.List Information Room VIP           |");
			System.out.println("|       4.List Information Room Normal        |");
			System.out.println("|       5.List Information Service            |");
			System.out.println("|       0.Exit                                |");
			System.out.println("-----------------------------------------------");
			System.out.print("  Enter your select: ");
			select = sc.nextInt();
			sc.nextLine();

			if (select == 1) {
				Collections.sort(list_Customer, Comparator.comparing(Customer::getNumberID));
				System.out.println("\n  Sort successfull !");
			} else if (select == 2) {
				list_Employee.sort(((o1, o2) -> Double.compare(o1.calculate_salary(), o2.calculate_salary())));
				System.out.println("\n  Sort successfull !");
			} else if (select == 3) {
				list_RoomVIP.sort(((o1, o2) -> Double.compare(o1.Calculate_pirce(), o2.Calculate_pirce())));
				System.out.println("\n  Sort successfull !");
			} else if (select == 4) {
				list_RoomNormal.sort(((o1, o2) -> Double.compare(o1.Calculate_pirce(), o2.Calculate_pirce())));
				System.out.println("\n  Sort successfull !");
			} else if (select == 5) {
				list_Services.sort(((o1, o2) -> Double.compare(o1.calculate_price(), o2.calculate_price())));
				System.out.println("\n  Sort successfull !");
			} else if (select != 0) {
				System.out.println("\n  Invalid selection, please re-enter !");
			}
		} while (select != 0);
	}

	public void total_salary_employee() {
		double total = 0;
		for (Employee employee : list_Employee) {
			total += employee.calculate_salary();
		}
		System.out.println("\n  Total salary of all employees: " + total);
	}

	public void total_price_reservation() {
		double total_VIP = 0;
		double total_Normal = 0;
		int choice;
		do {
			System.out.println("\n--Which room charge do you want to calculate ?--");
			System.out.println("|                1.Room VIP                    |");
			System.out.println("|                2.Room Normal                 |");
			System.out.println("|                0.Exit                        |");
			System.out.println("------------------------------------------------");
			System.out.print("  Enter your select: ");
			choice = sc.nextInt();
			if (choice == 1) {
				for (RoomVIP vip : list_RoomVIP) {
					total_VIP += vip.Calculate_pirce();
				}
				System.out.println("\n  Total price of Room VIP: " + total_VIP);
			} else if (choice == 2) {
				for (RoomNormal normal : list_RoomNormal) {
					total_Normal += normal.Calculate_pirce();
				}
				System.out.println("\n  Total price of Room Normal: " + total_Normal);
			} else if (choice != 0) {
				System.out.println("\n  Invalid selection, please re-enter !");
			}
		} while (choice != 0);

	}

	public void total_service() {
		double total = 0;
		for (Service service : list_Services) {
			total += service.calculate_price();
		}
		System.out.println("\n  Total price of all service: " + total);
	}

	public void writeFile() {
		int select;
		do {
			System.out.println("\n--What list information do you want write to file ?--");
			System.out.println("|           1.List Information Customer             |");
			System.out.println("|           2.List Information Employee             |");
			System.out.println("|           3.List Information Room VIP             |");
			System.out.println("|           4.List Information Room Normal          |");
			System.out.println("|           5.List Information Service              |");
			System.out.println("|           0.Exit                                  |");
			System.out.println("-----------------------------------------------------");
			System.out.print("  Enter your select: ");
			select = sc.nextInt();
			sc.nextLine();

			if (select == 1) {
				try {
					FileWriter fw = new FileWriter("src\\customer_info.txt");
					BufferedWriter bw = new BufferedWriter(fw);
					Formatter fm = new Formatter(bw);
					bw.write("\t\t\t\tInformation list Customer: \n");
					fm.format("%-18s%-17s%-12s%-12s%-12s%-15s%-20s%-12s%-12s%-15s%-18s%-18s", "Full Name",
							"Date Of Birth", "Gender", "Address", "Hometown", "Phone Number", "Email", "Religion",
							"Number ID", "Nationality", "Number account", "Advance payment");
					for (Customer customer : list_Customer) {
						fm.format("\n%-18s%-17s%-12s%-12s%-12s%-15s%-20s%-12s%-12s%-15s%-18s%-18s", customer.getName(),
								customer.getDate_Of_Birth(), customer.getGender(), customer.getAddress(),
								customer.getHometown(), customer.getPhoneNumber(), customer.getEmail(),
								customer.getReligion(), customer.getNumberID(), customer.getNationality(),
								customer.getNumberAccount(), customer.getAdvance_Payment());
					}
					fm.close();
					bw.close();
					fw.close();
					System.out.println("\n  Write to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (select == 2) {
				try {
					FileWriter fw = new FileWriter("src\\employee_info.txt");
					BufferedWriter bw = new BufferedWriter(fw);
					Formatter fm = new Formatter(bw);
					bw.write("\t\t\t\t\tInformation list Employee: \n");
					fm.format("%-18s%-17s%-12s%-12s%-12s%-15s%-20s%-12s%-15s%-15s%-12s%-12s%-15s%-18s%-18s",
							"Full Name", "Date Of Birth", "Gender", "Address", "Hometown", "Phone Number", "Email",
							"Religion", "Employee ID", "Experience", "Position", "Workday", "Salary basic",
							"Calculate bonus", "Calculate salary");
					for (Employee employee : list_Employee) {
						fm.format("\n%-18s%-17s%-12s%-12s%-12s%-15s%-20s%-12s%-15s%-15d%-12s%-12d%-15.2f%-18.2f%-18.2f",
								employee.getName(), employee.getDate_Of_Birth(), employee.getGender(),
								employee.getAddress(), employee.getHometown(), employee.getPhoneNumber(),
								employee.getEmail(), employee.getReligion(), employee.getEmployeeID(),
								employee.getExperience(), employee.getPosition(), employee.getWorkday(),
								employee.getSalaryBasic(), employee.calculate_bonus(), employee.calculate_salary());
					}
					fm.close();
					bw.close();
					fw.close();
					System.out.println("\n  Write to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (select == 3) {
				try {
					FileWriter fw = new FileWriter("src\\roomVIP_info.txt");
					BufferedWriter bw = new BufferedWriter(fw);
					Formatter fm = new Formatter(bw);
					bw.write("\t\t\t\tInformation list Room VIP: \n");
					fm.format(
							"%-12s%-12s%-12s%-12s%-15s%-12s%-18s%-18s%-12s%-18s%-23s%-15s%-15s%-20s%-20s%-20s%-20s%-20s",
							"Room type", "Area", "Status", "Capacity", "Floor level", "View", "Check in time",
							"Check out time", "Notes", "ID Room VIP", "Vip manager contact", "Furniture", "Unit price",
							"Number of room", "Number of night", "Calculate discount", "Calculate tax",
							"Calculate price");
					for (RoomVIP roomVIP : list_RoomVIP) {
						fm.format(
								"\n%-12s%-12.2f%-12s%-12d%-15d%-12s%-18s%-18s%-12s%-18s%-23s%-15s%-15.2f%-20d%-20d%-20.2f%-20.2f%-20.2f",
								roomVIP.getRoomType(), roomVIP.getArea(), roomVIP.getStatus(), roomVIP.getCapacity(),
								roomVIP.getFloorLevel(), roomVIP.getView(), roomVIP.getCheck_in_time(),
								roomVIP.getCheck_out_time(), roomVIP.getNotes(), roomVIP.getRoomVipID(),
								roomVIP.getVip_manager_contact(), roomVIP.getFurniture(), roomVIP.getUnitPrice(),
								roomVIP.getNumber_of_room(), roomVIP.getNumber_of_day(), roomVIP.calculate_discount(),
								roomVIP.calculate_tax(), roomVIP.Calculate_pirce());
					}
					fm.close();
					bw.close();
					fw.close();
					System.out.println("\n  Write to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (select == 4) {
				try {
					FileWriter fw = new FileWriter("src\\roomNormal_info.txt");
					BufferedWriter bw = new BufferedWriter(fw);
					Formatter fm = new Formatter(bw);
					bw.write("\t\t\t\t\tInformation list Room Normal: \n");
					fm.format("%-12s%-12s%-12s%-12s%-15s%-12s%-18s%-18s%-12s%-18s%-15s%-20s%-20s%-20s%-20s%-20s",
							"Room type", "Area", "Status", "Capacity", "Floor level", "View", "Check in time",
							"Check out time", "Notes", "ID Room Normal", "Unit price", "Number of room",
							"Number of night", "Calculate discount", "Calculate tax", "Calculate price");
					for (RoomNormal roomNormal : list_RoomNormal) {
						fm.format(
								"\n%-12s%-12.2f%-12s%-12d%-15d%-12s%-18s%-18s%-12s%-18s%-15.2f%-20.2f%-20.2f%-20.2f%-20.2f%-20.2f",
								roomNormal.getRoomType(), roomNormal.getArea(), roomNormal.getStatus(),
								roomNormal.getCapacity(), roomNormal.getFloorLevel(), roomNormal.getView(),
								roomNormal.getCheck_in_time(), roomNormal.getCheck_out_time(), roomNormal.getNotes(),
								roomNormal.getRoomNormalID(), roomNormal.getUnitPrice(), roomNormal.getNumber_of_room(),
								roomNormal.getNumber_of_days(), roomNormal.calculate_discount(),
								roomNormal.calculate_tax(), roomNormal.Calculate_pirce());
					}
					fm.close();
					bw.close();
					fw.close();
					System.out.println("\n  Write to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (select == 5) {
				try {
					FileWriter fw = new FileWriter("src\\Service_info.txt");
					BufferedWriter bw = new BufferedWriter(fw);
					Formatter fm = new Formatter(bw);
					bw.write("\t\t\t\tInformation list Service: \n");
					fm.format("%-15s%-18s%-18s%-15s%-15s%-22s%-20s%-15s%-15s%-12s%-22s%-20s%-20s%-20s", "Service ID",
							"Service name", "Service type", "Is Active", "Unit price", "Number of service",
							"Time of used", "Location", "Rating", "Point", "Contact information", "Calculate discount",
							"Calculate tax", "Calculate price");
					for (Service service : list_Services) {
						fm.format("\n%-15s%-18s%-18s%-15s%-15.2f%-22d%-20d%-15s%-15d%-12d%-22s%-20.2f%-20.2f%-20.2f",
								service.getServiceID(), service.getServiceName(), service.getServiceType(),
								service.getIsActive(), service.getUnitPrice(), service.getNumber_of_service(),
								service.getTime_of_used(), service.getLocation(), service.getRating(),
								service.getPoint(), service.getContact_information(), service.calculate_discount(),
								service.calculate_tax(), service.calculate_price());
					}
					fm.close();
					bw.close();
					fw.close();
					System.out.println("\n  Write to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (select != 0) {
				System.out.println("\n  Invalid selection, please re-enter !");
			}
		} while (select != 0);
	}

	public void readFile() {
		int select;
		do {
			System.out.println("\n--What list information do you want read to file ?--");
			System.out.println("|          1.List Information Customer             |");
			System.out.println("|          2.List Information Employee             |");
			System.out.println("|          3.List Information Room VIP             |");
			System.out.println("|          4.List Information Room Normal          |");
			System.out.println("|          5.List Information Service              |");
			System.out.println("|          0.Exit                                  |");
			System.out.println("----------------------------------------------------");
			System.out.print("  Enter your select: ");
			select = sc.nextInt();
			sc.nextLine();

			if (select == 1) {
				list_Customer.clear();
				try {
					FileReader fr = new FileReader("src\\customer_info.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = "";
					int lineCount = 0;
					System.out.println();
					while ((line = br.readLine()) != null) {
						if (lineCount < 2) {
							lineCount++;
							continue;
						}
						String str[] = line.split("\\s{2,}");
						Date date = df.parse(str[1]);
						Customer cus = new Customer(str[0], date, str[2], str[3], str[4], str[5], str[6], str[7],
								str[8], str[9], str[10], Double.parseDouble(str[11]));
						list_Customer.add(cus);
					}
					br.close();
					fr.close();
					System.out.println("  Read to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (select == 2) {
				list_Employee.clear();
				try {
					FileReader fr = new FileReader("src\\employee_info.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = "";
					int lineCount = 0;
					System.out.println();
					while ((line = br.readLine()) != null) {
						if (lineCount < 2) {
							lineCount++;
							continue;
						}
						String str[] = line.split("\\s{2,}");
						Date date = df.parse(str[1]);
						Employee emp = new Employee(str[0], date, str[2], str[3], str[4], str[5], str[6], str[7],
								str[8], Integer.parseInt(str[9]), str[10], Integer.parseInt(str[11]),
								Double.parseDouble(str[12]));
						list_Employee.add(emp);

					}
					br.close();
					fr.close();
					System.out.println("  Read to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (select == 3) {
				list_RoomVIP.clear();
				try {
					FileReader fr = new FileReader("src\\roomVIP_info.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = "";
					int lineCount = 0;
					System.out.println();
					while ((line = br.readLine()) != null) {
						if (lineCount < 2) {
							lineCount++;
							continue;
						}
						String str[] = line.split("\\s{2,}");
						RoomVIP roomVIP = new RoomVIP(str[0], Double.parseDouble(str[1]), str[2],
								Integer.parseInt(str[3]), Integer.parseInt(str[4]), str[5], str[6], str[7], str[8],
								str[9], str[9], str[11], Double.parseDouble(str[12]), Integer.parseInt(str[13]),
								Integer.parseInt(str[14]));
						list_RoomVIP.add(roomVIP);

					}
					br.close();
					fr.close();
					System.out.println("  Read to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (select == 4) {
				list_RoomNormal.clear();
				try {
					FileReader fr = new FileReader("src\\roomNormal_info.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = "";
					int lineCount = 0;
					System.out.println();
					while ((line = br.readLine()) != null) {
						if (lineCount < 2) {
							lineCount++;
							continue;
						}
						String str[] = line.split("\\s{2,}");
						RoomNormal roomNormal = new RoomNormal(str[0], Double.parseDouble(str[1]), str[2],
								Integer.parseInt(str[3]), Integer.parseInt(str[4]), str[5], str[6], str[7], str[8],
								str[9], Double.parseDouble(str[10]), Double.parseDouble(str[11]),
								Double.parseDouble(str[12]));
						list_RoomNormal.add(roomNormal);

					}
					br.close();
					fr.close();
					System.out.println("  Read to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (select == 5) {
				list_Services.clear();
				try {
					FileReader fr = new FileReader("src\\Service_info.txt");
					BufferedReader br = new BufferedReader(fr);
					String line = "";
					int lineCount = 0;
					System.out.println();
					while ((line = br.readLine()) != null) {
						if (lineCount < 2) {
							lineCount++;
							continue;
						}
						String str[] = line.split("\\s{2,}");
						if (str.length >= 11) {
							Service service = new Service(str[0], str[1], str[2], str[3], Double.parseDouble(str[4]),
									Integer.parseInt(str[5]), Integer.parseInt(str[6]), str[7],
									Integer.parseInt(str[8]), Integer.parseInt(str[9]), str[10]);
							list_Services.add(service);
						}

					}
					br.close();
					fr.close();
					System.out.println("  Read to file successfull !");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			else if (select != 0) {
				System.out.println("\n  Invalid selection, please re-enter !");
			}

		} while (select != 0);
	}

	public void Menu() {
		int choice;
		do {
			System.out.println("\n------------------MENU------------------");
			System.out.println("|       1.Add new information          |");
			System.out.println("|       2.Show list information        |");
			System.out.println("|       3.Find information             |");
			System.out.println("|       4.Update information           |");
			System.out.println("|       5.Delete by ID                 |");
			System.out.println("|       6.Sort list                    |");
			System.out.println("|       7.Total salary employee        |");
			System.out.println("|       8.Total price reservation      |");
			System.out.println("|       9.Total price service          |");
			System.out.println("|       10.Write Filed                 |");
			System.out.println("|       11.Read Filed                  |");
			System.out.println("|       0.Exit                         |");
			System.out.println("----------------------------------------");
			System.out.print("  Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				addNew();
				break;
			case 2:
				showList();
				break;
			case 3:
				find();
				break;
			case 4:
				update();
				break;
			case 5:
				delete();
				break;
			case 6:
				sort();
				break;
			case 7:
				total_salary_employee();
				break;
			case 8:
				total_price_reservation();
				break;
			case 9:
				total_service();
				break;
			case 10:
				writeFile();
				break;
			case 11:
				readFile();
				break;
			case 0:
				break;
			default:
				System.out.println("\n  Invalid selection, please re-enter !");
			}
		} while (choice != 0);
	}
}
