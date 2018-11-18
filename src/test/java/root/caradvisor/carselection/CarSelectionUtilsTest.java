package root.caradvisor.carselection;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import root.caradvisor.AbstractUnitTest;
import root.caradvisor.car.CarDto;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CarSelectionUtilsTest extends AbstractUnitTest {

    @Autowired
    private CarSelectionUtils carSelectionUtils;

    @Test
    public void shouldSelectCar() {
        // given
        CarSelection userAnswers = new CarSelection("fr", "y", "n", 4, "y");

        // given
        CarDto searchableCarObject = carSelectionUtils.selectCar(userAnswers);

        // then
        assertThat(searchableCarObject.getManufacturer(), equalTo(userAnswers.getCountryPrefs()));
        assertThat(searchableCarObject.getEngine(), equalTo("petrol"));
        assertThat(searchableCarObject.getEngineDisplacement(), equalTo(2.5));
        assertThat(searchableCarObject.getTransmission(), equalTo("automatic"));
        assertThat(searchableCarObject.getDrivetrain(), equalTo("4WD"));
        assertThat(searchableCarObject.getDoors(), equalTo(4));
        assertThat(searchableCarObject.getSeats(), equalTo(4));
    }
}