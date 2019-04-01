-- MySQL Script generated by MySQL Workbench
-- Sun Mar 31 21:16:40 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema rent_cars
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema rent_cars
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `rent_cars` DEFAULT CHARACTER SET utf8 ;
USE `rent_cars` ;

-- -----------------------------------------------------
-- Table `rent_cars`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rent_cars`.`User` (
  `id_user` INT NOT NULL,
  `user_name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `role` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `rent_cars`.`Car`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rent_cars`.`Car` (
  `id_car` INT NOT NULL,
  `status` VARCHAR(10) NOT NULL,
  `mileage` INT UNSIGNED NOT NULL,
  `transmission` VARCHAR(45) NOT NULL,
  `supplier` VARCHAR(45) NOT NULL,
  `engine_type` VARCHAR(20) NOT NULL,
  `class_car` VARCHAR(20) NOT NULL,
  `has_conditioner` TINYINT NOT NULL,
  PRIMARY KEY (`id_car`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `rent_cars`.`Booking`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rent_cars`.`Booking` (
  `id_booking` INT NOT NULL,
  `date` DATE NOT NULL,
  `cost` INT UNSIGNED NOT NULL,
  `id_car` INT NOT NULL,
  `id_user` INT NOT NULL,
  PRIMARY KEY (`id_booking`),
  INDEX `fk_Booking_Car1_idx` (`id_car` ASC) VISIBLE,
  INDEX `fk_Booking_User1_idx` (`id_user` ASC) VISIBLE,
  UNIQUE INDEX `id_user_UNIQUE` (`id_user` ASC) VISIBLE,
  CONSTRAINT `fk_Booking_Car1`
    FOREIGN KEY (`id_car`)
    REFERENCES `rent_cars`.`Car` (`id_car`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Booking_User1`
    FOREIGN KEY (`id_user`)
    REFERENCES `rent_cars`.`User` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;