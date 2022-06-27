Sesi         : 20 (27 Juni 2022)
Pembelajaran : Secure Springboot App
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

===================================================RANGKUMAN MATERI================================================================================

- Security merupakan suatu hal yang penting dalam pembuatan apliaksi.
- Biasanya security pada aplilkasi menggunakan mekanisme Authentication dan Authorization
- Authentication : security yang menangani user yang masuk kedalam sistem.
- Authorization : setelah user berhasil masuk ke dalam sistem, akses apa saja yang dapat user lakukan di dalam sistem.
- Library security pada Spring adalah spring-boot-startersecurity.


========================================================PROGRAM====================================================================================

AssignmentApiProductUnitTest

  TestObjectFactory.java
- Membuat file class tambahan pada src/test/java yaitu TestObjectFactory.java
- Pada file ini terdapat method createProduct() yang akan melakukan pembuatan object dari class Product untuk dapat 
  dilakukan pemanggilan method set pada attribut Id, Nama, HargaBeli, dan HargaJual. Method ini akan mengembalikan object product tersebut.
- Keempat atribut tersebut akan di set dengan angka random untuk id, dan String Random untuk Nama, HargaBeli, dan HargaJual.
- Selanjutnya dibuat method kedua bernama createProductList(final int size) yang akan mengembalikan List<Product>.
- Method ini akan melakukan looping sesuai dengan size yang ditentukan untuk memasukkan produk-produk yang dibuat pada method createProduct() 
  ke dalam ArrayList. Method createProductList() ini akan mengembalikan object result.
- Selanjutnya method testCreateProduct() akan memanggil method createProductList(5) yang artinya produk akan masuk kedalam ArrayList sebanyak 5 produk 
  dengan value dari attribut setiap produk diisi secara random.

  ProductServiceTest.java
- Pada src/test/java dibuat file Class ProductServiceTest.java. File ini digunakan untuk menentukan unit testing yang ada pada program.
- Proses run akan dilakukan dengan class SpringRunner.
- Di dalam file ini terdapat beberapa hal yang harus dilakukan yaitu:
  1. @InjectMocks (Mockito Annotation) : membuat objek productService dengan konsep polymorphsm dari kelas ProductService dan ProductServiceImpl.
  2. @Mock (Mockito Annotation) : untuk membuat depedency tiruan. Melakukan deklarasi variabel productRepository dengan tipe data ProductRepository.
  3. @Before (Junit) : method void setup() menggunakan anotasi @Before yang berarti akan dipanggil pertama kali setiap dilakukan unit testing.
  4. MockitoAnnotations.initMocks(this) : melakukan inisialisasi setiap property yang diberi annotasi @Mock.
- Selanjutnya akan dibuat unit testing yang disetiap test nya terdapat @Test (annotasi JUnit untuk menandakan suatu method yang akan di tes) yang terdiri dari:
  1. public void testFindAll()
     - melakukan persiapan data dummy dari class testObjectFactory yang disimpan dalam variabel datas dengan jumlah 10.
     - melakukan pemanggilan method findAll() dengan Mockito dan mengembalikan variabel datas.
     - final List<Produc> actual digunakan untuk memanggil method findAllProduct() dari productService.
     - MatchAssert.assertThat() digunakan untuk melakukan pencocokan jumlah data. Dalam kasus ini yang di cocokan adalah size dari actual dan size dari datas.
  2. public void testProductById() 
     - menginisialisasi nilai id secara random 
     - membuat data dummy dengan memanfaatkan class TestObjectFactory sebanyak 10.
     - Mockito.when(productRepository.findById(id)).thenReturn(Optional. of(product)) akan mengeksekusi productRepository.findById() mock dan mengembalikan
       product tipe Optional.
     - membuat objek actual untuk mengakses method productService.findIdByProduct(id).
     - selanjutnya akan dilakukan MatcherAssert untuk melakukan pencocokan antara data actual dan product.
  3. public void testProductByIdWithNullDataFromDB()
     - melakukan inisialisasi id dengan menggunakan nilai random.
     - memanggil findById(id) dari productRepository dan mengembalikan nilai null tipe Optional.
     - Membuat objek actual dengan memanggil method findIdByProduct(id) dari productService.
     - melakukan pencocokan data antara objek actual dengan nilai null.
  4. public void testSaveUpdateProduct()
     - melakukan persiapan data dummy dari class testObjectFactory dengan membuat objek product.
     - memanggil productRepository.save(product) dengan Mockito dan mengembalikan objek product.
     - membuat objek actual yang akan memanggil method saveorUpdateProduct(product) dari productService.
     - melakukan pencocokan data dengan MatcherAssert antara objek actual dengan notnullvalue dengan tujuan bahwa nilai dari product itu tidak null.
  5. public void testDeleteProduct()
     - menginisialisasi id dengan nilai random
     - memubat objek product data dummy dengan memanfaatkan kelas TestObjectFactory
     - memanggil productRepository.findById(id) dengan Mockito dan mengembalikan objek product dengan tipe Optional
     - method doNoting() digunakan karena pada saat mengeksekusi kode ini, tidak melempar data apapun.
     - Mockito.verify(productRepository, times(1)).delete(product) digunakan untuk memverifikasi bahwa kode sudah di eksekusi.


AssignmentApiProductBasicAuth

- membuat model baru dengan nama User. Didalamnya terdapat penentuan entitas untuk tabel beserta atribut dan juga method setter dan getter
- membuat repository dengan nama UserRepository yang akan menjadi interface yang mengextends JpaRepository.
- Di dalam repository ini terdapat custom User findByUsername(String name).
- Membuat UserController yang berguna untuk mengatur alur mapping endpoint pada URL dan menginjeksi kelas UserRepository. Mapping tersebut terdiri dari:
  1. @RequestMapping("api/user") : untuk melakukan request, harus diawali dengan endpoint api/user
  2. @GetMapping("/test1") : endpoint /test1 akan memanggil method test1() yang mereturn string "Api Test 1".
  3. @GetMapping("/test2") : endpoint /test2 akan memanggil method test2() yang mereturn string "Api Test 2".
  4. @GetMapping("") : endpoint "" akan memanggil method users() yang mereturn method findAll() dari userRepository.
- Membuat ProfileController yang berguna untuk mengatur alur endpoint pada URL yang terdiri dari:
  1. @RequestMapping("api/user") : untuk melakukan request, harus diawali dengan endpoint api/user.
  2. @GetMapping ("/test1") : endpoint /test1 akan memanggil method test1() yang mereturn string "Api Test 1".
- Membuat ManagementController yang berguna untuk mengatur alur mapping endpoint pada URL dan menginjeksi kelas UserRepository. Mapping terdiri dari:
  1. @RequestMapping("api/management") : untuk melakukan request, harus diawali dengan endpoint api/management.
  2. @GetMapping("/test1") : endpoint /test1 akan memanggil method test1() yang mereturn string "Api Test 1".
  3. @GetMapping("/test2") : endpoint /test2 akan memanggil method test2() yang mereturn string "Api Test 2".
  4. @GetMapping("") : endpoint "" akan memanggil method users() yang mereturn method findAll() dari userRepository.
- Membuat HomeController yang berguna untuk mengatur alur endpoint pada URL yang terdiri dari:
  1. @RequestMapping("/api") : untuk melakukan request, harus diawali dengan endpoint /api
  2. @GetMapping("/index") : endpoint /index akan memanggil method index() yang mereturn string "Welcome...".
  3. @GetMapping("/logout") : endpoint /logout digunakan untuk menghapus cookie.
- Membuat class SecurityConfig.java yang berguna untuk mengatur autorisasi dari endpoint yang akan di hit.
  1. api/index : dapat diakses oleh semua.
  2. api/profile : dapat diakses oleh semua.
  3. api/product/** : hanya dapat diakses oleh role Admin.
  4. api/management/** : dapat diakses oleh Admin dan Manager.
  5. api/user/test1 : hanya dapat diakses oleh user yang memiliki authority untuk akses test1 yaitu Manager dan Admin.
  6. api/user/test2 : hanya dapat diakses oleh user yang memiliki authority untuk akses test2 yaitu Admin.



