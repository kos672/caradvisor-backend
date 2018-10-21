package root.caradvisor.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.caradvisor.name.NameUtils;

@CrossOrigin
@RestController
public class NameController {

    private final NameUtils nameUtils;

    @Autowired
    public NameController(NameUtils nameUtils) {
        this.nameUtils = nameUtils;
    }

    @PostMapping(value = "/name", produces = "application/json")
    public ResponseEntity<String> sendName(@RequestBody String name) {
        String gender = nameUtils.recognizeGender(name);
        String response = String.format("{\"gender\": \"%s\"}", gender);
        return !gender.equals("") ?
                new ResponseEntity<>(response, HttpStatus.OK) :
                new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
