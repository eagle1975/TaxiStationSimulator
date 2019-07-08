package service;

import entity.*;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Processor implements  IProcessor{

    private ICar[] cars;

    public Processor() {
        cars = new ICar[0];
    }

    public Processor(ICar[] cars) {
        this.cars = Optional.of(cars)
                .orElseThrow(() -> new IllegalArgumentException("Car must be not null!"));
    }

    public ICar findCarByModel(ICar[] cars, String model) {
        return Arrays.stream(cars)
                .filter(car -> car.getCarModel().name().equalsIgnoreCase(model))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    public ICar findCarByModel(String model) {
        return findCarByModel(cars, model);
    }

    public void findCarByModelAndYear(ICar[] cars, String model, int year) {
        Arrays.stream(cars)
                .filter(car -> car.getCarModel().getModel().equalsIgnoreCase(model))
                .filter(car -> (2019 - car.getProductionYear()) > year)
                .forEach(this::printCar);
    }

    public void findCarByModelAndYear(String model, int year) {
        findCarByModelAndYear(cars, model, year);
    }

    public void findCarByYearAndPrice(ICar[] cars, int year, int price) {
        Arrays.stream(cars)
                .filter(car -> car.getProductionYear() == year)
                .filter(car -> car.getPrice() > price)
                .forEach(this::printCar);
    }

    public void findCarByYearAndPrice(int year, int price) {
        findCarByYearAndPrice(cars, year, price);
    }

    void printCar(ICar car) {
        System.out.println(car);
    }

    void printCar(ICar[] cars) {
        Arrays.stream(cars).forEach(System.out::println);
    }

    public ICar[] getCars() {
        return cars;
    }
}

