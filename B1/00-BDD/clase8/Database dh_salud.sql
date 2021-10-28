-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DH_salud
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DH_salud
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DH_salud` DEFAULT CHARACTER SET utf8 ;
USE `DH_salud` ;

-- -----------------------------------------------------
-- Table `DH_salud`.`paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DH_salud`.`paciente` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `id_salud` BIGINT(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DH_salud`.`especialidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DH_salud`.`especialidad` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DH_salud`.`medico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DH_salud`.`medico` (
  `id` INT NOT NULL,
  `matricula` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NULL,
  `nombre` VARCHAR(45) NULL,
  `especialidad_id` INT NOT NULL,
  PRIMARY KEY (`id`, `especialidad_id`),
  INDEX `fk_medico_especialidad_idx` (`especialidad_id` ASC) VISIBLE,
  CONSTRAINT `fk_medico_especialidad`
    FOREIGN KEY (`especialidad_id`)
    REFERENCES `DH_salud`.`especialidad` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DH_salud`.`turno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DH_salud`.`turno` (
  `id` INT NOT NULL,
  `fecha_turno` DATETIME NOT NULL,
  `paciente_id` INT NOT NULL,
  `medico_id` INT NOT NULL,
  PRIMARY KEY (`id`, `paciente_id`, `medico_id`),
  INDEX `fk_turno_paciente1_idx` (`paciente_id` ASC) VISIBLE,
  INDEX `fk_turno_medico1_idx` (`medico_id` ASC) VISIBLE,
  CONSTRAINT `fk_turno_paciente1`
    FOREIGN KEY (`paciente_id`)
    REFERENCES `DH_salud`.`paciente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_turno_medico1`
    FOREIGN KEY (`medico_id`)
    REFERENCES `DH_salud`.`medico` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
