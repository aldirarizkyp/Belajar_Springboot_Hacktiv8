Sesi         : 21 (27 Juni 2022)
Pembelajaran : Best Practice : Integration Firebase Cloud Messaging with Spring-boot and Secure-boot App.
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

===============================================RANGKUMAN MATERI===================================================
FirebaseCloudMessaging
- service yang disediakan oleh firebase untuk dapat melakukan push notification pada perangkat Android, Ios, dan front end.
- FCM ini sangat dibutuhkan untuk aplikasi yang membutuhkan push notification.


====================================================PROGRAM=======================================================

HelloJavaSpringFCM (Firebase)

- Membuat model Note yang memanfaatkan Lombok sehingga hanya perlu mendefinisikan suatu entitas dengan notas @Data. Didalamnya
  terdapat method setter getter untuk melakukan set dan get pada atribut subject, content, data, dan image.
- Membuat service FirebaseMessagingService. File serive ini akan memanfaatkan Class FirebaseMessaging yang akan digunakan
  dalam method sendNotification(). Method ini akan membuat objek dari class Notification dan melakukan set pada atribut
  title, body, dan imagae. Selanjutnya terdapat objek message dari class Message yang akan melakukan set atribut topic, notification,
  dan putAllData(). Method sendNotification() ini akan mengembalikan objek message melalui firebaseMessaging.send(message).
- Membuat controller NoteController yang bergunsi untuk mengatur mapping endpoint yang akan dihit pada URL. Endpoint /send-notificatiion
  akan memerlukan @RequestBody sehingga atribut pada Note harus diisikan pada body postman.
- Pada HelloJavaSpringFcmApplication.java akan ditentukan resource yang digunakan untuk melaukan push notifikasi. Resource tersebut adalah
  firebase-service-account.json yang berada pada resource.
- firebase-service-account.json didapatkan dari generate new private key yang ada pada firebase console.

HelloJavaSpring
- Membuat controller WelcomeController.java untuk mengatur endpoint yang nantinya akan di hit pada URL. Mapping tersebut terdiri dari:
  1. @RequestMapping("/api/welcome/") : untuk melakukan request perlu ditulis endpoint /api/walcome.
  2. @GetMapping("/index") : endpoint /index akan memanggil method mainHello() yang mereturn String "hello...belajarSpringboot).



