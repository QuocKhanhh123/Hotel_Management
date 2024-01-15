package Project;

public class RoomNormal extends Room {
	private String roomNormalID;
	private double unitPrice;
	private double number_of_room;
	private double number_of_days;

	public RoomNormal() {
		super();
	}

	public RoomNormal(String roomNormalID, double unitPrice, double number_of_room, double number_of_days) {
		super();
		this.roomNormalID = roomNormalID;
		this.unitPrice = unitPrice;
		this.number_of_room = number_of_room;
		this.number_of_days = number_of_days;
	}

	public RoomNormal(String roomType, double Area, String status, int capacity, int floorLevel, String view,
			String check_in_time, String check_out_time, String notes, String roomNormalID, double unitPrice,
			double number_of_room, double number_of_days) {
		super(roomType, Area, status, capacity, floorLevel, view, check_in_time, check_out_time, notes);
		this.roomNormalID = roomNormalID;
		this.unitPrice = unitPrice;
		this.number_of_room = number_of_room;
		this.number_of_days = number_of_days;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getNumber_of_room() {
		return number_of_room;
	}

	public void setNumber_of_room(double number_of_room) {
		this.number_of_room = number_of_room;
	}

	public double getNumber_of_days() {
		return number_of_days;
	}

	public void setNumber_of_days(double number_of_days) {
		this.number_of_days = number_of_days;
	}

	public String getRoomNormalID() {
		return roomNormalID;
	}

	public void setRoomNormalID(String roomNormalID) {
		this.roomNormalID = roomNormalID;
	}

	@Override
	public double calculate_discount() {
		if (this.number_of_days >= 3 && this.number_of_room >= 2) {
			return this.unitPrice * 0.30;
		} else if (this.number_of_room > 2) {
			return this.unitPrice * 0.15;

		}
		return 0;
	}

	@Override
	public double calculate_tax() {
		return this.unitPrice * 0.05;
	}

	@Override
	public double Calculate_pirce() {
		return (this.unitPrice * this.number_of_days * this.number_of_room) + calculate_tax() - calculate_discount();
	}

	public void input() {
		super.input();
		System.out.print("Enter ID room normal: ");
		this.roomNormalID = sc.nextLine();
		System.out.print("Enter unit price: ");
		this.unitPrice = sc.nextDouble();
		System.out.print("Enter number of room: ");
		this.number_of_room = sc.nextInt();
		System.out.print("Enter number of day: ");
		this.number_of_days = sc.nextInt();
		sc.nextLine();
	}

	public void output() {
		super.output();
		System.out.format("%-18s%-15.2f%-20.2f%-20.2f%-20.2f%-20.2f%-20.2f", roomNormalID, unitPrice, number_of_room,
				number_of_days, calculate_discount(), calculate_tax(), Calculate_pirce());
	}
}
