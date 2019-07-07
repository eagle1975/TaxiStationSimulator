package service;

import entity.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static entity.CarModel.BMW;
import static entity.CarModel.CHEVROLET;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProcessorTest {
    private Processor processor;
    private Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[]{
                new Car(1, BMW, "X5", 2014, "red", 200_000, 2323),
                new Car(2, CHEVROLET, "Aveo", 2012, "white", 50_000, 4433)
        };
        processor = new Processor(cars);
    }

    @Test
    void shouldReturnCarWhenModelExists() {
        assertEquals(cars[0], processor.findCarByModel("BMW"));
    }

    @Test
    void shouldThrowExceptionWhenModelNotExists() {
        assertThrows(NoSuchElementException.class, () -> processor.findCarByModel(null));
    }

    @Test
    void findCarByModel1() {
    }

    @Test
    void findCarByModelAndYear() {
    }

    @Test
    void findCarByModelAndYear1() {
    }

    @Test
    void findCarByYearAndPrice() {
    }

    @Test
    void getCars() {
    }
}