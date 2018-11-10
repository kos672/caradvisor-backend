package root.caradvisor.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import root.caradvisor.payextra.PayExtraUtils;

@CrossOrigin
@RestController
public class PayExtraController {

    private final PayExtraUtils payExtraUtils;

    @Autowired
    public PayExtraController(PayExtraUtils payExtraUtils) {
        this.payExtraUtils = payExtraUtils;
    }

    @PostMapping(value = "pay-extra", produces = "application/json")
    public ResponseEntity<String> recognizeAbilityToPayExtra(@RequestBody String answerWithAbilityToPayExtra) {
        String recognizedAnswer = payExtraUtils.recognizeAbilityToPayExtra(answerWithAbilityToPayExtra);
        String response = String.format("{\"payExtra\": \"%s\"}", recognizedAnswer);
        return !recognizedAnswer.equals("") ? new ResponseEntity<>(response, HttpStatus.OK) :
                new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
