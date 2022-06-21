Sesi         : 11 (20 Juni 2022)
Pembelajaran : NoSQL - MongoDB
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019


 JSON
- JSON sering digunakan untuk melakukan transfer data antara browser dan server
- JSON memiliki struktur yaitu pasangan antara key dan value
- Struktur kode json
		{
			"key" : "value"
		}

BSON
- MongoDB menyimpan data dalam bentuk BSON (Binary JSON)
- Keunggulan menggunakan BSON adalah tingkat parsing yang lebih cepat dan mendukung lebih banyak tipe native

MongoDB
- Berbeda dengan mySQL, mongoDB menyebut tabel dengan sebutan collection
- Data yang disimpan tidak terstruktur

Operasi Dasar MongoDB
- Perintah mongo digunakan untuk menjalankan mongodb
- use database_name : digunakan untuk membuat database
- show dbs : digunakan untuk melihat database yang sudah terbuat
- db.createCollection(name, options) : digunakan untuk membuat collection
- db.collection.insertOne() : digunakan untuk menambahkan document single/tunggal
- db.collection.insertMany() : digunakan untuk menambahkan banyak document
- db.collection.find() : digunakan untuk membaca document. Kalau parameter diisi, maka dapat melakukan filter
- db.collection.updateOne(filter, update) : mengubah satu document
- db.collection.updateMany(filter, update) : mengubah banyak dokumen sekaligus
- db.collection.replaceOne(filter, update) : ganti satu dokumen dengan dokumen yang baru
- db.collection.deleteOne(filter) : hapus satu dokumen
- db.collection.deleteMany(filter) : hapus banyak dokumen sesuai filter

Hubungan pada MongoDB
1. One to One
	Hubungan antar tabel dimana tabel A adalah master dan tabel B harus mempunyai data yang ada pada tabel A.

  Pengerjaan:
  - use rumah_sakit
     membuat database rumah_sakit 
	- db.createCollection("pasien");
	- db.createCollection("penyakit");
	  membuat collection pasien dan penyakit 
  - db.pasien.insertOne({ nama : "Foxy", umur : 20 , penyakit : "sakit_0001"});
    memasukkan data ke collection pasien dengan field tersebut
  - db.penyakit.insertOne({ _id : "sakit_0001" , penyakit : "flu"});
    memasukkan data ke collection penyakit dengan field tersebut
  - var penyakit_id = db.pasien.findOne().penyakit
    menyimpan data yang ada di collection penyakit ke dalam variabel penyakit_id
  - db.penyakit.findOne({_id : penyakit_id})
    memanggil data yang ada di collection penyakit dengan variabel penyakit_id
    Hasil Akhir : 
    Dengan menyimpan data penyakit pasien, kita dapat mencari nama penyakit di tabel penyakit

2. One to Many
	Sebuah hubungan antara tabel dimana tabel A memiliki sebuah data yang bisa di pakai pada tabel B data 
	tersebut bisa banyak data atau beberapa data saja.

  Pengerjaan:
  - use transaksi_hacktiv8
    membuat database transaksi_hacktiv8
  - db.createCollection("pelanggan");
  - db.createCollection("transaksi");
    membuat collection pelanggan dan transaksi
  - db.pelanggan.insertOne({_id : "PL0001", nama_pelanggan : "Brudi"});
    melakukan insert data ke collection pelanggan dengan field tersebut
  - db.pelanggan.insertOne({_id : "TR0001", tanggal_transaksi : new Date(), total_harga : 100000, id_pelanggan : "PL0001"});
    memasukkan data ke collection transaksi dengan field tersebut
  -  db.transaksi.insertOne({_id: "TR0002", tanggal_transaksi: new Date(), total_harga: 120000, id_pelanggan: "PL0001" });
    memasukkan data ke 2 di collection transaksi
  -  db.transaksi.insertOne({_id: "TR0003", tanggal_transaksi: new Date(), total_harga: 150000, id_pelanggan: "PL0001" });
    memasukkan data ke 3 di collection transaksi
  - db.transaksi.find().pretty()
    menampilkan isi dari collection transaksi
    Hasil Akhir: 
    Terlihat bahwa 3 data yang muncul memiliki id_pelanggan yang sama yaitu PL0001.

3. Many to Many
	Sebuah hubungan antara tabel dimana tabelnya ini ada banyak. Hubungannya itu bisa banyak tabel misalkan tabel A 
	dengan tabel B dan tabel C dengan tabel B

  Pengerjaan:
  - db.createCollection("detail_transaksi");
    membuat collection baru bernama detail_transaksi
  - db.detail_transaksi.insertOne({no_trans: "TR0001", barang: "Gelas", jumlah: 3});
  - db.detail_transaksi.insertOne({no_trans: "TR0001", barang: "Piring", jumlah: 2});
  - db.detail_transaksi.insertOne({no_trans: "TR0001", barang: "Sapu", jumlah: 2});
    memasukkan 3 data ke collection detail_transaksi
   - db.detail_transaksi.find().pretty()
   Hasil Akhir:
   Tabel transaksi yang sudah berelasi dengan pelanggan dapat membuat hubungan kembali dengan tabel detail_transaksi sehinigga terjadilah
   hubungan many to many.


LOOKUP
-Lookup merupakan metode untuk menampilkan data seperti find. Namun di lookup dapat menampilkan beberapa tabel.
contoh:
-Lookup menampilkan 2 tabel
db.collection.aggregate({ $lookup : { from : collection2, localField : “_id”, foreignField : “_id”, as : “join” } })

Lookup menampilkan 3 tabel
db.collection.aggregate( [ { $lookup : { from : collection2, localField : “_id”, foreignField : “_id”, as : “join” } }, 
{ $lookup : { from : collection3, localField : “_id”, foreignField : “_id”, as : “join” } } ] )


VALIDASI
- validasi adalah metode untuk melakukan pengecekan suatu data yang dimasukkan.



Contoh Query 
use latian_mongodb
db.createCollection("profile");

db.profile.insertOne ({ name : "t-rex", color: "red" });
db.profile.insertMany([ {name:"tricera" }, {name: "brachio" } ]);

db.profile.find();
db.profile.find({name: "t-rex"});

db.profile.updateOne ( { color: "red" }, { $set: { name: "allo" } } );

db.profile.find()

db.collection.deleteOne({name : "brachio" }));



Database barang_hacktiv8
Validasi dengan json schema
{
  $jsonSchema: {
        bsonType : "object",
        Required : ["namabarang", "hargabarang", "jenisbarang", "description"]
  },
  namaBarang : {
    bsonType : "string",
    Description : "nama barang harus berupa karakter dan tidak boleh kosong!"
  },
  hargaBarang : {
    bsonType : "number",
    Description : "Harga barang harus berupa number dan tidak boleh kosong!"
  },
  jenisBarang : {
    bsonType : "objectId",
    Description : "Jens barang harus berupa objectID dan tidak boleh kosong!"
  },
  description : {
    bsonType : "array",
    Description : "Deskiripsi harus berupa karakter dan tidak boleh kosong!"
    items:{
      bsonType : "object",
      required: ["merk", "ukuran","stok"],
      Properties : [
      Merk : {
        bsonType : "string",
        description : "Merk harus berupa karakter dan tidak boleh kosong!"
      }
      ukuran : {
        bsonType : "string",
        description : "ukuran harus berupa karakter dan tidak boleh kosong!"
      }
      stok {
        bsonType : "number",
        description : "number harus berupa angka dan tidak boleh kosong!"
      }]
    }
  },
  
}




