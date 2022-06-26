Sesi         : 14 (22 Juni 2022)
Pembelajaran : Servlet & SpringBoot
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

============================================RANGKUMAN MATERI==================================================

MVC
- merupakan arsitektur yang berguna untuk memudahkan dalam pengembangan aplikasi karena berkonsentrasi pada tugas dan fungsi
  masing-masing.
- arsitektur ini tediri dari:
   1. Model 
      mempresentasikan data atau berhubungan dengan basis data
   2. View
      menampilkan tampilan visual kepada user 
   3. Controller
      mengatur logika sistem dan menghubungkan model dengan view

Servlet
- merupakan program java yang berjalan di web atau aplikasi server
- berfungsi sebagai penghubung antara web browser atau clien HTTP dengan database atau aplikasi pada server HTTP

 1. Servlet Controller yang berfungsi untuk menyediakan akses tunggal terhadap seluruh aplikasi
 2. Controller Servlet untuk menentukan alur aplikasi pemrosesan perintah. Menggunakan konfigurasi XML



============================================PROGRAM=========================================================

BelajarServlet
- buat project web dynamic
- gunakan tomcat ver10 untuk run time
- membuat class Model bernama Member yang berfungsi untuk management data yang ada pada database. Di class ini terdapat
  method setter getter untuk menanggulangi username dan password
- membuat file index.jsp yang berfungsi untuk memberikan tampilan pada halaman login
- membuat class controller untuk menanggulangi login yang apabila login berhasil akan di redirect ke halaman member.jsp
- member.jsp akan memanggil method yang getUsername() untuk menampilkan username yang terdaftar


SpringHelloWorld
- program ini dibuat untuk menampilkan Hello world dengan menggunakan spring.
- pada com.learning.spring terdapat SpringHelloWorldApplication.java dan membuat source code untuk menampilkan "Hello World".
- pada com.learning.spring.controller terdapat file class HelloController.java. Pada file ini dilakukan request mapping untuk 
  membuat endpoint "/hello". Lalu di dalam class ini terdapat method yang mereturn "Hello".
- pada com.learning.spring.config terdapat file java class yaitu MvcConfiguration.java. Kelas didalamnya terdapat objek resolver
  yang merupakan instance dari class InternalResourceViewResolver. Objek ini digunakan untuk memnggil method
  setPrefix dan setSuffix.
- Pada src/main/webapp terdapat hello.html yang berfungsi untuk menampilkan tampilan web yang mengarah ke endpoint /hello.


  
Note:
Servlet pakai eclipse (ver 2022_06)
BelajarSpringboot eclipse (ver 2022_03)