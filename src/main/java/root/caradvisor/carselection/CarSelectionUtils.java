package root.caradvisor.carselection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import root.caradvisor.car.CarDto;

@Slf4j
@Component
public class CarSelectionUtils {

    public CarDto selectCar(CarSelection carSelection) {
        log.info("Selecting car with given answers: [country preferences: '{}'], [has family: '{}'], [offroad often " +
                        "driven: '{}'], [years of driving: '{}', [able to pay extra: '{}']",
                carSelection.getCountryPrefs(), carSelection.getFamily(),
                carSelection.getOffroadOftenDriven(), carSelection.getYearsOfDriving(),
                carSelection.getAbleToPayExtra());
        CarDto.CarDtoBuilder builder = CarDto.builder();
        builder.manufacturer(selectCountryManufacturer(carSelection));
        builder.doors(selectMinimumNumberOfDoorsDependingOnFamily(carSelection));
        builder.seats(selectMinimumNumberOfSeatsDependingOnFamily(carSelection));
        builder.engineDisplacement(selectEngineDisplacementDependingOnExperience(carSelection.getYearsOfDriving()));
        builder.drivetrain(selectDrivetrainDependingIfOffroadOften(carSelection.getOffroadOftenDriven()));
        if (carSelection.getAbleToPayExtra().equals("y")) {
            builder.drivetrain("4WD");
            builder.transmission("automatic");
            builder.engine("petrol");
        } else {
            builder.transmission("manual");
            if (carSelection.getYearsOfDriving() <= 2) {
                builder.engine("petrol");
            } else {
                builder.engine("diesel");
            }
        }
        return builder.build();
    }

    private String selectCountryManufacturer(CarSelection carSelection) {
        String countryManufacturer = null;
        if (!carSelection.getCountryPrefs().equals("")) {
            countryManufacturer = carSelection.getCountryPrefs();
        }
        return countryManufacturer;
    }

    private int selectMinimumNumberOfDoorsDependingOnFamily(CarSelection carSelection) {
        if (carSelection.getFamily().equals("y")) {
            return 4;
        } else {
            return 3;
        }
    }

    private int selectMinimumNumberOfSeatsDependingOnFamily(CarSelection carSelection) {
        if (carSelection.getFamily().equals("y")) {
            return 4;
        } else {
            return 2;
        }
    }

    private double selectEngineDisplacementDependingOnExperience(int yearsOfDriving) {
        if (yearsOfDriving <= 2) {
            if (yearsOfDriving == 1) {
                return 1.3;
            } else if (yearsOfDriving == 2) {
                return 1.8;
            }
        } else if (yearsOfDriving <= 5) {
            return 2.5;
        }
        return 100.0;
    }

    private String selectDrivetrainDependingIfOffroadOften(String isOffroadOftenDriven) {
        if (isOffroadOftenDriven.equals("y")) {
            return "FWD";
        }
        return "";
    }
}
