CREATE TABLE country (
  id_country INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255)
);

CREATE TABLE drivetrain (
  id_drivetrain INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255)
);

CREATE TABLE engine (
  id_engine INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255)
);

CREATE TABLE manufacturer (
  id_manufacturer INT PRIMARY KEY AUTO_INCREMENT,
  name            VARCHAR(255),
  id_country      INT NOT NULL
);

CREATE TABLE transmission (
  id_transmission INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255)
);

CREATE TABLE car (
  id_car INT PRIMARY KEY AUTO_INCREMENT,
  doors INT,
  engine_displacement FLOAT,
  model VARCHAR(255),
  seats INT,
  id_drivetrain INT,
  id_engine INT,
  id_manufacturer INT,
  id_transmission INT
);

ALTER TABLE manufacturer
  ADD CONSTRAINT FK_MANUFACTURER_COUNTRY FOREIGN KEY (id_country)
REFERENCES country (id_country);

ALTER TABLE car
  ADD CONSTRAINT FK_CAR_DRIVETRAIN FOREIGN KEY (id_drivetrain)
REFERENCES drivetrain (id_drivetrain);

ALTER TABLE car
  ADD CONSTRAINT FK_CAR_ENGINE FOREIGN KEY (id_engine)
REFERENCES engine (id_engine);

ALTER TABLE car
  ADD CONSTRAINT FK_CAR_MANUFACTURER FOREIGN KEY (id_manufacturer)
REFERENCES manufacturer (id_manufacturer);

ALTER TABLE car
  ADD CONSTRAINT FK_CAR_TRANSMISSION FOREIGN KEY (id_transmission)
REFERENCES transmission (id_transmission);
