package server.builders;

import server.model.Vehicle;

public class VehicleBuilder {
    public static Vehicle build() {
        Vehicle response = new Vehicle();
        response.setName(NameBuilder.build());
        response.setCoordinates(CoordinatesBuilder.build());
        response.setEnginePower(IntegerBuilder.build("Введите значение Engine Power:"));
        response.setNumberOfWheels(IntegerBuilder.build("Введите значение numberOfWheels:"));
        response.setType(VehicleTypeBuilder.build());
        response.setFuelType(FuelTypeBuilder.build());
        return response;
    }
}
