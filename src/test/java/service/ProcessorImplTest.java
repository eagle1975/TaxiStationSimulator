package service;

import entity.Car;
import entity.enums.Color;
import entity.impl.PassengerCar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.impl.ProcessorImpl;

import java.util.NoSuchElementException;

import static entity.enums.Model.BMW;
import static entity.enums.Model.CHEVROLET;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProcessorImplTest {
    private ProcessorImpl processorImpl;
    private Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new PassengerCar[]{
                new PassengerCar( BMW, "X5", 2014, Color.RED, 200_000, 2323, 3, "Sedan"),
                new PassengerCar( CHEVROLET, "AVEO", 2012, Color.WHITE, 50_000, 4433, 4, "Hatchback")
        };
        processorImpl = new ProcessorImpl(cars);
    }

    @Test
    void shouldReturnCarWhenModelExists() {
        assertEquals(cars[0], processorImpl.findCarByModel("BMW"));
    }

    @Test
    void shouldThrowExceptionWhenModelNotExists() {
        assertThrows(NoSuchElementException.class, () -> processorImpl.findCarByModel(null));
    }
}