
-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_dosen`;
CREATE TABLE `tb_dosen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_dosen` varchar(50) NOT NULL,
  `umur` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_dosen`;

DROP TABLE IF EXISTS `tb_mahasiswa`;
CREATE TABLE `tb_mahasiswa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_orangtua` int(11) NOT NULL,
  `id_dosen` int(11) NOT NULL,
  `id_matkul` int(11) NOT NULL,
  `nama_mahasiswa` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_orangtua` (`id_orangtua`),
  KEY `id_dosen` (`id_dosen`),
  KEY `id_matkul` (`id_matkul`),
  CONSTRAINT `tb_mahasiswa_ibfk_1` FOREIGN KEY (`id_orangtua`) REFERENCES `tb_orangtua` (`id`),
  CONSTRAINT `tb_mahasiswa_ibfk_2` FOREIGN KEY (`id_dosen`) REFERENCES `tb_dosen` (`id`),
  CONSTRAINT `tb_mahasiswa_ibfk_3` FOREIGN KEY (`id_matkul`) REFERENCES `tb_matkul` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_mahasiswa`;

DROP TABLE IF EXISTS `tb_matkul`;
CREATE TABLE `tb_matkul` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_matkul` varchar(50) NOT NULL,
  `sks` int(11) NOT NULL,
  `harga` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_matkul`;

DROP TABLE IF EXISTS `tb_orangtua`;
CREATE TABLE `tb_orangtua` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_orangtua` varchar(50) NOT NULL,
  `umur` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_orangtua`;

-- 2022-06-20 16:14:53