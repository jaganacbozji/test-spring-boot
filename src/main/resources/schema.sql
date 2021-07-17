DROP SEQUENCE IF EXISTS prescription_sequence;

DROP TABLE IF EXISTS vaccine;

DROP TABLE IF EXISTS manufacturer;

CREATE TABLE manufacturer (
                              id INT AUTO_INCREMENT,
                              manufacturer_name VARCHAR(100) NOT NULL,
                              PRIMARY KEY (id),
                              UNIQUE (manufacturer_name)
);


CREATE TABLE vaccine (
                         id INT AUTO_INCREMENT,
                         research_name VARCHAR(100) NOT NULL,
                         vaccine_type VARCHAR(100) NOT NULL,
                         required_number_of_shots INT NOT NULL,
                         available_number_of_shots INT NOT NULL,
                         manufacturer_id INT NOT NULL,
                         PRIMARY KEY (id),
                         UNIQUE (research_name),
                         constraint fk_manufacturer foreign key(manufacturer_id) references manufacturer(id)
);

DROP TABLE IF EXISTS side_effect;

CREATE TABLE side_effect (
                             id INT AUTO_INCREMENT,
                             short_description VARCHAR(100) NOT NULL,
                             long_description VARCHAR(100) NOT NULL,
                             frequency DOUBLE NOT NULL,
                             vaccine_id INT NOT NULL,
                             PRIMARY KEY (id),
                             UNIQUE (short_description),
                             constraint fk_vaccine foreign key(vaccine_id) references vaccine(id)
);


CREATE SEQUENCE prescription_sequence
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1;

DROP TABLE IF EXISTS medication_prescription;

CREATE TABLE medication_prescription (
                                         id INT AUTO_INCREMENT,
                                         prescription_id INT NOT NULL,
                                         prescription_name VARCHAR(100) NOT NULL,
                                         vaccine_id INT NOT NULL,
                                         PRIMARY KEY (id),
                                         UNIQUE (prescription_id),
                                         constraint fk_vaccine_2 foreign key(vaccine_id) references vaccine(id)
);


-- DROP TABLE IF EXISTS user;
--
-- CREATE TABLE user (
--                       id INT AUTO_INCREMENT,
--                       username VARCHAR(100) NOT NULL,
--                       password VARCHAR(100) NOT NULL,
--                       first_name VARCHAR(100) NOT NULL,
--                       last_name VARCHAR(100) NOT NULL,
--                       PRIMARY KEY (id)
-- );
--
--
-- DROP TABLE IF EXISTS authority;
--
-- CREATE TABLE authority (
--                            id INT AUTO_INCREMENT,
--                            name VARCHAR(100) NOT NULL,
--                            PRIMARY KEY (id)
-- );
--
-- DROP TABLE IF EXISTS user_authority;
--
-- CREATE TABLE user_authority (
--                                 id INT AUTO_INCREMENT,
--                                 user_id INT,
--                                 authority_id INT,
--                                 PRIMARY KEY (id),
--                                 constraint fk_user foreign key(user_id) references user(id),
--                                 constraint fk_authority foreign key(authority_id) references authority(id)
-- );
