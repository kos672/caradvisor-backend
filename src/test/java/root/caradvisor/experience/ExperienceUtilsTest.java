package root.caradvisor.experience;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import root.caradvisor.AbstractUnitTest;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ExperienceUtilsTest extends AbstractUnitTest {

    @Autowired
    private ExperienceUtils experienceUtils;

    @Test
    public void shouldRecognizeDigit() {
        // given
        String answer1 = "3";
        String answer2 = "6";

        // when
        int years = experienceUtils.recognizeYearsOfExperience(answer1);
        int years1 = experienceUtils.recognizeYearsOfExperience(answer2);

        // then
        assertThat(years, equalTo(3));
        assertThat(years1, equalTo(6));
    }

    @Test
    public void shouldRecognizeFromDigitsWithYearsWord() {
        // given
        String answer = "2 lata";
        String answer1 = "5 lat";

        // when
        int years = experienceUtils.recognizeYearsOfExperience(answer);
        int years1 = experienceUtils.recognizeYearsOfExperience(answer1);

        // then
        assertThat(years, equalTo(2));
        assertThat(years1, equalTo(5));
    }

    @Test
    public void shouldRecognizeAnswerWithMonthAsOneYear() {
        // given
        String answer = "1 miesiąc";
        String answer2 = "2 miesiące";
        String answer3 = "5 miesiący";

        // when
        int year = experienceUtils.recognizeYearsOfExperience(answer);
        int year2 = experienceUtils.recognizeYearsOfExperience(answer);
        int year3 = experienceUtils.recognizeYearsOfExperience(answer);

        // then
        assertThat(year, equalTo(1));
        assertThat(year2, equalTo(1));
        assertThat(year3, equalTo(1));
    }

    @Test
    public void shouldRecognizeOneYear() {
        // given
        String jeden = "jeden";
        String jednego = "jednego";
        String poltora = "poltora";
        String rok = "rok";

        // when
        int jedenDigit = experienceUtils.recognizeYearsOfExperience(jeden);
        int jednegoDigit = experienceUtils.recognizeYearsOfExperience(jednego);
        int poltoraDigit = experienceUtils.recognizeYearsOfExperience(poltora);
        int rokDigit = experienceUtils.recognizeYearsOfExperience(rok);

        // then
        assertThat(jedenDigit, equalTo(1));
        assertThat(jednegoDigit, equalTo(1));
        assertThat(poltoraDigit, equalTo(1));
        assertThat(rokDigit, equalTo(1));
    }

    @Test
    public void shouldRecognizeTwoYears() {
        // given
        String dwa = "dwa";
        String dwoch = "dwoch";

        // when
        int dwaDigit = experienceUtils.recognizeYearsOfExperience(dwa);
        int dwochDigit = experienceUtils.recognizeYearsOfExperience(dwoch);

        // then
        assertThat(dwaDigit, equalTo(2));
        assertThat(dwochDigit, equalTo(2));
    }

    @Test
    public void shouldRecognizeThreeYears() {
        // given
        String trzy = "trzy";
        String trzech = "trzech";

        // when
        int trzyDigit = experienceUtils.recognizeYearsOfExperience(trzy);
        int trzechDigit = experienceUtils.recognizeYearsOfExperience(trzech);

        // then
        assertThat(trzyDigit, equalTo(3));
        assertThat(trzechDigit, equalTo(3));
    }

    @Test
    public void shouldRecognizeFourYears() {
        // given
        String cztery = "cztery";
        String czterech = "czterech";

        // when
        int czteryDigit = experienceUtils.recognizeYearsOfExperience(cztery);
        int czterechDigit = experienceUtils.recognizeYearsOfExperience(czterech);

        // then
        assertThat(czteryDigit, equalTo(4));
        assertThat(czterechDigit, equalTo(4));
    }

    @Test
    public void shouldRecognizeFiveYears() {
        // given
        String piec = "piec";
        String pieciu = "pieciu";

        // when
        int piecDigit = experienceUtils.recognizeYearsOfExperience(piec);
        int pieciuDigit = experienceUtils.recognizeYearsOfExperience(pieciu);

        // then
        assertThat(piecDigit, equalTo(5));
        assertThat(pieciuDigit, equalTo(5));
    }

    @Test
    public void shouldRecognizeSixYears() {
        // given
        String szesc = "szesc";
        String szesciu = "szesciu";

        // when
        int szescDigit = experienceUtils.recognizeYearsOfExperience(szesc);
        int szesciuDigit = experienceUtils.recognizeYearsOfExperience(szesciu);

        // then
        assertThat(szescDigit, equalTo(6));
        assertThat(szesciuDigit, equalTo(6));
    }

    @Test
    public void shouldRecognizeSevenYears() {
        // given
        String siedem = "siedem";
        String siedmiu = "siedmiu";

        // when
        int siedemDigit = experienceUtils.recognizeYearsOfExperience(siedem);
        int siedmiuDigit = experienceUtils.recognizeYearsOfExperience(siedmiu);

        // then
        assertThat(siedemDigit, equalTo(7));
        assertThat(siedmiuDigit, equalTo(7));
    }

    @Test
    public void shouldRecognizeEightYears() {
        // given
        String osiem = "osiem";
        String osmiu = "osmiu";

        // when
        int osiemDigit = experienceUtils.recognizeYearsOfExperience(osiem);
        int osmiuDigit = experienceUtils.recognizeYearsOfExperience(osmiu);

        // then
        assertThat(osiemDigit, equalTo(8));
        assertThat(osmiuDigit, equalTo(8));
    }

    @Test
    public void shouldRecognizeNineYears() {
        // given
        String dziewiec = "dziewiec";
        String dziewieciu = "dziewieciu";

        // when
        int dziewiecDigit = experienceUtils.recognizeYearsOfExperience(dziewiec);
        int dziewieciuDigit = experienceUtils.recognizeYearsOfExperience(dziewieciu);

        // then
        assertThat(dziewiecDigit, equalTo(9));
        assertThat(dziewieciuDigit, equalTo(9));
    }

    @Test
    public void shouldRecognizeTenYears() {
        // given
        String dziesiec = "dziesiec";
        String dziesieciu = "dziesieciu";

        // when
        int dziesiecDigit = experienceUtils.recognizeYearsOfExperience(dziesiec);
        int dziesieciuDigit = experienceUtils.recognizeYearsOfExperience(dziesieciu);

        // then
        assertThat(dziesiecDigit, equalTo(10));
        assertThat(dziesieciuDigit, equalTo(10));
    }

    @Test
    public void shouldNotRecognizeYears() {
        // given
        String someAnswer = "sto";

        // when
        int years = experienceUtils.recognizeYearsOfExperience(someAnswer);

        // then
        assertThat(years, equalTo(0));
    }
}