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
INSERT INTO manufacturer VALUES (null, 'Toyota', (SELECT id_country
                                                  FROM country
                                                  WHERE name = 'JP'));
INSERT INTO manufacturer VALUES (null, 'Mazda', (SELECT id_country
                                                 FROM country
                                                 WHERE name = 'JP'));
INSERT INTO manufacturer VALUES (null, 'Honda', (SELECT id_country
                                                 FROM country
                                                 WHERE name = 'JP'));
INSERT INTO manufacturer VALUES (null, 'Mitsubishi', (SELECT id_country
                                                      FROM country
                                                      WHERE name = 'JP'));
INSERT INTO manufacturer VALUES (null, 'Ford', (SELECT id_country
                                                FROM country
                                                WHERE name = 'USA'));
INSERT INTO manufacturer VALUES (null, 'Chevrolet', (SELECT id_country
                                                     FROM country
                                                     WHERE name = 'USA'));
INSERT INTO manufacturer VALUES (null, 'Hyundai', (SELECT id_country
                                                   FROM country
                                                   WHERE name = 'KR'));
INSERT INTO manufacturer VALUES (null, 'Mercedes', (SELECT id_country
                                                    FROM country
                                                    WHERE name = 'DE'));
INSERT INTO manufacturer VALUES (null, 'BMW', (SELECT id_country
                                               FROM country
                                               WHERE name = 'DE'));
INSERT INTO manufacturer VALUES (null, 'Opel', (SELECT id_country
                                                FROM country
                                                WHERE name = 'DE'));
INSERT INTO manufacturer VALUES (null, 'Audi', (SELECT id_country
                                                FROM country
                                                WHERE name = 'DE'));
INSERT INTO manufacturer VALUES (null, 'Citroen', (SELECT id_country
                                                   FROM country
                                                   WHERE name = 'FR'));
INSERT INTO manufacturer VALUES (null, 'Renault', (SELECT id_country
                                                   FROM country
                                                   WHERE name = 'FR'));
INSERT INTO manufacturer VALUES (null, 'Peugeot', (SELECT id_country
                                                  FROM country
                                                  WHERE name = 'FR'));
INSERT INTO manufacturer VALUES (null, 'Skoda', (SELECT id_country
                                                 FROM country
                                                 WHERE name = 'CZ'));

# Transmission
INSERT INTO transmission VALUES(null, 'manual');
INSERT INTO transmission VALUES(null, 'automatic');

# Cars
#(doors, engine_disp, places, ...)
INSERT INTO car VALUES(null, 5, 1.0, 'Yaris', 5, 'https://upload.wikimedia.org/wikipedia/commons/c/cd/2012_Toyota_Yaris_%28NCP131R%29_YRS_5-door_hatchback_%282015-06-18%29_01.jpg', 4.7,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Toyota'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.6, 'Avensis', 5, 'https://upload.wikimedia.org/wikipedia/commons/4/48/Toyota_Avensis_%28II%29_%E2%80%93_Frontansicht%2C_1._September_2013%2C_M%C3%BCnster.jpg', 7.3, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Toyota'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'Camry', 5,
'https://upload.wikimedia.org/wikipedia/commons/2/2b/2005-06_Toyota_Camry_XLE.jpg', 9.5, (SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Toyota'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 4.5, 'Land Cruiser', 6,
'https://upload.wikimedia.org/wikipedia/commons/6/67/Toyota_Land_Cruiser_120_D-4D_front.jpg', 12.4, (SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Toyota'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 3, 1.3, '323', 4,
'https://upload.wikimedia.org/wikipedia/commons/e/ec/Mazda_323_front_20080222.jpg', 7.1,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mazda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, '6', 5, 'https://upload.wikimedia.org/wikipedia/commons/a/af/Mazda_6_Mk3.jpg', 9.3,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mazda'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 1.8, '626', 6,
'https://upload.wikimedia.org/wikipedia/commons/f/f3/Mazda_626_GF_2.0.JPG', 8.2,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mazda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 4, 1.8, 'Civic', 4,
'https://upload.wikimedia.org/wikipedia/commons/f/f0/04-05_Honda_Civic_LX_sedan.jpg', 7.9,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Honda'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 4, 2.4, 'Accord', 4,
'https://upload.wikimedia.org/wikipedia/commons/1/16/2003-2005_Honda_Accord_Euro_Luxury_sedan_%282010-09-19%29_01.jpg', 9.6,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Honda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 3.0, 'CR-V', 5,
'https://upload.wikimedia.org/wikipedia/commons/d/d3/Honda_CRV_3_front_20071106.jpg', 10.7,
(SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Honda'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 4, 1.0, 'Mirage', 4,
'https://upload.wikimedia.org/wikipedia/commons/5/59/2017_Mitsubishi_Mirage_%28LA_MY17%29_ES_hatchback_%282018-04-24%29_01.jpg', 4.7,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mitsubishi'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'Lancer', 4,
'https://upload.wikimedia.org/wikipedia/commons/6/6f/Mitsubishi_Lancer_Mk7_front.jpg', 7.9,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mitsubishi'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 3.0, 'Pajero', 6,
'https://upload.wikimedia.org/wikipedia/commons/b/b4/2003-2007_Toyota_Land_Cruiser_Prado_%28GRJ120R%29_02.jpg', 13.3,
(SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mitsubishi'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 5, 1.0, 'Fiesta', 4,
'https://upload.wikimedia.org/wikipedia/commons/7/7d/2017_Ford_Fiesta_Zetec_Turbo_1.0_Front.jpg', 7.0,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Ford'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'Fusion', 4,
'https://upload.wikimedia.org/wikipedia/commons/2/2f/Ford_Fusion_Facelift_front.jpg', 7.6,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Ford'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'Mondeo', 4,
'https://upload.wikimedia.org/wikipedia/commons/3/31/2017_Ford_Mondeo_%28MD%29_Ambiente_station_wagon_%282018-03-07%29_01.jpg', 9.3,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Ford'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 2.2, 'Ranger', 5,
'https://upload.wikimedia.org/wikipedia/commons/d/db/Ford_Ranger_2.2_TDCi_Limited_Doppelkabine_%28III%29_%E2%80%93_Frontansicht%2C_6._April_2012%2C_Velbert.jpg', 11.2,
(SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Ford'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 3, 1.2, 'Aveo', 5,
'https://upload.wikimedia.org/wikipedia/commons/d/d0/2009_Chevrolet_Aveo_Eco_Logic_3door.JPG', 6.6,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Chevrolet'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.4, 'Lacetti', 5,
'https://upload.wikimedia.org/wikipedia/commons/0/0d/Chevrolet_Lacetti_front.JPG', 7.6,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Chevrolet'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.5, 'Trailblazer', 5,
'https://upload.wikimedia.org/wikipedia/commons/3/34/2002-2005_Chevrolet_TrailBlazer.jpg', 11.5,
(SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Chevrolet'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 4, 1.4, 'Accent', 5,
'https://upload.wikimedia.org/wikipedia/commons/2/2f/Hyundai_Accent_GLS_sedan.jpg', 7.8,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Hyundai'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'Elantra', 5,
'https://upload.wikimedia.org/wikipedia/commons/f/fe/2011_Hyundai_Elantra_GLS_--_06-02-2011_1.jpg', 7.5,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Hyundai'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.4, 'Tucson', 6,
'https://upload.wikimedia.org/wikipedia/commons/9/95/Hyundai_Tucson_2.0_CRDi_4WD_Premium_%28III%29_%E2%80%93_Frontansicht%2C_5._September_2015%2C_D%C3%BCsseldorf.jpg', 10.6,
(SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Hyundai'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 5, 1.3, 'A200', 5,
'https://upload.wikimedia.org/wikipedia/commons/5/53/Mercedes-Benz_A_200_Urban_Night-Paket_%28W_176%29_%E2%80%93_Frontansicht%2C_1._Juni_2013%2C_D%C3%BCsseldorf.jpg', 6.2,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mercedes'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.8, 'C180', 5,
'https://upload.wikimedia.org/wikipedia/commons/3/3a/Mercedes_Benz_C_180_CGi_2013_%2811410856014%29.jpg', 8.7,
(SELECT id_drivetrain FROM drivetrain WHERE name='RWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mercedes'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 3.0, 'GLE350', 6,
'https://upload.wikimedia.org/wikipedia/commons/0/0e/Mercedes-Benz_GLE_350_d_4MATIC_Coup%C3%A9_%28C_292%29_%E2%80%93_Frontansicht%2C_12._Juni_2017%2C_D%C3%BCsseldorf.jpg', 11.4,
(SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Mercedes'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 3, 1.5, '116d', 4,
'https://upload.wikimedia.org/wikipedia/commons/4/42/BMW_135i_in_Alpine_White_with_BMW_Performance_upgrades_night_shot.jpg', 6.2,
(SELECT id_drivetrain FROM drivetrain WHERE name='RWD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='BMW'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 2.0, '520d', 5,
'https://upload.wikimedia.org/wikipedia/commons/4/43/2018_BMW_520d_M_Sport_Automatic_2.0.jpg', 10.8,
(SELECT id_drivetrain FROM drivetrain WHERE name='RWD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='BMW'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 3.0, 'X3', 5,
'https://upload.wikimedia.org/wikipedia/commons/e/ea/2015_BMW_X3_%28F25_LCI%29_xDrive20d_wagon_%282015-06-27%29.jpg', 13.3,
(SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='BMW'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 3, 1.0, 'Corsa', 5,
'https://upload.wikimedia.org/wikipedia/commons/e/e9/Opel_Corsa_B_WorldCup_Facelift.JPG', 6.6,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Opel'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'Vectra', 5,
'https://upload.wikimedia.org/wikipedia/commons/1/13/Opel_Vectra_C_2.2_Direkt_front.JPG', 7.7,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Opel'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.2, 'Frontera', 5,
'https://upload.wikimedia.org/wikipedia/commons/7/75/1999_Vauxhall_Frontera_Limited_DTi_Automatic_2.2_Front.jpg', 10.0,
(SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Opel'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 5, 1.2, 'A1', 5,
'https://upload.wikimedia.org/wikipedia/commons/a/a9/Audi_A1_Sportback_1.4_TFSI_Attraction_%E2%80%93_Frontansicht%2C_26._Oktober_2012%2C_D%C3%BCsseldorf.jpg', 6.4,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Audi'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'A5', 5,
'https://upload.wikimedia.org/wikipedia/commons/b/b1/2010_Audi_A5_%288T%29_3.0_TDI_quattro_Sportback_03.jpg', 9.4,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Audi'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'Q5', 5,
'https://upload.wikimedia.org/wikipedia/commons/b/b0/Audi_Q5_Facelift_S_line_2.0_TFSI_quattro_tiptronic_Daytonagrau.JPG', 11.4,
(SELECT id_drivetrain FROM drivetrain WHERE name='4WD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Audi'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));

INSERT INTO car VALUES(null, 5, 1.0, 'C3', 5,
'https://upload.wikimedia.org/wikipedia/commons/5/53/Citro%C3%ABn_C3_e-HDi_110_Airdream_Red_Block_%28II%29_%E2%80%93_Frontansicht%2C_21._April_2017%2C_D%C3%BCsseldorf.jpg', 5.6,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Citroen'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 4, 1.6, 'C5', 5,
'https://upload.wikimedia.org/wikipedia/commons/4/4b/Citro%C3%ABn_C5_II_front-1.JPG', 6.2,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Citroen'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 2.0, 'C-Crossover', 5,
'https://upload.wikimedia.org/wikipedia/commons/9/90/Citroen_C-Crosser.jpg', 10.5,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Citroen'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 5, 0.9, 'Clio', 5,
'https://upload.wikimedia.org/wikipedia/commons/3/3b/Renault_Clio_III_Phase_I_Grandtour_Atacamabeige.JPG', 6.3,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Renault'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.2, 'Megane', 5,
'https://upload.wikimedia.org/wikipedia/commons/1/17/Renault_Megane_front_20071204.jpg', 7.1,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Renault'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.6, 'Sandero Stepway', 5,
'https://upload.wikimedia.org/wikipedia/commons/6/64/Renault-Sandero_Stepway_Brazil-2017.jpg', 9.5,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Renault'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 3, 1.0, '106', 5,
'https://upload.wikimedia.org/wikipedia/commons/6/64/Peugeot_106_front_20070609.jpg', 7.0,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Peugeot'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.1, '206', 5,
'https://upload.wikimedia.org/wikipedia/commons/2/21/2002_Peugeot_206_LX_1.4_Front.jpg', 7.2,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Peugeot'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.4, '308', 5,
'https://upload.wikimedia.org/wikipedia/commons/b/b8/Peugeot_308_5-T%C3%BCrer_front-1.JPG', 8.6,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Peugeot'),
(SELECT id_transmission FROM transmission WHERE name='manual'));

INSERT INTO car VALUES(null, 5, 1.2, 'Fabia', 5,
'https://upload.wikimedia.org/wikipedia/commons/8/81/Skoda_Fabia_Sedan_1.4_16V_%28I%2C_Facelift%29_%E2%80%93_Frontansicht%2C_15._Juni_2011%2C_W%C3%BClfrath.jpg', 6.8,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Skoda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.6, 'Octavia', 5,
'https://upload.wikimedia.org/wikipedia/commons/5/5d/2018_Skoda_Octavia_SE_TDi_S-A_1.6_Front.jpg', 7.9,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Skoda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));
INSERT INTO car VALUES(null, 5, 1.4, 'Rapid', 5,
'https://upload.wikimedia.org/wikipedia/commons/0/0a/Skoda_Rapid_1.2_TSI_Ambition_%E2%80%93_Frontansicht%2C_31._Dezember_2012%2C_D%C3%BCsseldorf.jpg', 6.2,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='petrol'), (SELECT id_manufacturer FROM manufacturer WHERE name='Skoda'),
(SELECT id_transmission FROM transmission WHERE name='automatic'));
INSERT INTO car VALUES(null, 5, 2.0, 'Superb', 5,
'https://upload.wikimedia.org/wikipedia/commons/6/62/2017_Skoda_Superb_%28NP%29_140TDI_station_wagon_%282018-04-13%29_01.jpg', 8.9,
(SELECT id_drivetrain FROM drivetrain WHERE name='FWD'),
(SELECT id_engine FROM engine WHERE name='diesel'), (SELECT id_manufacturer FROM manufacturer WHERE name='Skoda'),
(SELECT id_transmission FROM transmission WHERE name='manual'));





