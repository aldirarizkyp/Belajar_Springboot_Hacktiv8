-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP VIEW IF EXISTS `data_pegawai_jabatan_gaji`;
CREATE TABLE `data_pegawai_jabatan_gaji` (`id` int(11), `nama_pegawai` varchar(50), `jabatan` enum('Staff','Manager','Supervisor'), `gaji` int(10));


SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_gaji`;
CREATE TABLE `tb_gaji` (
  `id_gaji` int(11) NOT NULL AUTO_INCREMENT,
  `id_pegawai` int(11) NOT NULL,
  `gaji` int(10) NOT NULL,
  `tgl_gaji` date NOT NULL,
  PRIMARY KEY (`id_gaji`),
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tb_gaji_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_gaji`;
INSERT INTO `tb_gaji` (`id_gaji`, `id_pegawai`, `gaji`, `tgl_gaji`) VALUES
(1,	2,	200000000,	'2020-05-02'),
(2,	1,	500000000,	'2021-01-02'),
(3,	4,	240000000,	'2020-06-09'),
(4,	7,	400000000,	'2020-05-02'),
(5,	3,	100000000,	'2021-01-02'),
(6,	5,	550000000,	'2020-06-09'),
(7,	6,	100000000,	'2021-01-02'),
(8,	8,	470000000,	'2020-06-09'),
(9,	9,	320000000,	'2020-06-09'),
(10,	10,	700000000,	'2020-05-02'),
(11,	11,	20000000,	'2020-05-02');

DROP TABLE IF EXISTS `tb_menu`;
CREATE TABLE `tb_menu` (
  `id_menu` int(11) NOT NULL AUTO_INCREMENT,
  `nama_menu` varchar(50) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  PRIMARY KEY (`id_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_menu`;
INSERT INTO `tb_menu` (`id_menu`, `nama_menu`, `jenis`, `harga`) VALUES
(1,	'Pizza',	'Makanan',	120000),
(2,	'Martabak',	'Makanan',	25000),
(3,	'Mie Ayam',	'Makanan',	15000),
(4,	'Mie Goreng',	'Makanan',	10000),
(5,	'Steak',	'Makanan',	200000),
(6,	'Sushi',	'Makanan',	100000),
(7,	'Spaghetti',	'Makanan',	60000),
(8,	'Lasagna',	'Makanan',	70000),
(9,	'Tempe',	'Makanan',	3000),
(10,	'Tahu',	'Makanan',	5000),
(11,	'Croffle',	'Makanan',	30000);

DROP TABLE IF EXISTS `tb_pegawai`;
CREATE TABLE `tb_pegawai` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pegawai` varchar(50) NOT NULL,
  `alamat` text NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `tgl_lahir` date NOT NULL,
  `status` enum('Aktif','Tidak Aktif') NOT NULL,
  `no_tlp` varchar(13) NOT NULL,
  `jabatan` enum('Staff','Manager','Supervisor') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_pegawai`;
INSERT INTO `tb_pegawai` (`id`, `nama_pegawai`, `alamat`, `jenis_kelamin`, `tgl_lahir`, `status`, `no_tlp`, `jabatan`) VALUES
(1,	'Messi',	'Paris',	'Laki-laki',	'1998-01-14',	'Aktif',	'283728',	'Manager'),
(2,	'Ronaldo',	'Manchester',	'Laki-laki',	'1996-04-13',	'Aktif',	'89576847',	'Manager'),
(3,	'DeBruyne',	'Manchester',	'Laki-laki',	'1988-05-09',	'Aktif',	'9999999',	'Staff'),
(4,	'Bambang',	'Jakarta',	'Laki-laki',	'1990-03-05',	'Aktif',	'88888',	'Staff'),
(5,	'Vina',	'Jakarta',	'Perempuan',	'1999-01-02',	'Aktif',	'55555',	'Staff'),
(6,	'DePaul',	'Madrid',	'Laki-laki',	'2000-01-09',	'Aktif',	'342543',	'Manager'),
(7,	'Di Maria',	'Paris',	'Laki-laki',	'2003-12-05',	'Aktif',	'654675',	'Manager'),
(8,	'Otamendi',	'Manchester',	'Laki-laki',	'1998-09-13',	'Aktif',	'3333333',	'Manager'),
(9,	'Klok',	'Amsterdam',	'Laki-laki',	'2000-09-09',	'Aktif',	'378273',	'Manager'),
(10,	'Egy',	'Palembang',	'Laki-laki',	'2001-10-07',	'Aktif',	'289473',	'Manager'),
(11,	'Witan',	'Paris',	'Laki-laki',	'2004-05-02',	'Aktif',	'231421',	'Manager');

DROP TABLE IF EXISTS `tb_pembeli`;
CREATE TABLE `tb_pembeli` (
  `id_pembeli` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pembeli` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `tgl_lahir` date NOT NULL,
  `status` enum('Menikah','Belum Menikah') NOT NULL,
  `no_tlp` varchar(50) NOT NULL,
  `pekerjaan` varchar(50) NOT NULL,
  PRIMARY KEY (`id_pembeli`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_pembeli`;
INSERT INTO `tb_pembeli` (`id_pembeli`, `nama_pembeli`, `alamat`, `jenis_kelamin`, `tgl_lahir`, `status`, `no_tlp`, `pekerjaan`) VALUES
(1,	'Naruto',	'Konoha',	'Laki-laki',	'2000-03-01',	'Menikah',	'895857',	'Hokage'),
(2,	'Sasuke',	'Konoha',	'Laki-laki',	'1998-06-10',	'Menikah',	'342224',	'Agen Rahasia'),
(3,	'Sakura',	'Konoha',	'Perempuan',	'1998-05-01',	'Menikah',	'123455',	'Dokter'),
(4,	'Madara',	'Konoha',	'Laki-laki',	'1997-03-12',	'Menikah',	'353566',	'Ketua'),
(5,	'Obito',	'Konoha',	'Laki-laki',	'1999-01-01',	'Belum Menikah',	'34253',	'Ninja'),
(6,	'Shikamaru',	'Konoha',	'Laki-laki',	'2000-02-02',	'Menikah',	'34245',	'Vice President'),
(7,	'Kiba',	'Konoha',	'Laki-laki',	'1998-02-09',	'Menikah',	'33333',	'Polisi'),
(8,	'Boruto',	'Konoha',	'Laki-laki',	'1998-07-03',	'Belum Menikah',	'53324',	'Siswa'),
(9,	'Mitsuki',	'Konoha',	'Laki-laki',	'2001-08-10',	'Belum Menikah',	'53453',	'Siswa'),
(10,	'Sarada',	'Konoha',	'Perempuan',	'2001-08-11',	'Belum Menikah',	'35657',	'Siswa'),
(11,	'Hinata',	'Konoha',	'Perempuan',	'1998-02-21',	'Menikah',	'99999999',	'Ibu Rumah Tangga');

DROP TABLE IF EXISTS `tb_transaksi`;
CREATE TABLE `tb_transaksi` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `id_pembeli` int(11) NOT NULL,
  `id_menu` int(11) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  PRIMARY KEY (`id_transaksi`),
  KEY `id_pembeli` (`id_pembeli`),
  KEY `id_menu` (`id_menu`),
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tb_transaksi_ibfk_1` FOREIGN KEY (`id_pembeli`) REFERENCES `tb_pembeli` (`id_pembeli`),
  CONSTRAINT `tb_transaksi_ibfk_2` FOREIGN KEY (`id_menu`) REFERENCES `tb_menu` (`id_menu`),
  CONSTRAINT `tb_transaksi_ibfk_3` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

TRUNCATE `tb_transaksi`;
INSERT INTO `tb_transaksi` (`id_transaksi`, `id_pembeli`, `id_menu`, `id_pegawai`, `tgl_transaksi`) VALUES
(1,	1,	1,	1,	'2022-05-02'),
(2,	2,	2,	2,	'2020-07-11'),
(3,	3,	3,	3,	'2022-05-02'),
(4,	4,	4,	4,	'2022-05-02'),
(5,	5,	5,	5,	'2020-07-11'),
(6,	6,	6,	6,	'2022-05-02'),
(7,	7,	7,	7,	'2020-07-11'),
(8,	8,	8,	8,	'2022-05-02'),
(9,	9,	9,	9,	'2020-07-11'),
(10,	10,	10,	10,	'2022-05-02'),
(11,	5,	5,	2,	'2020-05-01'),
(12,	3,	4,	2,	'2022-05-02');

DROP TABLE IF EXISTS `data_pegawai_jabatan_gaji`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `data_pegawai_jabatan_gaji` AS select `tp`.`id` AS `id`,`tp`.`nama_pegawai` AS `nama_pegawai`,`tp`.`jabatan` AS `jabatan`,`tg`.`gaji` AS `gaji` from (`tb_pegawai` `tp` join `tb_gaji` `tg` on(`tg`.`id_pegawai` = `tp`.`id`)) order by `tp`.`id`;

-- 2022-06-20 15:58:28