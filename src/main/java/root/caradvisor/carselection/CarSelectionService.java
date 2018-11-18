package root.caradvisor.carselection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import root.caradvisor.car.CarDto;
import root.caradvisor.car.CarMapper;
import root.caradvisor.car.CarRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarSelectionService {

    private final CarSelectionUtils carSelectionUtils;
    private final CarRepository carRepository;

    @Autowired
    public CarSelectionService(CarSelectionUtils carSelectionUtils, CarRepository carRepository) {
        this.carSelectionUtils = carSelectionUtils;
        this.carRepository = carRepository;
    }

    public List<CarDto> selectCars(CarSelection carSelectionAnswer) {
        CarDto carDto = carSelectionUtils.selectCar(carSelectionAnswer);
        List<CarDto> foundCars;
        if (carDto.getManufacturer() == null) {
            foundCars = carRepository.findByEngineAndEngineDisplacementAndTransmissionAndDrivetrainAndDoorsAndSeats(
                    carDto.getEngine(), BigDecimal.valueOf(carDto.getEngineDisplacement()), carDto.getTransmission(),
                    carDto.getDrivetrain(), carDto.getDoors(), carDto.getSeats()
            ).stream().map(CarMapper.INSTANCE::carToCarDto).collect(Collectors.toList());
        } else if (carDto.getDrivetrain().equals("")) {
            foundCars = carRepository
                    .findByManufacturerAndEngineAndEngineDisplacementAndTransmissionAndNot4WDAndDoorsAndSeats(
                            carDto.getManufacturer(), carDto.getEngine(), BigDecimal.valueOf(carDto
                                    .getEngineDisplacement()),
                            carDto.getTransmission(), "4WD", carDto.getDoors(), carDto.getSeats()
                    ).stream().map(CarMapper.INSTANCE::carToCarDto).collect(Collectors.toList());
        } else if (carDto.getManufacturer() == null && carDto.getDrivetrain().equals("")) {
            foundCars = carRepository.findByEngineAndEngineDisplacementAndTransmissionAndNot4WDAndDoorsAndSeats(
                    carDto.getEngine(), BigDecimal.valueOf(carDto.getEngineDisplacement()), carDto.getTransmission(),
                    "4WD", carDto.getDoors(), carDto.getSeats()
            ).stream().map(CarMapper.INSTANCE::carToCarDto).collect(Collectors.toList());
        } else {
            foundCars = carRepository
                    .findByManufacturerAndEngineAndEngineDisplacementAndTransmissionAndDrivetrainAndDoorsAndSeats(
                            carDto.getManufacturer(), carDto.getEngine(), BigDecimal.valueOf(carDto
                                    .getEngineDisplacement()),
                            carDto.getTransmission(), carDto.getDrivetrain(), carDto.getDoors(), carDto.getSeats()
                    ).stream().map(CarMapper.INSTANCE::carToCarDto).collect(Collectors.toList());
        }
        return foundCars;
    }
}
