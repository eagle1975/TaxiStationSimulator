package entity;

public class CargoTaxiImpl implements ICar {

    private int id;
    private CarModel carModel;
    private String type;
    private int productionYear;
    private String color;
    private int price;
    private int registrationNumber;
    private int loadCapacity;

    public CargoTaxiImpl(int id, CarModel carModel, String type, int productionYear, String color, int price, int registrationNumber, int loadCapacity) {
        this.id = id;
        this.carModel = carModel;
        this.type = type;
        this.productionYear = productionYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
        this.loadCapacity = loadCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
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

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "CargoTaxiImpl{" +
                "id=" + id +
                ", carModel=" + carModel +
                ", type='" + type + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber=" + registrationNumber +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
