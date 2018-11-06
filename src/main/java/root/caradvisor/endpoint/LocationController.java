package root.caradvisor.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.caradvisor.location.LocationUtils;

@CrossOrigin
@RestController
public class LocationController {

    private final LocationUtils locationUtils;

    @Autowired
    public LocationController(LocationUtils locationUtils) {
        this.locationUtils = locationUtils;
    }

    @PostMapping(value = "location", produces = "application/json")
    public ResponseEntity<String> recognizeOftenDrivenLocation(@RequestBody String answerAboutLocation) {
        String recognizedLocation = locationUtils.recognizeOftenDrivenLocation(answerAboutLocation);
        String response = String.format("{\"location\": \"%s\"}", recognizedLocation);
        return !recognizedLocation.equals("") ? new ResponseEntity<>(response, HttpStatus.OK) :
                new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
