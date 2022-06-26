Sesi         : 13 (21 Juni 2022)
Pembelajaran : ORM - Hibernate
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

============================================RANGKUMAN MATERI==================================================

ORM (Object Relation Mapping)
- jembatan antara OOP dengan database
- Operasi koneksi database lebih mudah menggunakan ORM
- Metode umum dari ORM yaitu memetakan table atau query ke dalam class Java atau sering disebut dengan POJO atau Java Beans
- POJO -> class pada java yang hanya berisi variabel dan method setter getter tanpa ada method proses lainnya.
- DAO (Data Access Object) -> class yang  berisi operasi CRUD
- Database dimapping menggunakan POJO lalu proses CRUD dikerjakan dengan DAO

Hibernate ORM
- merupakan library object relational mapping untuk bahasa java, yang menyediakan kerangka kerja untuk memetakan model 
  object oriented domain ke database relational tradisional.
- menyediakan framework untuk java koneksi ke database relasional seperti MySQL, SQL Server, Oracle, DB2, dll


============================================PROGRAM================================================================

DemoHibernate
- melakukan konfigurasi pada pom untuk menambah dependency hibernate, mysql, dan transaction.
- membuat db_biodata pada db adminer dan lakukan pembuatan tabel address_book yang memiliki kolom id, name, dan address.
- melakukan file konfigurasi hibernate di dalam src/main/resource dengan nama AddressBook.hbm.xml.
- didalam konfigurasi file hibernate tersebut terdapat konfigurasi untuk melakukan koneksi ke database mysql. Di dalam
  DemoHibernate ini dilakukan koneksi ke dalam database db_biodata.
- membuat model Class pada src/main/java/com/learing/hibernate yang bernama AddressBook.java
- model Class AddressBook.java ini mendefinisikan Entitas dari suatu database yang didalamnya terdapat method setter getter
  untuk setiap kolom yang ada pada tabel AddressBook.
- membuat mapping file pada src/main/java/com/learing/hibernate yang bernama AddressBook.hbm.xml
- mapping file ini berfungsi untuk mendefinisikan struktur tabel yang nanti dihubungkan ke Model Class (AddressBook.java).
- Setelah dibuat model class dan mapping file, perlu dibuat suatu controller yang nantinya dapat mengatur proses CRUD didalamnya
- membuat file class pada src/main/java/com/learing/hibernate bernama App.java
- Pada file App.java kita akan membuat instance/objek dari class AddressBook.java dan akan memanggil method untuk melakukan set
  id, name, dan address. 
