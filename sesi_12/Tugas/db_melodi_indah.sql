-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_album`;
CREATE TABLE `tb_album` (
  `id_album` int(11) NOT NULL AUTO_INCREMENT,
  `nama_album` varchar(50) NOT NULL,
  `tanggal` date NOT NULL,
  `format` enum('CD','MC') NOT NULL,
  `id_lagu` int(11) NOT NULL,
  PRIMARY KEY (`id_album`),
  KEY `id_lagu` (`id_lagu`),
  CONSTRAINT `tb_album_ibfk_1` FOREIGN KEY (`id_lagu`) REFERENCES `tb_lagu` (`id_lagu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_album`;
INSERT INTO `tb_album` (`id_album`, `nama_album`, `tanggal`, `format`, `id_lagu`) VALUES
(1,	'Blue',	'2000-05-02',	'CD',	2),
(2,	'Red',	'2000-09-02',	'MC',	1);

DROP TABLE IF EXISTS `tb_instrument`;
CREATE TABLE `tb_instrument` (
  `id_instrument` int(11) NOT NULL AUTO_INCREMENT,
  `nama_instrument` varchar(50) NOT NULL,
  `kunci` varchar(10) NOT NULL,
  PRIMARY KEY (`id_instrument`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_instrument`;
INSERT INTO `tb_instrument` (`id_instrument`, `nama_instrument`, `kunci`) VALUES
(1,	'Gitar',	'G#'),
(2,	'Piano',	'Ab');

DROP TABLE IF EXISTS `tb_lagu`;
CREATE TABLE `tb_lagu` (
  `id_lagu` int(11) NOT NULL AUTO_INCREMENT,
  `judul` varchar(50) NOT NULL,
  `pengarang` varchar(50) NOT NULL,
  PRIMARY KEY (`id_lagu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_lagu`;
INSERT INTO `tb_lagu` (`id_lagu`, `judul`, `pengarang`) VALUES
(1,	'Stay',	'Rahmat'),
(2,	'Hampa',	'Sanjij');

DROP TABLE IF EXISTS `tb_musisi`;
CREATE TABLE `tb_musisi` (
  `id_musisi` int(11) NOT NULL AUTO_INCREMENT,
  `ssn` int(11) NOT NULL,
  `nama_musisi` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_telp` varchar(50) NOT NULL,
  PRIMARY KEY (`id_musisi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_musisi`;
INSERT INTO `tb_musisi` (`id_musisi`, `ssn`, `nama_musisi`, `alamat`, `no_telp`) VALUES
(1,	2313,	'Ali',	'Senopati',	'086758476656'),
(2,	4244,	'Joko',	'Pondok Indah',	'075736573647');

DROP TABLE IF EXISTS `tb_musisi_album`;
CREATE TABLE `tb_musisi_album` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_musisi` int(11) NOT NULL,
  `id_album` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_musisi` (`id_musisi`),
  KEY `id_album` (`id_album`),
  CONSTRAINT `tb_musisi_album_ibfk_1` FOREIGN KEY (`id_musisi`) REFERENCES `tb_musisi` (`id_musisi`),
  CONSTRAINT `tb_musisi_album_ibfk_2` FOREIGN KEY (`id_album`) REFERENCES `tb_album` (`id_album`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_musisi_album`;

DROP TABLE IF EXISTS `tb_musisi_instrument`;
CREATE TABLE `tb_musisi_instrument` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_musisi` int(11) NOT NULL,
  `id_instrument` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_musisi` (`id_musisi`),
  KEY `id_instrument` (`id_instrument`),
  CONSTRAINT `tb_musisi_instrument_ibfk_1` FOREIGN KEY (`id_musisi`) REFERENCES `tb_musisi` (`id_musisi`),
  CONSTRAINT `tb_musisi_instrument_ibfk_2` FOREIGN KEY (`id_instrument`) REFERENCES `tb_instrument` (`id_instrument`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_musisi_instrument`;

DROP TABLE IF EXISTS `tb_musisi_lagu`;
CREATE TABLE `tb_musisi_lagu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_musisi` int(11) NOT NULL,
  `id_lagu` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_musisi` (`id_musisi`),
  KEY `id_lagu` (`id_lagu`),
  CONSTRAINT `tb_musisi_lagu_ibfk_1` FOREIGN KEY (`id_musisi`) REFERENCES `tb_musisi` (`id_musisi`),
  CONSTRAINT `tb_musisi_lagu_ibfk_2` FOREIGN KEY (`id_lagu`) REFERENCES `tb_lagu` (`id_lagu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_musisi_lagu`;

-- 2022-06-21 02:58:20