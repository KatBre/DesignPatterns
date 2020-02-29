package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.*;

public class HatchbackCarFactory implements AbstractFactory<Car> {


    @Override
    public Car create(String type) {
        switch (type) {
            case "A4" :
                return createAudiA4Hatchback();
            case "A6" :
                return createAudiA6Hatchbac();
            case "TC" :
                return createToyotaCorollaHatchback();
        }
        throw new RuntimeException("Unknown hatchback type");
    }

    private Car createAudiA4Hatchback() {
        return new Audi("A4", EngineType.DIESEL, 2.7, 4, BodyType.HATCHBACK);
    }

    private Car createAudiA6Hatchbac() {
        return new Audi("A6", EngineType.DIESEL, 3.5, 8, BodyType.HATCHBACK);
    }

    private Car createToyotaCorollaHatchback() {
        return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED, 1.2, 6, BodyType.HATCHBACK);
    }
}