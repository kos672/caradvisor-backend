package root.caradvisor.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CommonUtils {

    public String replacePolishCharacters(String name) {
        return name.toLowerCase()
                .replaceAll("ł", "l")
                .replaceAll("ę", "e")
                .replaceAll("ó", "o")
                .replaceAll("ą", "a")
                .replaceAll("ś", "s")
                .replaceAll("ż", "z")
                .replaceAll("ź", "z")
                .replaceAll("ć", "c");
    }

}
