-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DHTube
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DHTube
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DHTube` DEFAULT CHARACTER SET utf8 ;
USE `DHTube` ;

-- -----------------------------------------------------
-- Table `DHTube`.`Pais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`Pais` (
  `idPais` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idPais`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`Avatar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`Avatar` (
  `idAvatar` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Url` VARCHAR(100) NULL,
  PRIMARY KEY (`idAvatar`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`Usuarios` (
  ` id` INT NOT NULL,
  `Email` VARCHAR(65) NULL,
  `Password` VARCHAR(65) NULL,
  `NombreUsuario` VARCHAR(45) NULL,
  `FechaNacimiento` DATE NULL,
  `CodigoPostal` VARCHAR(15) NULL,
  `Pais_idPais` INT NOT NULL,
  `Avatar_idAvatar` INT NOT NULL,
  PRIMARY KEY (` id`, `Pais_idPais`, `Avatar_idAvatar`),
  INDEX `fk_Usuarios_Pais_idx` (`Pais_idPais` ASC) VISIBLE,
  INDEX `fk_Usuarios_Avatar1_idx` (`Avatar_idAvatar` ASC) VISIBLE,
  CONSTRAINT `fk_Usuarios_Pais`
    FOREIGN KEY (`Pais_idPais`)
    REFERENCES `DHTube`.`Pais` (`idPais`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuarios_Avatar1`
    FOREIGN KEY (`Avatar_idAvatar`)
    REFERENCES `DHTube`.`Avatar` (`idAvatar`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`Videos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`Videos` (
  `id` INT NOT NULL,
  `Titulo` VARCHAR(45) NULL,
  `Descripcion` VARCHAR(100) NULL,
  `Peso` FLOAT NULL,
  `ExtensionArchivo` VARCHAR(45) NULL,
  `Visibilidad` TINYINT NULL,
  `Duracion` TIME NULL,
  `Imagen` VARCHAR(150) NULL,
  `NumeroReproducciones` INT NULL,
  `LikesCantidad` INT NULL,
  `DislikesCantidad` INT NULL,
  `FechaPublicacion` DATETIME NULL,
  `Usuarios_ id` INT NOT NULL,
  PRIMARY KEY (`id`, `Usuarios_ id`),
  INDEX `fk_Videos_Usuarios1_idx` (`Usuarios_ id` ASC) VISIBLE,
  CONSTRAINT `fk_Videos_Usuarios1`
    FOREIGN KEY (`Usuarios_ id`)
    REFERENCES `DHTube`.`Usuarios` (` id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`Etiquetas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`Etiquetas` (
  `id` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`PlayList`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`PlayList` (
  `id` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `FechaCreacion` DATE NULL,
  `Visibilidad` TINYINT NULL,
  `Usuarios_ id` INT NOT NULL,
  PRIMARY KEY (`id`, `Usuarios_ id`),
  INDEX `fk_PlayList_Usuarios1_idx` (`Usuarios_ id` ASC) VISIBLE,
  CONSTRAINT `fk_PlayList_Usuarios1`
    FOREIGN KEY (`Usuarios_ id`)
    REFERENCES `DHTube`.`Usuarios` (` id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`Canal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`Canal` (
  `idCanal` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Descripcion` VARCHAR(200) NULL,
  `FechaCreacion` DATE NULL,
  `Usuarios_ id` INT NOT NULL,
  PRIMARY KEY (`idCanal`, `Usuarios_ id`),
  INDEX `fk_Canal_Usuarios1_idx` (`Usuarios_ id` ASC) VISIBLE,
  CONSTRAINT `fk_Canal_Usuarios1`
    FOREIGN KEY (`Usuarios_ id`)
    REFERENCES `DHTube`.`Usuarios` (` id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`Registros`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`Registros` (
  `id` INT NOT NULL,
  `FechaReaccion` DATETIME NULL,
  `Usuarios_ id` INT NOT NULL,
  `Videos_id` INT NOT NULL,
  PRIMARY KEY (`id`, `Usuarios_ id`, `Videos_id`),
  INDEX `fk_Usuarios_has_Videos_Videos1_idx` (`Videos_id` ASC) VISIBLE,
  INDEX `fk_Usuarios_has_Videos_Usuarios1_idx` (`Usuarios_ id` ASC) VISIBLE,
  CONSTRAINT `fk_Usuarios_has_Videos_Usuarios1`
    FOREIGN KEY (`Usuarios_ id`)
    REFERENCES `DHTube`.`Usuarios` (` id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuarios_has_Videos_Videos1`
    FOREIGN KEY (`Videos_id`)
    REFERENCES `DHTube`.`Videos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`Reacciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`Reacciones` (
  `idReacciones` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Registros_id` INT NOT NULL,
  PRIMARY KEY (`idReacciones`, `Registros_id`),
  INDEX `fk_Reacciones_Registros1_idx` (`Registros_id` ASC) VISIBLE,
  CONSTRAINT `fk_Reacciones_Registros1`
    FOREIGN KEY (`Registros_id`)
    REFERENCES `DHTube`.`Registros` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`Videos_Etiquetas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`Videos_Etiquetas` (
  `id` INT NOT NULL,
  `Videos_id` INT NOT NULL,
  `Etiquetas_id` INT NOT NULL,
  PRIMARY KEY (`id`, `Videos_id`, `Etiquetas_id`),
  INDEX `fk_Videos_has_Etiquetas_Etiquetas1_idx` (`Etiquetas_id` ASC) VISIBLE,
  INDEX `fk_Videos_has_Etiquetas_Videos1_idx` (`Videos_id` ASC) VISIBLE,
  CONSTRAINT `fk_Videos_has_Etiquetas_Videos1`
    FOREIGN KEY (`Videos_id`)
    REFERENCES `DHTube`.`Videos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Videos_has_Etiquetas_Etiquetas1`
    FOREIGN KEY (`Etiquetas_id`)
    REFERENCES `DHTube`.`Etiquetas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DHTube`.`PlayList_Videos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHTube`.`PlayList_Videos` (
  `id` INT NOT NULL,
  `PlayList_id` INT NOT NULL,
  `Videos_id` INT NOT NULL,
  PRIMARY KEY (`id`, `PlayList_id`, `Videos_id`),
  INDEX `fk_PlayList_has_Videos_Videos1_idx` (`Videos_id` ASC) VISIBLE,
  INDEX `fk_PlayList_has_Videos_PlayList1_idx` (`PlayList_id` ASC) VISIBLE,
  CONSTRAINT `fk_PlayList_has_Videos_PlayList1`
    FOREIGN KEY (`PlayList_id`)
    REFERENCES `DHTube`.`PlayList` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PlayList_has_Videos_Videos1`
    FOREIGN KEY (`Videos_id`)
    REFERENCES `DHTube`.`Videos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
