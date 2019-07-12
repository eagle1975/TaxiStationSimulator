package entity;

import entity.EnumCar.CarModel;

public interface Car {

    int getPrice();

    void setPrice(int price);

    CarModel getCarModel();

    int getProductionYear();
}
