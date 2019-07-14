package entity;

import entity.enums.Model;

public interface Car {

    int getPrice();

    void setPrice(int price);

    Model getModel();

    int getProductionYear();
}
