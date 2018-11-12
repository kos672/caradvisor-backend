# Countires
INSERT INTO country VALUES(null, 'JP');
INSERT INTO country VALUES(null, 'FR');
INSERT INTO country VALUES(null, 'USA');
INSERT INTO country VALUES(null, 'KR');
INSERT INTO country VALUES(null, 'DE');
INSERT INTO country VALUES(null, 'CZ');

# Drivetrain types
INSERT INTO drivetrain VALUES(null, 'FWD');
INSERT INTO drivetrain VALUES(null, 'RWD');
INSERT INTO drivetrain VALUES(null, '4WD');

# Engine types
INSERT INTO engine VALUES(null, 'petrol');
INSERT INTO engine VALUES(null, 'diesel');

# Manufacturer
INSERT INTO manufacturer VALUES(null, 'Toyota');
INSERT INTO manufacturer VALUES(null, 'Mazda');
INSERT INTO manufacturer VALUES(null, 'Honda');
INSERT INTO manufacturer VALUES(null, 'Mitsubishi');
INSERT INTO manufacturer VALUES(null, 'Ford');
INSERT INTO manufacturer VALUES(null, 'Chevrolet');
INSERT INTO manufacturer VALUES(null, 'Hyundai');
INSERT INTO manufacturer VALUES(null, 'Mercedes');
INSERT INTO manufacturer VALUES(null, 'BMW');
INSERT INTO manufacturer VALUES(null, 'Opel');
INSERT INTO manufacturer VALUES(null, 'Audi');
INSERT INTO manufacturer VALUES(null, 'Citroen');
INSERT INTO manufacturer VALUES(null, 'Renault');
INSERT INTO manufacturer VALUES(null, 'Peugot');
INSERT INTO manufacturer VALUES(null, 'Skoda');

# Transmission
INSERT INTO transmission VALUES(null, 'manual');
INSERT INTO transmission VALUES(null, 'automatic');

# Cars
#(doors, engine_disp, places, ...)
INSERT INTO car VALUES(null, 5, 1.0, 'Yaris', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Toyota'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.6, 'Avensis', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Toyota'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'Camry', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Toyota'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 4.5, 'Land Cruiser', 6, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Toyota'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 3, 1.3, '323', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mazda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, '6', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mazda'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 1.8, '626', 6, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mazda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 4, 1.8, 'Civic', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Honda'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 4, 2.4, 'Accord', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Honda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 3.0, 'CR-V', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Honda'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 4, 1.0, 'Mirage', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mitsubishi'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'Lancer', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mitsubishi'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 3.0, 'Pajero', 6, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mitsubishi'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 5, 1.0, 'Fiesta', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Ford'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'Fusion', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Ford'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'Mondeo', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Ford'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 2.2, 'Ranger', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Ford'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 3, 1.2, 'Aveo', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Chevrolet'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.4, 'Lacetti', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Chevrolet'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.5, 'Trailblazer', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='RWD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Chevrolet'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 4, 1.4, 'Accent', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Hyundai'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'Elantra', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Hyundai'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.9, 'Trailblazer', 6, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Hyundai'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 5, 1.3, 'A200', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mercedes'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.8, 'C180', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='RWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mercedes'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 3.0, 'GLE350', 6, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mercedes'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 3, 1.5, '116d', 4, (SELECT id_drivetrain FROM drivetrain WHERE name='RWD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='BMW'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 2.0, '520d', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='RWD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='BMW'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 3.0, 'X3', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='BMW'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 3, 1.0, 'Corsa', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Opel'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'Vectra', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Opel'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 3, 2.2, 'Frontera', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Opel'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 5, 1.2, 'A1', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Audi'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'A5', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Audi'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'Q5', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Audi'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 5, 1.0, 'C3', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Citroen'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'C3', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Citroen'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'C-Crossover', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Citroen'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 5, 0.9, 'Clio', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Renault'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.2, 'Megane', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Renault'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.6, 'Sandero Stepway', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Renault'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 3, 1.0, '106', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Peugot'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.1, '206', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Peugot'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.4, '308', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Peugot'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 5, 1.2, 'Fabia', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Skoda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.4, 'Octavia', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Skoda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.4, 'Rapid', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Skoda'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 2.0, 'Superb', 5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Skoda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));





