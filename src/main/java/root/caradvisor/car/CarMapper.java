package root.caradvisor.car;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import root.caradvisor.model.Car;
import root.caradvisor.model.Drivetrain;
import root.caradvisor.model.Engine;
import root.caradvisor.model.Manufacturer;
import root.caradvisor.model.Transmission;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mappings({
            @Mapping(source = "car.manufacturer", target = "manufacturer", qualifiedByName = "mapManufacturer"),
            @Mapping(source = "car.engine", target = "engine", qualifiedByName = "mapEngine"),
            @Mapping(source = "car.transmission", target = "transmission", qualifiedByName = "mapTransmission"),
            @Mapping(source = "car.drivetrain", target = "drivetrain", qualifiedByName = "mapDrivetrain"),

    })
    CarDto carToCarDto(Car car);

    default String mapManufacturer(Manufacturer manufacturer) {
        return manufacturer.getName();
    }

    default String mapEngine(Engine engine) {
        return engine.getName();
    }

    default String mapTransmission(Transmission transmission) {
        return transmission.getName();
    }

    default String mapDrivetrain(Drivetrain drivetrain) {
        return drivetrain.getName();
    }
}
