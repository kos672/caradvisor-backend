package root.caradvisor.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import root.caradvisor.model.Car;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    @Query("from car as car where car.engine.name = :engine and " +
            "car.engineDisplacement <= :engineDisplacement and " +
            "car.transmission.name = :transmission and " +
            "car.drivetrain.name = :drivetrain and " +
            "car.doors >= :doors and " +
            "car.seats >= :seats")
    List<Car> findByEngineAndEngineDisplacementAndTransmissionAndDrivetrainAndDoorsAndSeats
            (@Param("engine") String engine,
             @Param("engineDisplacement") BigDecimal engineDisplacement,
             @Param("transmission") String transmission,
             @Param("drivetrain") String drivetrain,
             @Param("doors") int doors,
             @Param("seats") int seats);

    @Query("from car as car where car.manufacturer.country.name = :manufacturer and " +
            "car.engine.name = :engine and " +
            "car.engineDisplacement <= :engineDisplacement and " +
            "car.transmission.name = :transmission and " +
            "car.drivetrain.name <> :drivetrain and " +
            "car.doors >= :doors and " +
            "car.seats >= :seats")
    List<Car> findByManufacturerAndEngineAndEngineDisplacementAndTransmissionAndNot4WDAndDoorsAndSeats
            (@Param("manufacturer") String manufacturer,
             @Param("engine") String engine,
             @Param("engineDisplacement") BigDecimal engineDisplacement,
             @Param("transmission") String transmission,
             @Param("drivetrain") String drivetrain,
             @Param("doors") int doors,
             @Param("seats") int seats);

    @Query("from car as car where car.engine.name = :engine and " +
            "car.engineDisplacement <= :engineDisplacement and " +
            "car.transmission.name = :transmission and " +
            "car.drivetrain.name <> :drivetrain and " +
            "car.doors >= :doors and " +
            "car.seats >= :seats")
    List<Car> findByEngineAndEngineDisplacementAndTransmissionAndNot4WDAndDoorsAndSeats
            (@Param("engine") String engine,
             @Param("engineDisplacement") BigDecimal engineDisplacement,
             @Param("transmission") String transmission,
             @Param("drivetrain") String drivetrain,
             @Param("doors") int doors,
             @Param("seats") int seats);

    @Query("from car as car where car.manufacturer.country.name = :manufacturer and " +
            "car.engine.name = :engine and " +
            "car.engineDisplacement <= :engineDisplacement and " +
            "car.transmission.name = :transmission and " +
            "car.drivetrain.name = :drivetrain and " +
            "car.doors >= :doors and " +
            "car.seats >= :seats")
    List<Car> findByManufacturerAndEngineAndEngineDisplacementAndTransmissionAndDrivetrainAndDoorsAndSeats
            (@Param("manufacturer") String manufacturer,
             @Param("engine") String engine,
             @Param("engineDisplacement") BigDecimal engineDisplacement,
             @Param("transmission") String transmission,
             @Param("drivetrain") String drivetrain,
             @Param("doors") int doors,
             @Param("seats") int seats);


}
