package root.caradvisor.location;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LocationUtils {

    public String recognizeOftenDrivenLocation(String answerAboutLocation) {
        String answerAboutLocationLowerCase = answerAboutLocation.toLowerCase();
        String offroadIsOftenDrivenLocation = "";
        if (answerAboutLocationLowerCase.contains("nie")) {
            offroadIsOftenDrivenLocation = "n";
        } else if (answerAboutLocationLowerCase.contains("tak") || answerAboutLocationLowerCase.contains("często")) {
            offroadIsOftenDrivenLocation = "y";
        }
        if (answerAboutLocationLowerCase.equals("")) {
            log.error("Impossible to recognize if user has family for given answer: {}", answerAboutLocationLowerCase);
        }
        return offroadIsOftenDrivenLocation;
    }

}
