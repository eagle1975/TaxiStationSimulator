package service;

import entity.Car;

public interface Processor {

    Car findCarByModel(Car[] cars, String model);

    Car findCarByModel(String model);

    void findCarByModelAndYear(String model, int year);

    void findCarByYearAndPrice(Car[] cars, int year, int price);

    void findCarByYearAndPrice(int year, int price);
}
