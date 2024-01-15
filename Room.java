package Project;

import java.util.Scanner;

public abstract class Room implements IHotel{
	private String roomType;
	private double Area;
	private String status;
	private int capacity;
	private int floorLevel;
	private String view;
	private String check_in_time;
	private String check_out_time;
	private String notes;
	Scanner sc = new Scanner(System.in);

	public Room() {
		super();
	}

	public Room(String roomType, double area, String status, int capacity, int floorLevel, String view,
			String check_in_time, String check_out_time, String notes) {
		super();
		this.roomType = roomType;
		this.Area = area;
		this.status = status;
		this.capacity = capacity;
		this.floorLevel = floorLevel;
		this.view = view;
		this.check_in_time = check_in_time;
		this.check_out_time = check_out_time;
		this.notes = notes;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getArea() {
		return Area;
	}

	public void setArea(double area) {
		Area = area;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFloorLevel() {
		return floorLevel;
	}

	public void setFloorLevel(int floorLevel) {
		this.floorLevel = floorLevel;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getCheck_in_time() {
		return check_in_time;
	}

	public void setCheck_in_time(String check_in_time) {
		this.check_in_time = check_in_time;
	}

	public String getCheck_out_time() {
		return check_out_time;
	}

	public void setCheck_out_time(String check_out_time) {
		this.check_out_time = check_out_time;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void input() {
		System.out.print("\nEnter room type (VIP/Normal): ");
		this.roomType = sc.nextLine();
		System.out.print("Enter area: ");
		this.Area = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter status: ");
		this.status = sc.nextLine();
		System.out.print("Enter capacity: ");
		this.capacity = sc.nextInt();
		System.out.print("Enter floor level: ");
		this.floorLevel = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter view: ");
		this.view = sc.nextLine();
		System.out.print("Enter check in time: ");
		this.check_in_time = sc.nextLine();
		System.out.print("Enter check out time: ");
		this.check_out_time = sc.nextLine();
		System.out.print("Enter notes: ");
		this.notes = sc.nextLine();
	}

	public void output() {
		System.out.format("\n%-12s%-12.2f%-12s%-12d%-15d%-12s%-18s%-18s%-12s", roomType, Area, status, capacity,
				floorLevel, view, check_in_time, check_out_time, notes);
	}

	abstract public double Calculate_pirce();
	
}
