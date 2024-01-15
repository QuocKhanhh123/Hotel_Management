package Project;

public class RoomVIP extends Room {
	private String roomVipID;
	private String vip_manager_contact;
	private String furniture;
	private double unitPrice;
	private int number_of_room;
	private int number_of_day;

	public RoomVIP() {
		super();
	}

	public RoomVIP(String roomVipID, String vip_manager_contact, String furniture, double unitPrice, int number_of_room,
			int number_of_day) {
		super();
		this.roomVipID = roomVipID;
		this.vip_manager_contact = vip_manager_contact;
		this.furniture = furniture;
		this.unitPrice = unitPrice;
		this.number_of_room = number_of_room;
		this.number_of_day = number_of_day;
	}

	public RoomVIP(String roomType, double Area, String status, int capacity, int floorLevel, String view,
			String check_in_time, String check_out_time, String notes, String roomVipID, String vip_manager_contact,
			String furniture, double unitPrice, int number_of_room, int number_of_day) {
		super(roomType, Area, status, capacity, floorLevel, view, check_in_time, check_out_time, notes);
		this.roomVipID = roomVipID;
		this.vip_manager_contact = vip_manager_contact;
		this.furniture = furniture;
		this.unitPrice = unitPrice;
		this.number_of_room = number_of_room;
		this.number_of_day = number_of_day;
	}

	public String getVip_manager_contact() {
		return vip_manager_contact;
	}

	public void setVip_manager_contact(String vip_manager_contact) {
		this.vip_manager_contact = vip_manager_contact;
	}

	public String getFurniture() {
		return furniture;
	}

	public void setFurniture(String furniture) {
		this.furniture = furniture;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getNumber_of_room() {
		return number_of_room;
	}

	public void setNumber_of_room(int number_of_room) {
		this.number_of_room = number_of_room;
	}

	public int getNumber_of_day() {
		return number_of_day;
	}

	public void setNumber_of_day(int number_of_day) {
		this.number_of_day = number_of_day;
	}

	public String getRoomVipID() {
		return roomVipID;
	}

	public void setRoomVipID(String roomVipID) {
		this.roomVipID = roomVipID;
	}

	public void input() {
		super.input();
		System.out.print("Enter ID room VIP: ");
		this.roomVipID = sc.nextLine();
		System.out.print("Enter name vip manager contact: ");
		this.vip_manager_contact = sc.nextLine();
		System.out.print("Enter furniture: ");
		this.furniture = sc.nextLine();
		System.out.print("Enter unit price: ");
		this.unitPrice = sc.nextDouble();
		System.out.print("Enter number of rooms: ");
		this.number_of_room = sc.nextInt();
		System.out.print("Enter number of days: ");
		this.number_of_day = sc.nextInt();
		sc.nextLine();
	}

	public void output() {
		super.output();
		System.out.format("%-18s%-23s%-15s%-15.2f%-20d%-20d%-20.2f%-20.2f%-20.2f", roomVipID, vip_manager_contact,
				furniture, unitPrice, number_of_room, number_of_day, calculate_discount(), calculate_tax(),
				Calculate_pirce());
	}

	@Override
	public double calculate_discount() {
		if (this.number_of_day >= 3 && this.number_of_room >= 2) {
			return this.unitPrice * 0.25;
		} else if (this.number_of_room > 2) {
			return this.unitPrice * 0.12;

		}
		return 0;
	}

	@Override
	public double calculate_tax() {
		return this.unitPrice * 0.15;
	}

	@Override
	public double Calculate_pirce() {
		return (this.unitPrice * this.number_of_day * this.number_of_room) + calculate_tax() - calculate_discount();
	}

}
