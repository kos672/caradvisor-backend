package root.caradvisor.carselection;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarSelection {

    @JsonProperty("countryPrefs")
    private String countryPrefs;

    @JsonProperty("family")
    private String family;

    @JsonProperty("offroadOftenDriven")
    private String oftenOffroadDriving;

    @JsonProperty("yearsOfDriving")
    private int yearsOfDriving;

    @JsonProperty("ableToPayExtra")
    private String ableToPayExtra;
}
