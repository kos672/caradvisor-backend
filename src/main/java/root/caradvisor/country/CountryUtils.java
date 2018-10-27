package root.caradvisor.country;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import root.caradvisor.model.ManufacturerCountry;

@Component
@Slf4j
public class CountryUtils {

    public String doesHavePreferences(String requestPreferences) {
        String reqPrefs = requestPreferences.toLowerCase();
        String preferences = "";
        if (reqPrefs.contains("nie") || reqPrefs.contains("nie mam")) {
            preferences = "n";
        } else if (reqPrefs.contains("tak") || reqPrefs.contains("mam")) {
            preferences = "y";
        }
        if (preferences.equals("")) {
            log.error("Impossible to recognize user's country preferences for given answer: %s", reqPrefs);
        }
        return preferences;
    }

    public String recognizeCountry(String requestCountry) {
        String recognizedCountryCode = "";
        for (ManufacturerCountry country : ManufacturerCountry.class.getEnumConstants()) {
            String countryName = country.getCountryName();
            if (countryName.equals(requestCountry.toUpperCase())) {
                recognizedCountryCode = country.getCountryCode();
            }
        }
        if (recognizedCountryCode.equals("")) {
            log.error("Impossible to recgonize given country: %s", requestCountry);
        }
        return recognizedCountryCode;
    }

}
