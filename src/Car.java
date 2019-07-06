

public class Car {

	private int id;
	private CarModel carModel;
	private String type;
	private int productionYear;
	private String color;
	private int price;
	private int registrationNumber;

	public Car(int id, CarModel model, String type, int productionYear, String color, int price, int registrationNumber) {
		this.id = id;
		this.carModel = model;
		this.type = type;
		this.productionYear = productionYear;
		this.color = color;
		this.price = price;
		this.registrationNumber = registrationNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public  CarModel getModel() {
		return carModel;
	}

	public void setModel(CarModel model) {
		this.carModel = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String toString() {
		return "Car [ id = " + id + ", model = " + carModel + ", type = " + type + ", productionYear = " + productionYear +
				", color = " + color + ", price = " + price + ", registrationNumber = " + registrationNumber + " ]";
	}



}

