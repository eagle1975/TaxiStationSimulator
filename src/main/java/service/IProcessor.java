package service;

import entity.ICar;

public interface IProcessor {

    ICar findCarByModel(ICar[] cars, String model);

    ICar findCarByModel(String model);

    void findCarByModelAndYear(String model, int year);

    void findCarByYearAndPrice(ICar[] cars, int year, int price);

    void findCarByYearAndPrice(int year, int price);
}
