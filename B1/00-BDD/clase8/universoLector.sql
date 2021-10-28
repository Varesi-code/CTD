-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: universolector
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `codigo` int NOT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editorial`
--

DROP TABLE IF EXISTS `editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `editorial` (
  `codigo` int NOT NULL,
  `razon_social` varchar(100) DEFAULT NULL,
  `telefono` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editorial`
--

LOCK TABLES `editorial` WRITE;
/*!40000 ALTER TABLE `editorial` DISABLE KEYS */;
/*!40000 ALTER TABLE `editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `codigo` int NOT NULL,
  `ISBN` varchar(13) DEFAULT NULL,
  `nombre` varchar(200) DEFAULT NULL,
  `anio_escritura` date DEFAULT NULL,
  `codigo_autor` int DEFAULT NULL,
  `anio_edicion` date DEFAULT NULL,
  `codigo_editorial` int DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo_autor` (`codigo_autor`),
  KEY `codigo_editorial` (`codigo_editorial`),
  CONSTRAINT `libro_ibfk_1` FOREIGN KEY (`codigo_autor`) REFERENCES `autor` (`codigo`),
  CONSTRAINT `libro_ibfk_2` FOREIGN KEY (`codigo_editorial`) REFERENCES `editorial` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo` (
  `codigo` int NOT NULL,
  `fecha` date DEFAULT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `fecha_tope` date DEFAULT NULL,
  `codigo_socio` int DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo_socio` (`codigo_socio`),
  CONSTRAINT `prestamo_ibfk_1` FOREIGN KEY (`codigo_socio`) REFERENCES `socio` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo`
--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamosvolumenes`
--

DROP TABLE IF EXISTS `prestamosvolumenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamosvolumenes` (
  `codigo` int NOT NULL,
  `codigo_prestamo` int DEFAULT NULL,
  `codigo_volumen` int DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo_prestamo` (`codigo_prestamo`),
  KEY `codigo_volumen` (`codigo_volumen`),
  CONSTRAINT `prestamosvolumenes_ibfk_1` FOREIGN KEY (`codigo_prestamo`) REFERENCES `prestamo` (`codigo`),
  CONSTRAINT `prestamosvolumenes_ibfk_2` FOREIGN KEY (`codigo_volumen`) REFERENCES `volumen` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamosvolumenes`
--

LOCK TABLES `prestamosvolumenes` WRITE;
/*!40000 ALTER TABLE `prestamosvolumenes` DISABLE KEYS */;
/*!40000 ALTER TABLE `prestamosvolumenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socio`
--

DROP TABLE IF EXISTS `socio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `socio` (
  `codigo` int NOT NULL,
  `dni` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `nombres` varchar(100) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `localidad` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socio`
--

LOCK TABLES `socio` WRITE;
/*!40000 ALTER TABLE `socio` DISABLE KEYS */;
/*!40000 ALTER TABLE `socio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefonosocio`
--

DROP TABLE IF EXISTS `telefonosocio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefonosocio` (
  `codigo` int NOT NULL,
  `nro_telefono` varchar(100) DEFAULT NULL,
  `codigo_socio` int DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo_socio` (`codigo_socio`),
  CONSTRAINT `telefonosocio_ibfk_1` FOREIGN KEY (`codigo_socio`) REFERENCES `socio` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefonosocio`
--

LOCK TABLES `telefonosocio` WRITE;
/*!40000 ALTER TABLE `telefonosocio` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefonosocio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `volumen`
--

DROP TABLE IF EXISTS `volumen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `volumen` (
  `codigo` int NOT NULL,
  `codigo_libro` int DEFAULT NULL,
  `deteriorado` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo_libro` (`codigo_libro`),
  CONSTRAINT `volumen_ibfk_1` FOREIGN KEY (`codigo_libro`) REFERENCES `libro` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volumen`
--

LOCK TABLES `volumen` WRITE;
/*!40000 ALTER TABLE `volumen` DISABLE KEYS */;
/*!40000 ALTER TABLE `volumen` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-27 13:33:58
