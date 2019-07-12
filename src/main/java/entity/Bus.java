package entity;

import entity.EnumCar.CarModel;
import entity.EnumCar.TypeCar;

public class Bus extends PassangerImpl {

    private String purpose;


    public Bus(int id, CarModel model, TypeCar type, int productionYear, String color, int price, int registrationNumber, int numberOfPassengers, String purpose) {
        super(id, model, type, productionYear, color, price, registrationNumber, numberOfPassengers);
        this.purpose = purpose;
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
                "id=" + getId() +
                ", carModel=" + getCarModel() +
                ", type='" + getType() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                ", registrationNumber=" + getRegistrationNumber() +
                ", numberOfPassengers=" + getNumberOfPassengers() +
                ", purpose='" + getPurpose() + '\'' +
                '}';
    }
}





