package root.caradvisor.car;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarDto {

    private Integer id;
    private String manufacturer;
    private String model;
    private String engine;
    private Double engineDisplacement;
    private String imagePath;
    private String transmission;
    private String drivetrain;
    private Integer doors;
    private Integer seats;

}
