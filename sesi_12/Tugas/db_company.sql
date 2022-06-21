-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_department`;
CREATE TABLE `tb_department` (
  `Dnumber` int(11) NOT NULL AUTO_INCREMENT,
  `ssn` int(11) NOT NULL,
  `Dname` varchar(50) NOT NULL,
  `MgrStartDate` date NOT NULL,
  PRIMARY KEY (`Dnumber`),
  KEY `ssn` (`ssn`),
  CONSTRAINT `tb_department_ibfk_1` FOREIGN KEY (`ssn`) REFERENCES `tb_employee` (`ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_department`;
INSERT INTO `tb_department` (`Dnumber`, `ssn`, `Dname`, `MgrStartDate`) VALUES
(1,	1,	'Marketing',	'2018-05-10'),
(2,	2,	'Technology',	'2018-05-10'),
(3,	4,	'Finance',	'2020-05-02'),
(4,	6,	'Sales',	'2020-01-20'),
(5,	9,	'Production',	'2020-11-02'),
(6,	10,	'HRD',	'2020-06-02'),
(7,	3,	'Accounting',	'2020-04-02'),
(8,	8,	'Warehouse',	'2020-02-02'),
(9,	7,	'QA',	'2020-11-02'),
(10,	5,	'Planning Control',	'2020-05-02');

DROP TABLE IF EXISTS `tb_dependent`;
CREATE TABLE `tb_dependent` (
  `id_dependent` int(11) NOT NULL AUTO_INCREMENT,
  `ssn` int(11) NOT NULL,
  `dependent_name` varchar(50) NOT NULL,
  `sex` enum('Pria','Wanita') NOT NULL,
  `Bdate` date NOT NULL,
  `relationship` varchar(50) NOT NULL,
  PRIMARY KEY (`id_dependent`),
  KEY `ssn` (`ssn`),
  CONSTRAINT `tb_dependent_ibfk_1` FOREIGN KEY (`ssn`) REFERENCES `tb_employee` (`ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_dependent`;
INSERT INTO `tb_dependent` (`id_dependent`, `ssn`, `dependent_name`, `sex`, `Bdate`, `relationship`) VALUES
(1,	1,	'Dependent1',	'Pria',	'1998-12-10',	'relationship1'),
(2,	2,	'Dependent 2',	'Wanita',	'0000-00-00',	'relationship 2'),
(3,	5,	'Dependent 3',	'Pria',	'0000-00-00',	'relationship 3'),
(4,	6,	'Dependent 4',	'Wanita',	'0000-00-00',	'relationship 4'),
(5,	7,	'Dependent 5',	'Pria',	'1998-02-12',	'relationship 5');

DROP TABLE IF EXISTS `tb_dept_location`;
CREATE TABLE `tb_dept_location` (
  `id_dept_location` int(11) NOT NULL AUTO_INCREMENT,
  `Dnumber` int(11) NOT NULL,
  `Dlocation` varchar(50) NOT NULL,
  PRIMARY KEY (`id_dept_location`),
  KEY `Dnumber` (`Dnumber`),
  CONSTRAINT `tb_dept_location_ibfk_1` FOREIGN KEY (`Dnumber`) REFERENCES `tb_department` (`Dnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_dept_location`;
INSERT INTO `tb_dept_location` (`id_dept_location`, `Dnumber`, `Dlocation`) VALUES
(1,	1,	'Jakarta Barat'),
(2,	3,	'Jakarta Pusat'),
(3,	2,	'Jakarta Barat'),
(4,	5,	'Jakarta Selatan'),
(5,	6,	'Jakarta Barat'),
(6,	4,	'Jakarta Timur'),
(7,	8,	'Jakarta Pusat'),
(8,	9,	'Jakarta Pusat'),
(9,	10,	'Jakarta Selatan'),
(10,	7,	'Jakarta Barat');

DROP TABLE IF EXISTS `tb_employee`;
CREATE TABLE `tb_employee` (
  `ssn` int(11) NOT NULL AUTO_INCREMENT,
  `DNumber` int(11) NOT NULL,
  `Fname` varchar(50) NOT NULL,
  `Mname` varchar(50) NOT NULL,
  `Lname` varchar(50) NOT NULL,
  `BDate` date NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Sex` enum('Pria','Wanita') NOT NULL,
  `Salary` int(10) NOT NULL,
  `SuperSSN` int(10) NOT NULL,
  PRIMARY KEY (`ssn`),
  KEY `DNumber` (`DNumber`),
  CONSTRAINT `tb_employee_ibfk_1` FOREIGN KEY (`DNumber`) REFERENCES `tb_department` (`Dnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_employee`;
INSERT INTO `tb_employee` (`ssn`, `DNumber`, `Fname`, `Mname`, `Lname`, `BDate`, `Address`, `Sex`, `Salary`, `SuperSSN`) VALUES
(1,	1,	'Aldiransyah',	'Rizky ',	'Putra',	'0000-00-00',	'Jakarta Selatan',	'Pria',	2500000,	12),
(2,	2,	'Randy',	'Viper',	'Orton',	'1980-02-09',	'New York',	'Pria',	3600000,	424),
(3,	1,	'Lucas',	'Marco',	'Vazquez',	'1980-02-09',	'Atlanta',	'Pria',	3000000,	2313),
(4,	1,	'Lionel',	'Andres',	'Messi',	'1995-06-07',	'Rosario',	'Pria',	3600000,	829),
(5,	2,	'Paul',	'Fernandez',	'Black',	'1992-06-07',	'Malang',	'Pria',	3000000,	830),
(6,	1,	'Rodrigo',	'Perez',	'Justin',	'1990-08-07',	'Pekan Baru',	'Pria',	3600000,	831),
(7,	2,	'Maria',	'De',	'Paul',	'0000-00-00',	'Madura',	'Wanita',	3600000,	832),
(8,	2,	'Ben',	'White',	'Benjamin',	'1980-06-07',	'Bandung',	'Pria',	3000000,	833),
(9,	1,	'Ray',	'Theodore',	'Rodriguez',	'1987-06-09',	'Riau',	'Pria',	5000000,	834),
(10,	1,	'Hamzah',	'Andres',	'DeMarco',	'1990-06-07',	'Surabaya',	'Pria',	3000000,	835);

DROP TABLE IF EXISTS `tb_project`;
CREATE TABLE `tb_project` (
  `Pnumber` int(11) NOT NULL AUTO_INCREMENT,
  `DNumber` int(11) NOT NULL,
  `Pname` varchar(50) NOT NULL,
  `Plocation` varchar(50) NOT NULL,
  PRIMARY KEY (`Pnumber`),
  KEY `DNumber` (`DNumber`),
  CONSTRAINT `tb_project_ibfk_1` FOREIGN KEY (`DNumber`) REFERENCES `tb_department` (`Dnumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_project`;
INSERT INTO `tb_project` (`Pnumber`, `DNumber`, `Pname`, `Plocation`) VALUES
(1,	3,	'Campaign',	'Bunderan HI'),
(2,	3,	'Management Trainee',	'BSD'),
(3,	9,	'Proyek 1',	'Lombok'),
(4,	9,	'Proyek 2',	'Bali'),
(5,	3,	'Proyek 3',	'Jakarta'),
(6,	3,	'Proyek 4',	'Bandung'),
(7,	7,	'Proyek 5',	'Riau'),
(8,	3,	'Proyek 6',	'Bogor'),
(9,	9,	'Proyek 7',	'Bekasi'),
(10,	3,	'Proyek 8',	'Depok');

DROP TABLE IF EXISTS `tb_works_on`;
CREATE TABLE `tb_works_on` (
  `id_works_on` int(11) NOT NULL AUTO_INCREMENT,
  `ssn` int(11) NOT NULL,
  `Pnumber` int(11) NOT NULL,
  `hours` int(11) NOT NULL,
  PRIMARY KEY (`id_works_on`),
  KEY `Pnumber` (`Pnumber`),
  KEY `ssn` (`ssn`),
  CONSTRAINT `tb_works_on_ibfk_1` FOREIGN KEY (`ssn`) REFERENCES `tb_employee` (`ssn`),
  CONSTRAINT `tb_works_on_ibfk_2` FOREIGN KEY (`Pnumber`) REFERENCES `tb_project` (`Pnumber`),
  CONSTRAINT `tb_works_on_ibfk_3` FOREIGN KEY (`ssn`) REFERENCES `tb_employee` (`ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_works_on`;
INSERT INTO `tb_works_on` (`id_works_on`, `ssn`, `Pnumber`, `hours`) VALUES
(1,	1,	1,	201),
(2,	2,	2,	300),
(3,	1,	1,	120),
(4,	4,	1,	235),
(5,	3,	3,	190),
(6,	1,	2,	250),
(7,	1,	6,	90),
(8,	8,	6,	130),
(9,	9,	8,	130),
(10,	10,	7,	278);

-- 2022-06-21 10:41:35