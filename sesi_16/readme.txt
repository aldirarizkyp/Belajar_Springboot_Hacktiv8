Sesi         : 16 (23 Juni 2022)
Pembelajaran : SpringBoot Web + Bootstraping
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

============================================RANGKUMAN MATERI==================================================

Spring Web dan Thymeleaf
- berguna untuk membuat aplikasi web menggunakan bahasa Java
- Thymeleaf merupakan template engine khusus Java sebagai tempat penyimpanan file HTML.


============================================PROGRAM===========================================================

BelajarSpringBootstrap
- pada pom dilakukan penambahan depedenct org.webjars serta org.springframework untuk mengimplementasikan
  thymeleaf
- pada com.learning.spring terdapat file java class WelcomeController.java didalam nya terdapat 
  logika web serta penentuan Mapping endpoint.
- pada src/main/resources/templates terdapat file HTML sebagai antarmuka tampilan pada web.
- pada src/main/resources/static/css terdapat main.css untuk mengatur tampilan desain dari welcome.html
- aplikasi ini dijalankan pada port=8083


LatihanSpringBootstrapMahasiswa
- pada com/latihan/spring/entity terdapat file class Mahasiswa.java yang merupakan file untuk melakukan pembuatan entitas
  dari mahasiswa. Kali ini terdapat @NotNull dan @NotBlank untuk menandakan bahwa field itu tidak boleh kosong.
- program melakukan migrasi db dengan menggunakan dependency Flyway
- pada application properties terdapat konfigurasi FlyAway 
- pada com/latihan/spring/dao terdapat MahasiwaDao.java yang digunakan sebagai repository. Interface ini akan mengextends class PagingAndSortingRepository.
- pada com/latihan/spring/controller terdapat MahasiswaController.java yang berguna untuk mengatur alur request dari client
- Di dalam MahasiswaController.java terdapat :
  @Controller : menandakan bahwa class tersebut merupakan controller
  @Autowired : digunakan untuk menginisiasi objek mahasiswaDao
  @GetMapping("/index") : menandakan bahwa method ini menggunakan GET http Request dengan endpoint bernama /index
  redirect:/index : menandakan bahwa sistem akan mendirect halaman ke index secara otomatis apabila kita memanggil path /index
- pada src/main/resources/templates terdapat file index.html. Di dalamnya terdapat template engine Thymeleaf.
