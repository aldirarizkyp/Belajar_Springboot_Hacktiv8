Sesi         : 5 (16 Juni 2022)
Pembelajaran : Object Oriented Programming
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

1. BangunDatar.java
    - Program ini dibuat untuk menghitung luas dan keliling bangun datar dengan menerapkan proses inheritance.
    - Class Bangun datar akan diturunkan ke kelas anak yaitu Persegi, Lingkaran, PersegiPanjang, dan Segitiga
    - Kelas anak akan dibuat ke dalam file java baru yang masing-masing menjelaskan proses perhitungan baik luas maupun
      keliling dan akan melakukan return hasil perhitungan.
    - Class main dibuat untuk melakukan instansiasi objek dari kelas parent dan kelas anak. 
    - Setelah di buat objek, method luas dan keliling yang terdapat pada kelas anak dapat dipanggil
    - Sistem akan menghasilkan output luas dan keliling ke semua bangun datar.

2. Makanan.java
    - Program ini berfokus pada Enkapsulasi
    - Membuat model di kelas restoran.java yang berisi deklarasi variabel dan method setter dan getter
    - Pada Makanan.java akan dilakukan instansiasi objek dari kelas Restoran lalu memanggil method set untuk inisialisasi nilai
      dan method get untuk mendapatkan keluaran/output dari sistem.

3. Manusia.java
    - Program ini menerapkan polymorh
    - Polymorh dibagi kedalam 3 bentuk yaitu 1. Class itu sendiri
                                            2. Class lain
                                            3. Interface
    - Bentuk 1 ini bentuk umum jadi kita mau membuat object AnakUmur1Tahun dari dirinya sendiri.
    - Bentuk 2 ini agak berbeda jadi kita mau membentuk object Induk dari class AnakUmur1Tahun,hal ini bisa karena AnakUmur1Tahun extends ke class Induk ini artinya tipe anak = induk
    - Begitu juga Bentuk 3 ini bisa dilakukan karena class AnakUmur1Tahun implement ke AktivitasPagijadi otomatis tipe anak = activitaspagi


4. MaxNumber.java
    - Program ini dibuat untuk mendapatkan nilai terbesar dari 2 variabel dengan menggunakan method Overloading
    - Method overloading yaitu method dengan kemampuan yang sama tetapi parameter berbeda
    - method pertama diisi dengan tipe static lalu pada parameter diisi double
    - method kedua diisi dengan tipe static lalu pada parameter diisi dengan int
    - disetiap method terdapat logika untuk menentukan nilai terbesar.
    - Sistem akan mengeluarkan nilai dari kedua method dengan nilai terbesar dari masing-masing method