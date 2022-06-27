Sesi         : 18 (24 Juni 2022)
Pembelajaran : SpringBoot - OAuth2 With JWT
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

Pada sesi ini akan dilakukan pembuatan RestAPI, namun dengan menggunakan authentication bearer token


============================================================PROGRAM===============================================================================

BelajarApiAuth

- Membuat model bernama Blog.java. Pada file ini akan dilakukan pembuatan entitas serta tabel yang memanfaatkan jpa hibernate dalam proses
  pembuatan tabel blog. Di dalamnya terdapat method setter getter yang berfungsi
  untuk melakukan set dan get nilai di setiap kolom tabel.
- Membuat model ernama UserInfo.java. Pada file ini akan dilakukan pembuatan entitas serta  tabel yang memanfaatkan jpa hibernate dalam proses
  pembuatan tabel user_info. Di dalamnya terdapat method setter getter yang berfungsi
  untuk melakukan set dan get nilai di setiap kolom tabel.
- Membuat model JwtRequest yang di dalamnya terdapat inisialisasi sesrialVersionUID. Disini terdapat deklarasi variabel username dan password
  serta method setter dan getter.
- Membuat model JwtResponse yang didalamnya terdapat jwttoken.
- Membuat repository dengan nama BlogRepository yang berfungsi sebagai interface yang mengextends JpaRepository. Di dalamnya terdapat custom query untuk
  melakukan search by title or content.
- Membuat repository UserInfoRepository yang berfungsi sebagai interface yang mengextends JpaRepository. Di dalamnya terdpat userInfo username dan password.
- Membuat service dengan nama BlogService. Blog service ini akan menginject BlogRepository . Terdapat 2 method yaotu getAllBlogs() untuk mendapatkan semua blog  
  serta findBlogById.
- Membuat service JwtUserDetailsService. Service ini akan menginject UserInfoRepository. Di dalamnya terdapat method untuk findByUserName serta error handling
  apabila user null. Method ini akan mengembalikan Username dan password di dalam suatu ArrayList.
- Membuat controller AuthController yang berfungsi untuk mengatur alur autentikasi user.
- Membuat controller BlogController yang berfungsi untuk mengatur alur endpoint /blog untuk dapat melakukan pencarian blog.
- Membuat controller UserController yang berfungsi untuk mengatur alur endpoint /user untuk mendapatkan informasi mengenai username dan password user. Password disini 
  akan di lakuken enkripsi dengan PasswordEncoder().
Pada postman:
 - Melakukan Create User dengan method POST pada endpoint /user. Disini akan melakukan pengisian atribut username, password, dan fullname pada body dengan tipe JSON.
 - Melakukan authenticate user dengan method POST pada endpoint /authenticate. Pada saat dihit, postman akan menunjukkan bearer token untuk melakukan autorisasi.
 - Melakukan Create new blog dengan method POST pada endpoint /blog. Untuk dapat melakukan hit, kita harus mengisikan authorisasi pada bearer token yang kita dapat sebelumnya.
 


