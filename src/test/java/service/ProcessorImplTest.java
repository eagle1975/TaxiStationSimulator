package service;

import entity.Car;
import entity.PassangerImpl;
import entity.EnumCar.TypeCar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static entity.EnumCar.CarModel.BMW;
import static entity.EnumCar.CarModel.CHEVROLET;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProcessorImplTest {
    private ProcessorImpl processorImpl;
    private Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new PassangerImpl[]{
                new PassangerImpl(1, BMW, TypeCar.X5, 2014, "red", 200_000, 2323, 3),
                new PassangerImpl(2, CHEVROLET, TypeCar.AVEO, 2012, "white", 50_000, 4433, 4)
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