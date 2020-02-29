package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.FactoryCategory;

public class FactoryProvider {
    public AbstractFactory<Car> createFactory(FactoryCategory category) {
        switch (category) {
            case COMBIS:
                return new CombiCarFactory();
            case SEDANS:
                return new SedanCarFactory();
            case HATCHBACKS:
                return new HatchbackCarFactory();
        }
        throw new RuntimeException("Unknown factory type");
    }
}
