package root.caradvisor.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.caradvisor.country.CountryUtils;

@CrossOrigin
@RestController
public class CountryPrefsController {

    private final CountryUtils countryUtils;

    @Autowired
    public CountryPrefsController(CountryUtils countryUtils) {
        this.countryUtils = countryUtils;
    }

    @PostMapping(value = "/preferences", produces = "application/json")
    public ResponseEntity<String> checkPreferences(@RequestBody String preferences) {
        String response = String.format("{\"preferences\": \"%s\"}", countryUtils.doesHavePreferences(preferences));
        return !response.equals("") ? new ResponseEntity<>(response, HttpStatus.OK) : new ResponseEntity<>(response,
                HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/country", produces = "application/json")
    public ResponseEntity<String> recognizePreferences(@RequestBody String requestCountry) {
        String recognizedCountry = countryUtils.recognizeCountry(requestCountry);
        String response = String.format("{\"country\": \"%s\"}", recognizedCountry);
        return !recognizedCountry.equals("") ? new ResponseEntity<>(response, HttpStatus.OK) :
                new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
