package entity.impl;

import entity.Car;
import entity.enums.Color;
import entity.enums.Model;

public class Bus implements Car {
    private static int nextId;
    private int id = ++nextId;
    private Model model;
    private String type;
    private int productionYear;
    private Color color;
    private int price;
    private int registrationNumber;
    private int numberOfPassengers;

    private String purpose;

    public Bus(Model model, String type, int productionYear, Color color, int price, int registrationNumber, int numberOfPassengers, String purpose) {
        this.model = model;
        this.type = type;
        this.productionYear = productionYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
        this.numberOfPassengers = numberOfPassengers;
        this.purpose = purpose;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Model getModel() {
        return model;
    }

    @Override
    public int getProductionYear() {
        return productionYear;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", carModel=" + model +
                ", type='" + type + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber=" + registrationNumber +
                ", numberOfPassengers=" + numberOfPassengers +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}





