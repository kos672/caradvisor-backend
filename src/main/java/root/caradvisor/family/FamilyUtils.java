package root.caradvisor.family;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FamilyUtils {

    public String recognizeDoesHaveFamily(String answerAboutFamily) {
        String answerAboutFamilyLowercase = answerAboutFamily.toLowerCase();
        String hasFamily = "";
        if (answerAboutFamilyLowercase.contains("nie") || answerAboutFamilyLowercase.contains("nie mam")) {
            hasFamily = "n";
        } else if (answerAboutFamilyLowercase.contains("tak") || answerAboutFamilyLowercase.contains("mam")) {
            hasFamily = "y";
        }
        if (answerAboutFamilyLowercase.equals("")) {
            log.error("Impossible to recognize if user has family for given answer: {}", answerAboutFamilyLowercase);
        }
        return hasFamily;
    }

}
