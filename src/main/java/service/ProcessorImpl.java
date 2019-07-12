package service;

import entity.*;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;

public class ProcessorImpl implements Processor {

    private Car[] cars;

    public ProcessorImpl() {
        cars = new Car[0];
    }

    public ProcessorImpl(Car[] cars) {
        this.cars = Optional.of(cars)
                .orElseThrow(() -> new IllegalArgumentException("Car must be not null!"));
    }

    public Car findCarByModel(Car[] cars, String model) {
        return Arrays.stream(cars)
                .filter(car -> car.getCarModel().name().equalsIgnoreCase(model))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    public Car findCarByModel(String model) {
        return findCarByModel(cars, model);
    }

    public void findCarByModelAndYear(Car[] cars, String model, int year) {
        Arrays.stream(cars)
                .filter(car -> car.getCarModel().getModel().equalsIgnoreCase(model))
                .filter(car -> (2019 - car.getProductionYear()) > year)
                .forEach(this::printCar);
    }

    public void findCarByModelAndYear(String model, int year) {
        findCarByModelAndYear(cars, model, year);
    }

    public void findCarByYearAndPrice(Car[] cars, int year, int price) {
        Arrays.stream(cars)
                .filter(car -> car.getProductionYear() == year)
                .filter(car -> car.getPrice() > price)
                .forEach(this::printCar);
    }

    public void findCarByYearAndPrice(int year, int price) {
        findCarByYearAndPrice(cars, year, price);
    }

    void printCar(Car car) {
        System.out.println(car);
    }

    void printCar(Car[] cars) {
        Arrays.stream(cars).forEach(System.out::println);
    }

    public Car[] getCars() {
        return cars;
    }
}

