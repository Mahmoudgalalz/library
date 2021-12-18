-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: booklib
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `author` (
  `Author_ID` int NOT NULL,
  `FirstName` varchar(25) NOT NULL,
  `LastName` varchar(25) NOT NULL,
  PRIMARY KEY (`Author_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (12955,'Mahmoud','Galal'),(129876,'bram','sotkar'),(147852,'oskar','waild'),(231456,'lois','carol'),(258963,'erec','elner'),(356214,'lord','biron'),(452136,'georg','eliot'),(523164,'vergenia','wolf'),(635559,'jon','melton'),(646892,'gen','osten'),(785236,'steven','sebner');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `ISBN` int NOT NULL,
  `title` varchar(200) NOT NULL,
  `page_count` int DEFAULT NULL,
  `price` float DEFAULT NULL,
  `type` varchar(225) DEFAULT NULL,
  `Publisher_code` int NOT NULL,
  PRIMARY KEY (`ISBN`),
  KEY `Publisher_code` (`Publisher_code`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`Publisher_code`) REFERENCES `publisher` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (110456,'Our Souls At Night',310,60,'others',205200),(110458,'Hello World !',200,200,'Education Books',500600),(113456,'Clean Code',600,500,'Tech Books',205200),(114456,'Fantastic Mr. Fox',260,50,'others',205200),(115456,'A Passage to India',300,60,'others',205200),(119456,'In Furiously Happy',355,70,'others',205200),(121456,'Mrs. Dalloway',342,50,'others',205200),(122233,'Anna Karenina',250,40,'others',205200),(163456,'The Great Gatsby',500,100,'others',205200),(173456,'We Should All Be Feminists',330,50,'others',205200),(183456,'Animal Farm',200,35,'others',205200),(193456,'Tuesdays with Morrie',340,55,'others',205200),(5200145,'The art of leadership',325,400,'Business',205200),(5200545,'Grokking Algorithms',254,500,'Tech-Book',205200);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publisher` (
  `PName` varchar(200) NOT NULL,
  `ID` int NOT NULL,
  `city` varchar(150) DEFAULT NULL,
  `Phone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES ('Mahmoud Galal',205200,'Maadi','01119575074'),('Mahmoud Yasser',332002,'Cairp','01145819537'),('Ashraf Ahmed',400200,'Cairo','01119598746'),('Zainab Saber',500600,'Cairo','01234567891');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `writer`
--

DROP TABLE IF EXISTS `writer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `writer` (
  `BookISBN` int NOT NULL,
  `A_ID` int NOT NULL,
  KEY `BookISBN` (`BookISBN`),
  KEY `A_ID` (`A_ID`),
  CONSTRAINT `writer_ibfk_1` FOREIGN KEY (`BookISBN`) REFERENCES `book` (`ISBN`),
  CONSTRAINT `writer_ibfk_2` FOREIGN KEY (`A_ID`) REFERENCES `author` (`Author_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `writer`
--

LOCK TABLES `writer` WRITE;
/*!40000 ALTER TABLE `writer` DISABLE KEYS */;
/*!40000 ALTER TABLE `writer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'booklib'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-18 22:30:55
