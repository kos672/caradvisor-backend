package root.caradvisor.experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ExperienceController {

    private final ExperienceUtils experienceUtils;

    @Autowired
    public ExperienceController(ExperienceUtils experienceUtils) {
        this.experienceUtils = experienceUtils;
    }

    @PostMapping(value = "experience", produces = "application/json")
    public ResponseEntity<String> recognizeExperience(@RequestBody String answerAboutExperience) {
        int recognizedExperience = experienceUtils.recognizeYearsOfExperience(answerAboutExperience);
        String response = String.format("{\"experience\": \"%s\"}", recognizedExperience);
        return recognizedExperience > 0 ? new ResponseEntity<>(response, HttpStatus.OK) :
                new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }
}
