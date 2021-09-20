-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema DHtube
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DHtube
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DHtube` DEFAULT CHARACTER SET latin1 ;
USE `DHtube` ;

-- -----------------------------------------------------
-- Table `DHtube`.`avatar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`avatar` (
  `idAvatar` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `urlimagen` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`idAvatar`))
ENGINE = InnoDB
AUTO_INCREMENT = 86
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`pais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`pais` (
  `idPais` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`idPais`))
ENGINE = InnoDB
AUTO_INCREMENT = 196
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `fechaNacimiento` DATETIME NULL DEFAULT NULL,
  `codigoPostal` VARCHAR(10) NULL DEFAULT NULL,
  `Pais_idPais` INT NOT NULL,
  `Avatar_idAvatar` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  INDEX `fk_Usuario_Pais1_idx` (`Pais_idPais` ASC) VISIBLE,
  INDEX `fk_Usuario_Avatar1_idx` (`Avatar_idAvatar` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_Avatar1`
    FOREIGN KEY (`Avatar_idAvatar`)
    REFERENCES `DHtube`.`avatar` (`idAvatar`),
  CONSTRAINT `fk_Usuario_Pais1`
    FOREIGN KEY (`Pais_idPais`)
    REFERENCES `DHtube`.`pais` (`idPais`))
ENGINE = InnoDB
AUTO_INCREMENT = 22
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`canal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`canal` (
  `idCanal` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `descripcion` TEXT NULL DEFAULT NULL,
  `fechaCreacion` DATETIME NULL DEFAULT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idCanal`),
  INDEX `fk_Canal_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Canal_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `DHtube`.`usuario` (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`etiqueta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`etiqueta` (
  `idEtiqueta` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idEtiqueta`))
ENGINE = InnoDB
AUTO_INCREMENT = 88
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`playlist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`playlist` (
  `idPlaylist` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `fechaCreacion` DATETIME NULL DEFAULT NULL,
  `privado` TINYINT(1) NULL DEFAULT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  PRIMARY KEY (`idPlaylist`),
  INDEX `fk_Playlist_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Playlist_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `DHtube`.`usuario` (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`video`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`video` (
  `idVideo` INT NOT NULL AUTO_INCREMENT,
  `Usuario_idUsuario` INT NOT NULL,
  `titulo` VARCHAR(100) NULL DEFAULT NULL,
  `descripcion` TEXT NULL DEFAULT NULL,
  `tamanio` DOUBLE NULL DEFAULT NULL,
  `nombreArchivo` VARCHAR(100) NULL DEFAULT NULL,
  `duracion` DOUBLE NULL DEFAULT NULL,
  `imagen` VARCHAR(100) NULL DEFAULT NULL,
  `cantidadReproducciones` INT NULL DEFAULT NULL,
  `cantidadLikes` INT NULL DEFAULT NULL,
  `cantidadDislikes` INT NULL DEFAULT NULL,
  `privado` SMALLINT NULL DEFAULT NULL,
  `fechaPublicacion` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`idVideo`),
  INDEX `fk_Video_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Video_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `DHtube`.`usuario` (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`playlist_video`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`playlist_video` (
  `Video_idVideo` INT NOT NULL,
  `Playlist_idPlaylist` INT NOT NULL,
  INDEX `fk_PlayList-Video_Video1_idx` (`Video_idVideo` ASC) VISIBLE,
  INDEX `fk_PlayList-Video_Playlist1_idx` (`Playlist_idPlaylist` ASC) VISIBLE,
  CONSTRAINT `fk_PlayList-Video_Playlist1`
    FOREIGN KEY (`Playlist_idPlaylist`)
    REFERENCES `DHtube`.`playlist` (`idPlaylist`),
  CONSTRAINT `fk_PlayList-Video_Video1`
    FOREIGN KEY (`Video_idVideo`)
    REFERENCES `DHtube`.`video` (`idVideo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`tiporeaccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`tiporeaccion` (
  `idTipoReaccion` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idTipoReaccion`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`reaccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`reaccion` (
  `idReaccion` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATETIME NULL DEFAULT NULL,
  `TipoReaccion_idTipoReaccion` INT NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  `Video_idVideo` INT NOT NULL,
  PRIMARY KEY (`idReaccion`),
  INDEX `fk_Reaccion_TipoReaccion1_idx` (`TipoReaccion_idTipoReaccion` ASC) VISIBLE,
  INDEX `fk_Reaccion_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  INDEX `fk_Reaccion_Video1_idx` (`Video_idVideo` ASC) VISIBLE,
  CONSTRAINT `fk_Reaccion_TipoReaccion1`
    FOREIGN KEY (`TipoReaccion_idTipoReaccion`)
    REFERENCES `DHtube`.`tiporeaccion` (`idTipoReaccion`),
  CONSTRAINT `fk_Reaccion_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `DHtube`.`usuario` (`idUsuario`),
  CONSTRAINT `fk_Reaccion_Video1`
    FOREIGN KEY (`Video_idVideo`)
    REFERENCES `DHtube`.`video` (`idVideo`))
ENGINE = InnoDB
AUTO_INCREMENT = 92
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `DHtube`.`video_etiqueta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DHtube`.`video_etiqueta` (
  `Video_idVideo` INT NOT NULL,
  `Etiqueta_idEtiqueta` INT NOT NULL,
  INDEX `fk_Video-Etiqueta_Video1_idx` (`Video_idVideo` ASC) VISIBLE,
  INDEX `fk_Video-Etiqueta_Etiqueta1_idx` (`Etiqueta_idEtiqueta` ASC) VISIBLE,
  CONSTRAINT `fk_Video-Etiqueta_Etiqueta1`
    FOREIGN KEY (`Etiqueta_idEtiqueta`)
    REFERENCES `DHtube`.`etiqueta` (`idEtiqueta`),
  CONSTRAINT `fk_Video-Etiqueta_Video1`
    FOREIGN KEY (`Video_idVideo`)
    REFERENCES `DHtube`.`video` (`idVideo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
