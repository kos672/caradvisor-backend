package root.caradvisor.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(value = "/name", produces = "application/json")
    public ResponseEntity<String> sendName(@RequestParam(value = "name") String name) {
        String gender = nameUtils.recognizeGender(name);
        return !gender.equals("") ?
                new ResponseEntity<>(gender, HttpStatus.OK) :
                new ResponseEntity<>(gender, HttpStatus.BAD_REQUEST);
    }
}
