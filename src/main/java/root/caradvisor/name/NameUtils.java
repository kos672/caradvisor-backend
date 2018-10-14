package root.caradvisor.name;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import root.caradvisor.model.Gender;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Component
@Slf4j
public class NameUtils {

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

    public String recognizeGender(String name) {
        String nameWithoutPolishCharacters = replacePolishCharacters(name);
        String menNamesFilePath = "src/main/resources/men_names.txt";
        String femaleNamesFilePath = "src/main/resources/female_names.txt";
        List<String> menNames = new ArrayList<>();
        List<String> femaleNames = new ArrayList<>();
        String recognizedGenderCharacter = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(menNamesFilePath)))) {
            menNames.addAll(asList(reader.readLine().split(",")));
        } catch (IOException e) {
            log.error("File with specified path not found: %s", menNamesFilePath);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(femaleNamesFilePath)))) {
            femaleNames.addAll(asList(reader.readLine().split(",")));
        } catch (IOException e) {
            log.error("File with specified path not found: %s", menNamesFilePath);
        }
        if (menNames.stream().map(String::toLowerCase).collect(Collectors.toList()).contains
                (nameWithoutPolishCharacters)) {
            recognizedGenderCharacter = Gender.MALE.getGenderSign();
        } else if (femaleNames.stream().map(String::toLowerCase).collect(Collectors.toList()).contains
                (nameWithoutPolishCharacters)) {
            recognizedGenderCharacter = Gender.FEMALE.getGenderSign();
        }
        if (recognizedGenderCharacter.equals("")) {
            log.error("Impossible to recgonize name: {} to any gender", nameWithoutPolishCharacters);
        }
        return recognizedGenderCharacter;
    }
}
