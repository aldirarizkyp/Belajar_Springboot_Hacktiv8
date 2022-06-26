Sesi         : 15 (22 Juni 2022)
Pembelajaran : SpringBoot
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

============================================RANGKUMAN MATERI==================================================

SpringJpa
- menggunakan Jpa yang dicustom untuk operasi CRUD
- menggunakan interface Repository yang menggunakan ID dari class domain sebagai parameternya.
- spring mendukung query method, native query, JPQL dan lain lain.
- untuk menggunakan Jpa harus terdapat dependency spring-boot-starter-data-jpa
- pada model :
  @Entity : merepresentasikan bahwa class tersebut adalah sebuah entitas.Yang nantinya akan ada sebuah tabel
   	 	di database dengan nama Book.
  @Id : digunakan untuk menentukan Id pada suatu tabel
  @GeneratedValue : mekasnisme untuk memberikan nilai.
  @Column : digunakan untuk membuat suatu kolom pada tabel.


============================================PROGRAM==================================================

BelajarSpringJpaBook
- pada com.learning.jpabook.model terdapat class bernama Model yang berfungsi untuk membuat suatu Entitas Book.
  Di file class ini dibuat field yang akan diisi kedalam database db-book. Method setter dan getter juga
  disertakan pada file class ini.
- pada application properties lakukan konfigurasi hikari, jpa, dan mysql connection. Db yang digunakan adalah db_book.
- pada com.learning.jpabook.repository terdapat file BookRepository. File class ini digunakan sebagai interface yang mengextends 
  class JpaRepository. Jpa Repository menyediakan fungsi CRUD.
- pada com.learning.jpabook terdapat file BelajarSpringJpaBookApplication.java. File ini akan membuat object dari class Book
 dan melakukan set disetiap kolom yang ada pada tabel book.

BelajarSpringStudent
- pada com.learning.jpastudent.entity terdapat file Student.java yang dimana berfungsi untuk menentukan entitas Student.
- pada com.learning.jpastudent.entity terdapat file Course.java yang dimana berfungsi untuk menentukan entitas Course.
- pada file Course.java terdapat perintah @ManyToMany untuk membuat realsi tabel.
- lalu pada com.learning.jpastudent.repository terdapat file StudentRepository.java yang berfungsi sebagai interface  yang mengextend
  class JpaRepository yang berguna untuk melakukan fungsi CRUD.
- selanjutnya dibuat juga CourseRepository
- Pada file BelajarSpringStudentApplication.java dibuat instance dari Student dan Course untuk dapat melakukan pengisian data serta pemanggilan method.

LatihanSpringHibernate
- program ini menjelaskan tentang bagaimana spring dengan hibernate dengan menggunakan relasi OneToOne Relationship.
- Dari keterangan tabel ditunjukkan bahwa id dari tabel users akan menjadi foreign key di tabel addresses.
- membuat model pada com.latihan.spring.model yaitu Addresses.java dan Users.java
- Setiap model akan mendeklarasikan entitas dari masing-masing tabel. Namun terdapat penambahan @OneToOne yang menandakan bahwa
  tabel tersebut akan dihubungkan dengan relasi OneToOne. Serta melakukan pembuatan method setter getter untuk setiap attribut yang ada pada tabel.
- Pada model Addresses terdapat @JoinColumn untuk melakukan join ke reference model User.
- Membuat repository untuk masing-masing model sebagai interface yang akan melakukan extend ke JpaRepository.
- Pada LatihanSpringHibernateApplication.java, dilakukan pembuatan objek dari users dan addresses untuk memanggil method setter getter beserta value
  yang akan menjadi isi dari tabel addresses dan users.
