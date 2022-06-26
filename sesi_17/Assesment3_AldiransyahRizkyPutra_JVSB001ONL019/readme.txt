Nama					: Aldiransyah Rizky Putra
Kode Peserta			: JVSB001ONL019
Link Github				:
Panduan Penggunaan Aplikasi   :
 
- membuat model pada com.assignment.api.model yaitu Product.java. Didalamnya terdapat penentuan entitas beseta tabel dan atribut.
  Selanjutnya terdapat method setter getter yang berfungsi untuk memasukkan nilai dan untuk mendapatkan nilai.
- membuat repository pada com.assignment.api.repository yang bernama ProductRepository.java. File ini digunakan sebagai interface
  yang akan melakukan extends ke JpaRepository
- membuat service pada com.assignment.api.servie yang bernama ProductService.java. File ini berguna untuk menyimpan data produk di dalam suatu List.
- membuat controller pada com.assignment.api.controller yang bernama ProductController.java. Controller ini berfungsi untuk memberikan
  mapping pada setiap http method (get, post, put, dan delete).
- Program ini juga memberikan landing page yang diatur pada com.assignment.api.controller yang bernama WelcomeController.java. Di dalamnya
  terdapat RequestMapping yang mengarah ke "/home" yang dijalankan dengan method index() yang mereturn "index".
- Jalankan program pada Boot Dashboard dan pilih run pada AssignkentApiProduct.
- Database yang digunakan bernama db_product
- Sistem akan berjalan pada localhost:8080
- Lakukan perintah pada postman:
  1. GetAllProducts (GET)
     URL : http://localhost:8080/api/v1/products
  2. GetProductById (GET)
     URL : http://localhost:8080/api/v1/products/3
  3. AddProduct  (POST)
     URL : http://localhost:8080/api/v1/products
     body (json) :  
{
    "nama" : "Esse",
    "hargaBeli" : 15000,
    "hargaJual" : 30000
}
  4. UpdateProductById (PUT)
     URL : http://localhost:8080/api/v1/products/3
     body (json) :
 {
        "id": 3,
        "nama": "SuryaPro Merah",
        "hargaBeli": 17000,
        "hargaJual": 25000
    }

  5. DeleteProductById (DELETE)
    URL : http://localhost:8080/api/v1/products/3
    
     
