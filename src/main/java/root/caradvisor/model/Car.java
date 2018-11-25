package root.caradvisor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity(name = "car")
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_manufacturer", nullable = false)
    private Manufacturer manufacturer;

    @Column(name = "model", nullable = false)
    private String model;

    @ManyToOne
    @JoinColumn(name = "id_engine", nullable = false)
    private Engine engine;

    @Column(name = "engine_displacement", nullable = false)
    private BigDecimal engineDisplacement;

    @Column(name = "image_path")
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "id_transmission", nullable = false)
    private Transmission transmission;

    @ManyToOne
    @JoinColumn(name = "id_drivetrain", nullable = false)
    private Drivetrain drivetrain;

    @Column(name = "doors", nullable = false)
    private Integer doors;

    @Column(name = "seats", nullable = false)
    private Integer seats;
}
