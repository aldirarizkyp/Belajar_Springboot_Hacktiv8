Sesi         : 17 (23 Juni 2022)
Pembelajaran : SpringBoot - Restful Web Services/REST Template
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

============================================RANGKUMAN MATERI========================================================

API (Aplication Programming Interface)
- interface yang digunakan oleh suatu layanan dengan yang lainnya untuk saling berkomunikasi
- dengan adanya API, developer dapat menghemat waktu dalam pengembangan suatu project.

Perbedaan Web Service dan API
1. Web Service memfasilitasi untuk melakukan interaksi antar dua aplikasi melalui jaringan. Sedangkan API bertindak
   sebagai penghubung antara dua aplikasi berbeda sehingga dapat berkomunikasi satu sama lain.
2. Semua Web Service menggunakan API, tetapi tidak semua API digunakan sebagai web service.
3. Web service selalu membutuhkan jaringan, sedangkan API tidak
4. Web service hanya menggunakan 3 style (SOAP, REST, atau XML-RPC) untuk berkomunikasi. Sedangkan API dapat menggunakan apapun.

REST API
- Rest adalah bagaimana cara kita menggunakan reource yang ada di sebuah server dengan mengakses url yang telah disediakan.
- Umumnya terdapat 4 method yang umum:
  1. GET : untuk membaca data 
  2. POST : untuk membuat data baru
  3. PUT : untuk merubah/update data
  4. DELETE : untuk menghapus data

Komponen Restful API
REQUEST
- HTTP Method
- URI
- HTTP Version
- Request Header
- Request Body

RESPONSE
- Response Code
- Http version
- Response Header
- Response Body


============================================PROGRAM==================================================

BelajarApiUser
- membuat project spring dengan dependency SpringWeb, SpringDataJPA, MySQL Driver, 
- pada com.learning.api.controller terdapat file BelajarApiController.java  yang berfungsi untuk menentukan jalur program
  dengan memberikan mapping endpoint. Pada program ini dapat diakses pada /belajar-api/v1/get 
- sistem akan menampilkan "Kuy Belajar API"
- Selanjutnya program ini akan mencoba untuk membuat Rest untuk data User dengan menggunakan db_users 
- pada com.learning.api.model terdapat file User. File ini digunakan sebagai pengaturan model User. Penentuan entitas, kolom, dan method
  setter getter juga dilakukan pada file model User.
- pada com.learning.api.repository terdapat file UserRepository.java yang berfungsi sebagai interface yang akan mengextends JpaRepository
  untuk melakukan proses CRUD.
- pada com.learning.api.service terdapat file UserService.java yang akan menjadi middle layer dari repository dan controller.
- membuat controller pada com.learning.api.controller yang bernama UserController.java yang berfungsi untuk membuat mapping endpoint yang akan 
  dijalankan dengan http method Rest.



