package root.caradvisor.name;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import root.caradvisor.AbstractUnitTest;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class NameUtilsTest extends AbstractUnitTest {

    @Autowired
    private NameUtils nameUtils;

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