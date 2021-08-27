-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Spotify
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Spotify
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Spotify` DEFAULT CHARACTER SET utf8 ;
USE `Spotify` ;

-- -----------------------------------------------------
-- Table `Spotify`.`pass`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`pass` (
  `id` INT NOT NULL,
  `fecha_modif` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`playlist_borrada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`playlist_borrada` (
  `id` INT NOT NULL,
  `activa_borrada` TINYINT NULL,
  `fecha_eliminacion` DATE NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`playlist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`playlist` (
  `id` INT NOT NULL,
  `titulo` VARCHAR(45) NULL,
  `numero_canciones` INT NULL,
  `fecha_creacion` DATE NULL,
  `playlist_borrada_id` INT NOT NULL,
  PRIMARY KEY (`id`, `playlist_borrada_id`),
  INDEX `fk_playlist_playlist_borrada1_idx` (`playlist_borrada_id` ASC) VISIBLE,
  CONSTRAINT `fk_playlist_playlist_borrada1`
    FOREIGN KEY (`playlist_borrada_id`)
    REFERENCES `Spotify`.`playlist_borrada` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`usuario` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `email` VARCHAR(50) NULL,
  `fecha_nacimiento` DATE NULL,
  `codigo_postal` VARCHAR(20) NULL,
  `pais` VARCHAR(45) NULL,
  `sexo` VARCHAR(45) NULL,
  `pass_id` INT NOT NULL,
  `playlist_id` INT NOT NULL,
  PRIMARY KEY (`id`, `pass_id`, `playlist_id`),
  INDEX `fk_usuario_pass_idx` (`pass_id` ASC) VISIBLE,
  INDEX `fk_usuario_playlist1_idx` (`playlist_id` ASC) VISIBLE,
  CONSTRAINT `fk_usuario_pass`
    FOREIGN KEY (`pass_id`)
    REFERENCES `Spotify`.`pass` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_playlist1`
    FOREIGN KEY (`playlist_id`)
    REFERENCES `Spotify`.`playlist` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`genero` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`cancion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`cancion` (
  `id` INT NOT NULL,
  `titulo` VARCHAR(45) NULL,
  `duracion` FLOAT NULL,
  `reproducciones` BIGINT NULL,
  `likes` BIGINT NULL,
  `genero_id` INT NOT NULL,
  PRIMARY KEY (`id`, `genero_id`),
  INDEX `fk_cancion_genero1_idx` (`genero_id` ASC) VISIBLE,
  CONSTRAINT `fk_cancion_genero1`
    FOREIGN KEY (`genero_id`)
    REFERENCES `Spotify`.`genero` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`album`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`album` (
  `id` INT NOT NULL,
  `titulo` VARCHAR(45) NULL,
  `anio_publicacion` YEAR NULL,
  `discografica` VARCHAR(45) NULL,
  `portada` BLOB NULL,
  `cancion_id` INT NOT NULL,
  PRIMARY KEY (`id`, `cancion_id`),
  INDEX `fk_album_cancion1_idx` (`cancion_id` ASC) VISIBLE,
  CONSTRAINT `fk_album_cancion1`
    FOREIGN KEY (`cancion_id`)
    REFERENCES `Spotify`.`cancion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`artista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`artista` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `foto` BLOB NULL,
  `album_id` INT NOT NULL,
  `album_cancion_id` INT NOT NULL,
  PRIMARY KEY (`id`, `album_id`, `album_cancion_id`),
  INDEX `fk_artista_album1_idx` (`album_id` ASC, `album_cancion_id` ASC) VISIBLE,
  CONSTRAINT `fk_artista_album1`
    FOREIGN KEY (`album_id` , `album_cancion_id`)
    REFERENCES `Spotify`.`album` (`id` , `cancion_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`discografica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`discografica` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `pais` VARCHAR(45) NULL,
  `album_id` INT NOT NULL,
  `album_cancion_id` INT NOT NULL,
  PRIMARY KEY (`id`, `album_id`, `album_cancion_id`),
  INDEX `fk_discografica_album1_idx` (`album_id` ASC, `album_cancion_id` ASC) VISIBLE,
  CONSTRAINT `fk_discografica_album1`
    FOREIGN KEY (`album_id` , `album_cancion_id`)
    REFERENCES `Spotify`.`album` (`id` , `cancion_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`playlist_cancion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`playlist_cancion` (
  `id` INT NOT NULL,
  `playlist_id` INT NOT NULL,
  `cancion_id` INT NOT NULL,
  PRIMARY KEY (`id`, `playlist_id`, `cancion_id`),
  INDEX `fk_playlist_canciones_playlist1_idx` (`playlist_id` ASC) VISIBLE,
  INDEX `fk_playlist_canciones_cancion1_idx` (`cancion_id` ASC) VISIBLE,
  CONSTRAINT `fk_playlist_canciones_playlist1`
    FOREIGN KEY (`playlist_id`)
    REFERENCES `Spotify`.`playlist` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_playlist_canciones_cancion1`
    FOREIGN KEY (`cancion_id`)
    REFERENCES `Spotify`.`cancion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Spotify`.`cancion_artista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Spotify`.`cancion_artista` (
  `id` INT NOT NULL,
  `cancion_id` INT NOT NULL,
  `artistas_id` INT NOT NULL,
  PRIMARY KEY (`id`, `cancion_id`, `artistas_id`),
  INDEX `fk_canciones_artistas_cancion1_idx` (`cancion_id` ASC) VISIBLE,
  INDEX `fk_canciones_artistas_artistas1_idx` (`artistas_id` ASC) VISIBLE,
  CONSTRAINT `fk_canciones_artistas_cancion1`
    FOREIGN KEY (`cancion_id`)
    REFERENCES `Spotify`.`cancion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_canciones_artistas_artistas1`
    FOREIGN KEY (`artistas_id`)
    REFERENCES `Spotify`.`artista` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
