Sesi         : 19 (24 Juni 2022)
Pembelajaran : API Documentation with Swagger + Javadoc
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

============================================RANGKUMAN MATERI========================================================

Dokumentasi API (Javadoc)
- Dokumentasi API sangat berpangaruh pada keberhasilan suatu proyek pengembangan software.
- Di dalam Java, dokumentasi dapat dilakukan dengan memanfaatkan Javadoc.
- Notasi comment pada javadoc diawali dengan * diawal. Contoh : * This is javadoc.
- Comment pada javadoc biasanya terdiri dari 2 bagian yaitu : 
  1. Deskripsi dari apa yang kami komentar.
  2. Tag blok mandiri (ditandai dengan simbol “@”) yang menjelaskan meta-data tertentu.

- Contoh javadoc :
/ **
* <p> This is simple desccription of a method....
* <a href="http://www.google.com>Javadoc</a>
* </p>
* @param incomingDamage
* @return the account of health
* @see 
* @since 1.0
*/ 

Keterangan:
- @param :  memberikan deskripsi yang berguna tentang parameter method atau input yang diharapkan.
- @return : memberikan deskripsi tentang apa yang akan atau dapat dikembalikan oleh suatu method.
- @see :  akan menghasilkan tautan yang mirip dengan tag {@link}, tetapi lebih dalam konteks referensi 
          dan bukan inline.
- @since : menentukan versi class, field, atau method mana yang ditambahkan ke proyek.
- @version :  menentukan versi software, biasanya digunakan dengan makros %I% dan %G%.
- @throws : digunakan untuk menjelaskan lebih lanjut kasus-kasus yang diharapkan software sebagai pengecualian.
- @deprecated : memberikan penjelasan mengapa kode tidak digunakan lagi, kapan kode itu mungkin sudah tidak digunakan lagi, 
               dan apa alternatifnya.

Untuk menghasilkan javadoc ke dalam proyek. Jalan kan pada terminal mvn javadoc:javadoc


Swagger
- digunakan untuk melakukan visualisasi API
-  tools, spesifikasi, dan implementasi framework yang lengkap untuk menghasilkan representasi visual dari RESTful Web Services dimana memungkinkan 
   dokumentasi diperbarui dengan kecepatan yang sama dengan server. 


==================================================PROGRAM=============================================================================================

DemoSpringHello
- Membuat project spring dengan menambahkan dependency swagger-ui dan swagger2.
- Membuat file SwaggerConfig.java yang berguna untuk mengatur konfigurasi swagger.
- Membuat file controller yang bernama HelloController.java. Controller ini berfungsi untuk menampilkan String "Swagger Hello World" apabila kita 
  melakukan hit api dengan method GET pada endpoint /api/hacktiv8.
- Selanjutnya lakukan generate javadoc pada Project DemoSpringHello. Folder doc akan otomatis muncul dan akan menghasilkan dokumentasi javadoc.



