Sesi         : 19 (27 Juni 2022)
Pembelajaran : Secure Springboot App
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

==============================================RANGKUMAN MATERI=====================================================================================

===================================================PROGRAM=========================================================================================

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
  1.  @InjectMocks (Mockito Annotation) : 
  2.  @Mock (Mockito Annotation) : 
  3.  @Before (Junit) : 




AssignmentApiProductBasicAuth


