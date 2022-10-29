-- Database

CREATE DATABASE `cursos` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;


-- Tabla
CREATE TABLE `cursos`.`cursosformativo` (
  `codcurso` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `duracion` INT NULL,
  `precio` INT NULL,
  PRIMARY KEY (`codcurso`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- Datos
insert into cursos.cursosformativo values (001, "Curso de Java", 50, 150);
insert into cursos.cursosformativo values (002, "Curso de HTML", 35, 125);
insert into cursos.cursosformativo values (003, "Curso de Crypto", 5, 15000);
insert into cursos.cursosformativo values (004, "Curso de C", 150, 650);
insert into cursos.cursosformativo values (005, "Curso de React", 75, 65);
insert into cursos.cursosformativo values (006, "Curso de MongoDB", 150, 1050);
insert into cursos.cursosformativo values (007, "Curso de  SQL", 65, 225);
insert into cursos.cursosformativo values (008, "Curso de Hacking", 80, 666);
insert into cursos.cursosformativo values (009, "Curso de NFT", 3, 950);
insert into cursos.cursosformativo values (010, "Curso de Kobol", 200, 300);