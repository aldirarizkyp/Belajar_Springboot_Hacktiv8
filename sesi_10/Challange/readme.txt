Sesi         : 10 (20 Juni 2022)
Pembelajaran : Database
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019


CHALLANGE

=====INSERT======

A. Insert Tabel Pegawai

insert into tb_pegawai values 
(1, "Messi", "Paris", "Laki-laki", 1998-01-14, "Aktif", 283728, "Manager"),
(2, "Ronaldo", "Manchester", "Laki-laki", "1996-04-13", "Aktif", 89576846, "Manager"),
(3, "DeBruyne", "Manchester", "Laki-laki", "1998-05-09", "Aktif", 9999999, "Staff"),
(4, "Bambang", "Jakarta", "Laki-laki", "1990-03-05", "Aktif", 88888, "Staff"),
(5, "Vina", "Jakarta", "Perempuan", "1999-01-02", "Aktif", 55555, "Staff"),
(6, "DePaul", "Madrid", "Laki-laki", "2000-01-09", "Aktif", 342543, "Manager"),
(7, "Di Maria", "Paris", "Laki-laki", "2003-12-05", "Aktif", 654675, "Manager"),
(8, "Otamendi", "Manchester", "Laki-laki", "1998-09-13", "Aktif", 3333333, "Manager"),
(9, "Klok", "Amsterdam", "Laki-laki", "2000-09-09", "Aktif", 378273, "Manager"),
(10, "Egy", "Palembang", "Laki-laki", "2001-10-07", "Aktif", 289473, "Manager"),
(11, "Witan", "Paris", "Laki-laki", "2004-05-02", "Aktif", 231421, "Manager");


B. Insert Tabel Menu

insert into tb_menu values 
(1, "Pizza", "Makanan", 120000),
(2, "Martabak", "Makanan", 25000),
(3, "Mie Ayam", "Makanan", 15000),
(4, "Mie Goreng", "Makanan", 10000),
(5, "Steak", "Makanan", 200000),
(6, "Sushi", "Makanan", 100000),
(7, "Spaghetti", "Makanan", 60000),
(8, "Lasagna", "Makanan", 70000),
(9, "Tempe", "Makanan", 3000),
(10, "Tahu", "Makanan", 5000),
(11, "Croffle", "Makanan", 30000);


C. Insert Tabel Pembeli

insert into tb_pembeli values
(1, "Naruto", "Konoha", "Laki-laki","2000-03-01", "Menikah", 895857, "Hokage"),
(2, "Sasuke", "Konoha", "Laki-laki","1998-06-10", "Menikah", 342224, "Agen Rahasia"),
(3, "Sakura", "Konoha", "Perempuan","1998-05-01", "Menikah", 123455, "Dokter"),
(4, "Madara", "Konoha", "Laki-laki","1997-03-12", "Menikah", 353566, "Ketua"),
(5, "Obito", "Konoha", "Laki-laki","1999-01-01", "Belum Menikah", 34253, "Ninja"),
(6, "Shikamaru", "Konoha", "Laki-laki","2000-02-02", "Menikah", 34245, "Vice President"),
(7, "Kiba", "Konoha", "Laki-laki","1998-02-09", "Menikah", 33333, "Polisi"),
(8, "Boruto", "Konoha", "Laki-laki","1998-07-03", "Belum Menikah", 53324, "Siswa"),
(9, "Mitsuki", "Konoha", "Laki-laki","2001-08-10", "Belum Menikah", 53453, "Siswa"),
(10, "Sarada", "Konoha", "Perempuan","2001-08-11", "Belum Menikah", 35657, "Siswa"),
(11, "Hinata", "Konoha", "Perempuan","1998-02-21", "Menikah", 99999999, "Ibu Rumah Tangga");

D. Insert Tabel Gaji

insert into tb_gaji values 
(1, 2, 200000000, "2020-05-02"), 
(2, 1, 500000000, "2021-01-02"), 
(3, 4, 240000000, "2020-06-09"), 
(4, 7, 400000000, "2020-05-02"), 
(5, 3, 100000000, "2021-01-02"), 
(6, 5, 550000000, "2020-06-09"), 
(7, 6, 100000000, "2021-01-02"), 
(8, 8, 470000000, "2020-06-09"), 
(9, 9, 320000000, "2020-06-09"), 
(10, 10, 700000000, "2020-05-02"), 
(11, 11, 20000000, "2020-05-02");

E. Insert Tabel Transaksi

insert into tb_transaksi values 
(1, 1, 1, 1, "2022-05-02"),
(2, 2, 2, 2, "2020-07-11"),
(3, 3, 3, 3, "2022-05-02"),
(4, 4, 4, 4, "2022-05-02"),
(5, 5, 5, 5, "2020-07-11"),
(6, 6, 6, 6, "2022-05-02"),
(7, 7, 7, 7, "2020-07-11"),
(8, 8, 8, 8, "2022-05-02"),
(9, 9, 9, 9, "2020-07-11"),
(10, 10, 10, 10, "2022-05-02"),
(11, 5, 5, 2, "2020-05-01"),
(12, 3, 4, 2, "2022-05-02");

Penjelasan : Insert digunakan untuk memasukkan data ke dalam tabel yang sudah dibuat. Insert dapat ditulis dengan 
		 insert into nama_tabel values (value1, value2, "value3,..dst). Value yang dimasukkan harus disesuaikan
		 dengan struktur tabel termasuk urutannya. 


=====SELECT=====

F. Select Tabel Pegawai

select * from tb_pegawai;

Penjelasan : - Select * digunakan untuk mengambil seluruh record yang ada di dalam tabel pegawai

G. Select Tabel Menu 

select * from tb_menu;

Penjelasan : - Select * digunakan untuk mengambil seluruh record yang ada di dalam tabel menu

H. Select Tabel Pembeli

select * from tb_pembeli;

Penjelasan : - Select * digunakan untuk mengambil seluruh record yang ada di dalam tabel pembeli

I. Select Tabel Gaji 

select * from tb_gaji;

Penjelasan : - Select * digunakan untuk mengambil seluruh record yang ada di dalam tabel gaji

J. Select Tabel Transaksi

select * from tb_transaksi;

Penjelasan : - Select * digunakan untuk mengambil seluruh record yang ada di dalam tabel transaksi

K. View : Nama Pegawai, Jabatan, Gaji

create view data_pegawai_jabatan_gaji AS
select tp.id, tp.nama_pegawai, tp.jabatan, tg.gaji from tb_pegawai tp
join tb_gaji tg on tg.id_pegawai = tp.id
order by tp.id asc;

Penjelasan :  - Query diatas akan menampilkan kolom id, nama_pegawai, jabatan, gaji dari tabel pegawai yang di join dengan tabel gaji.
		  - Proses join dapat dilakukan dengan menghubungkan id yang ada di tabel pegawai dengan id_pegawai yang ada di tabel gaji.
		  - Record tersebut akan diorder secara berurutan dari atas (asc) 
	

L. Delete: Transaksi

drop table transaksi

Penjelasan : drop table digunakan untuk menghapus tabel. Setelah tabel dihapus, semua record yang ada di tabel tersebut akan terhapus juga.
