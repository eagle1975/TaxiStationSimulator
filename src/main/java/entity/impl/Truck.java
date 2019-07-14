package entity.impl;

import entity.Car;
import entity.enums.Color;
import entity.enums.Model;

public class Truck implements Car {
    private static int nextId;
    private int id = ++nextId;
    private Model model;
    private String type;
    private int productionYear;
    private Color color;
    private int price;
    private int registrationNumber;
    private int loadCapacity;

    public Truck(Model model, String type, int productionYear, Color color, int price, int registrationNumber, int loadCapacity) {
        this.model = model;
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

    @Override
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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
                ", model=" + model +
                ", type='" + type + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber=" + registrationNumber +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
