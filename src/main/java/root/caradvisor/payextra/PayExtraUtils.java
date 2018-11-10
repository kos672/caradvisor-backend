package root.caradvisor.payextra;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import root.caradvisor.common.CommonUtils;

@Slf4j
@Component
public class PayExtraUtils {

    private final CommonUtils commonUtils;

    @Autowired
    public PayExtraUtils(CommonUtils commonUtils) {
        this.commonUtils = commonUtils;
    }

    public String recognizeAbilityToPayExtra(String answerWithAbilityToPayExtra) {
        String answerNoPolishCharLowerCase = commonUtils.replacePolishCharacters(answerWithAbilityToPayExtra);
        String isAble = "";
        if (answerNoPolishCharLowerCase.contains("nie")) {
            isAble = "n";
        } else if (answerNoPolishCharLowerCase.contains("tak") || answerNoPolishCharLowerCase.contains("jestem") ||
                answerNoPolishCharLowerCase.contains("bede")) {
            isAble = "y";
        }
        if (answerNoPolishCharLowerCase.equals("")) {
            log.error("Impossible to recognize '{}' if user is able to pay extra", answerNoPolishCharLowerCase);
        }
        return isAble;
    }
}
