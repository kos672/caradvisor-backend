package root.caradvisor.name;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import root.caradvisor.AbstractUnitTest;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class NameUtilsTest extends AbstractUnitTest {

    @Autowired
    private NameUtils nameUtils;

    @Test
    public void polishCharactersShouldBeSuccessfullyReplaced() {
        // given
        String name1 = "Łukasz";
        String name2 = "Włodzimierz";
        String name3 = "Bożena";

        // when
        String replaced1 = nameUtils.replacePolishCharacters(name1);
        String replaced2 = nameUtils.replacePolishCharacters(name2);
        String replaced3 = nameUtils.replacePolishCharacters(name3);

        // then
        assertFalse(replaced1.contains("ł"));
        assertFalse(replaced2.contains("ł"));
        assertFalse(replaced3.contains("ż"));
    }

    @Test
    public void shouldRecgonizeNameAsMale() {
        // given
        String name = "Grzegorz";

        // when
        String recognizeGender = nameUtils.recognizeGender(name);

        // then
        assertThat(recognizeGender, equalTo("m"));
    }

    @Test
    public void shouldRecgonizeNameAsFemale() {
        // given
        String name = "Katarzyna";

        // when
        String recognizeGender = nameUtils.recognizeGender(name);

        // then
        assertThat(recognizeGender, equalTo("f"));
    }

    @Test
    public void shouldDontRecognizeName() {
        // given
        String name = "Kata";

        // when
        String recognizeGender = nameUtils.recognizeGender(name);

        // then
        assertThat(recognizeGender, equalTo(""));
    }
}