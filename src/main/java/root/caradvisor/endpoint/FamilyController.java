package root.caradvisor.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.caradvisor.family.FamilyUtils;

@CrossOrigin
@RestController
public class FamilyController {

    private final FamilyUtils familyUtils;

    @Autowired
    public FamilyController(FamilyUtils familyUtils) {
        this.familyUtils = familyUtils;
    }

    @PostMapping(value = "family", produces = "application/json")
    public ResponseEntity<String> recognizePrefenceOfFamily(@RequestBody String userAnswer) {
        String familyPresence = familyUtils.recognizeDoesHaveFamily(userAnswer);
        String response = String.format("{\"hasFamily\": \"%s\"}", familyPresence);
        return !familyPresence.equals("") ? new ResponseEntity<>(response, HttpStatus.OK) : new ResponseEntity<>
                (response, HttpStatus.NOT_FOUND);
    }

}
