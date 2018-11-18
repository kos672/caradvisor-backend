package root.caradvisor.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.caradvisor.car.CarDto;
import root.caradvisor.carselection.CarSelection;
import root.caradvisor.carselection.CarSelectionService;

import java.util.List;

@CrossOrigin
@RestController
public class CarSelectionController {

    private final CarSelectionService carSelectionService;

    @Autowired
    public CarSelectionController(CarSelectionService carSelectionService) {
        this.carSelectionService = carSelectionService;
    }

    @PostMapping(value = "car-selection", produces = "application/json")
    public ResponseEntity<List<CarDto>> selectCar(@RequestBody CarSelection carSelection) {
        List<CarDto> carDtos = carSelectionService.selectCars(carSelection);
        return carDtos.size() > 0 ? new ResponseEntity<>(carDtos, HttpStatus.OK) :
                new ResponseEntity<>(carDtos, HttpStatus.NOT_FOUND);
    }

}
