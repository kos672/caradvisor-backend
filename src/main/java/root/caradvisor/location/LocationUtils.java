package root.caradvisor.location;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LocationUtils {

    public String recognizeOftenDrivenLocation(String answerAboutLocation) {
        String answerAboutLocationLowerCase = answerAboutLocation.toLowerCase();
        String oftenDrivenLocation = "";
        if (answerAboutLocationLowerCase.contains("nie")) {
            oftenDrivenLocation = "city";
        } else if (answerAboutLocationLowerCase.contains("tak") || answerAboutLocationLowerCase.contains("często")) {
            oftenDrivenLocation = "town";
        }
        if (answerAboutLocationLowerCase.equals("")) {
            log.error("Impossible to recognize if user has family for given answer: {}", answerAboutLocationLowerCase);
        }
        return oftenDrivenLocation;
    }

}
