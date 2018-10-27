package root.caradvisor.country;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import root.caradvisor.AbstractUnitTest;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CountryUtilsTest extends AbstractUnitTest {

    @Autowired
    private CountryUtils countryUtils;

    @Test
    public void shouldRecgonizeThatUserHasPreferences() {
        // given
        String usersAnswer1 = "Tak";
        String usersAnswer2 = "Mam";
        String usersAnswer3 = "Tak, mam";

        // when
        String recognizedPreferences1 = countryUtils.doesHavePreferences(usersAnswer1);
        String recognizedPreferences2 = countryUtils.doesHavePreferences(usersAnswer2);
        String recognizedPreferences3 = countryUtils.doesHavePreferences(usersAnswer3);

        // then
        assertThat(recognizedPreferences1, equalTo("y"));
        assertThat(recognizedPreferences2, equalTo("y"));
        assertThat(recognizedPreferences3, equalTo("y"));
    }

    @Test
    public void shouldRecognizeThatUserHasNotPreferences() {
        // given
        String usersAnswer1 = "Nie";
        String usersAnswer2 = "Nie mam";

        // when
        String recognizedPreferences1 = countryUtils.doesHavePreferences(usersAnswer1);
        String recognizedPreferences2 = countryUtils.doesHavePreferences(usersAnswer2);

        // then
        assertThat(recognizedPreferences1, equalTo("n"));
        assertThat(recognizedPreferences2, equalTo("n"));
    }

    @Test
    public void shouldNotRecognizePreferences() {
        // given
        String usersAnswer1 = "";
        String usersAnswer2 = "Jakas_odpowiedz";

        // when
        String recognizedPreferences1 = countryUtils.doesHavePreferences(usersAnswer1);
        String recognizedPreferences2 = countryUtils.doesHavePreferences(usersAnswer2);

        // then
        assertThat(recognizedPreferences1, equalTo(""));
        assertThat(recognizedPreferences2, equalTo(""));
    }

    @Test
    public void shouldRecognizeUsersCountryPref() {
        // given
        String usersAnswer = "Japonia";

        // when
        String recognizedPreferences = countryUtils.recognizeCountry(usersAnswer);

        // then
        assertThat(recognizedPreferences, equalTo("JP"));
    }

    @Test
    public void shouldNotRecognizeCountryPref() {
        // given
        String usersAnswer = "Nieznany_kraj";

        // when
        String recognizedPreferences = countryUtils.recognizeCountry(usersAnswer);

        // then
        assertThat(recognizedPreferences, equalTo(""));
    }
}