package root.caradvisor.experience;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.caradvisor.common.CommonUtils;

import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

@Slf4j
@Component
public class ExperienceUtils {

    private HashMap<Integer, List<String>> alphabeticRepresentationOfDigits;

    private final CommonUtils commonUtils;

    @Autowired
    public ExperienceUtils(CommonUtils commonUtils) {
        this.commonUtils = commonUtils;
        alphabeticRepresentationOfDigits = new HashMap<>();
        alphabeticRepresentationOfDigits.put(1, asList("jeden", "jednego", "poltora", "rok"));
        alphabeticRepresentationOfDigits.put(2, asList("dwa", "dwoch"));
        alphabeticRepresentationOfDigits.put(3, asList("trzy", "trzech"));
        alphabeticRepresentationOfDigits.put(4, asList("cztery", "czterech"));
        alphabeticRepresentationOfDigits.put(5, asList("piec", "pieciu"));
        alphabeticRepresentationOfDigits.put(6, asList("szesc", "szesciu"));
        alphabeticRepresentationOfDigits.put(7, asList("siedem", "siedmiu"));
        alphabeticRepresentationOfDigits.put(8, asList("osiem", "osmiu"));
        alphabeticRepresentationOfDigits.put(9, asList("dziewiec", "dziewieciu"));
        alphabeticRepresentationOfDigits.put(10, asList("dziesiec", "dziesieciu"));
    }

    public int recognizeYearsOfExperience(String answerAboutExperience) {
        String answerNoPolishCharLowerCase = commonUtils.replacePolishCharacters(answerAboutExperience.toLowerCase());
        int answer = 0;
        if (answerNoPolishCharLowerCase.matches("\\d+")) {
            answer = Integer.valueOf(answerNoPolishCharLowerCase.trim());
        } else if (answerNoPolishCharLowerCase.contains("lat") && answerNoPolishCharLowerCase.matches("^[a-zA-Z0-9 " +
                "]*$")) {
            answer = Integer.valueOf(answerNoPolishCharLowerCase.replaceAll("[a-zA-Z]", "").trim());
        } else if (answerNoPolishCharLowerCase.contains("mies")) {
            answer = 1;
        } else {
            for (int i = 1; i <= 10; i++) {
                List<String> strings = alphabeticRepresentationOfDigits.get(i);
                if (strings.contains(answerNoPolishCharLowerCase)) {
                    answer = i;
                    break;
                }
            }
        }
        if (answer == 0) {
            log.error("Can't recognize given answer: {} as years of experience", answerAboutExperience);
        }
        return answer;
    }

}
