Sesi         : 22 (28 Juni 2022)
Pembelajaran : Code Coverage, Deployment 
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

=====================================================RANGKUMAN MATERI=======================================================

CodeCoverage
- tools untuk mengukur efekticitas dari unit testing dan untuk menunjukkan kelengkapan kode yang ditulis sesuai dengan 
  proses bisnis yang telah dicover oleh unit test.
- tools ini dapat memberikan nilai terkat berapa persen kode yang telah di testing dan belum.

Sonarqube
- tools untuk mengukur kualitas dari code yang telah ditulis untuk mendapatkan bug, code smells, dan security vulnerabilities.
- Report dari Jacoco akan dibaca oleh Sonarqube dan akan menampilkan informasi dari webbrowser.


======================================================PROGRAM===============================================================
SonarQube
-Jalankan sonarqube pada cmd dengan mengkases file bin/windows-x86-64 dan jalankan perintah StartSonar.bat
- SonarCube akan menjalankan server nya pada port 9090.
- Pada dashboard SonarQube, buat sebuah project lalu lakukan generete key pada project maven
- Key yang didapatkan tersebut akan dijalankan pada console pada project maven BelajarSpringJacoco

BelajarSpringJacoco
-Menambahkan dependency jacoco pada bagian POM 
-Lakukan maven install dan maven clean
-Setelah berhasil install, maka pada folder target akan terbuat sebuah folder coverage-reports. Folder inilah yang akan dibaca oleh SonarCube
 sebagai sebuah code coverage.
-Lakukan generete pada project dengan memasukkan hasil generate dari SonarQube
-Jalankan dengan menggunakan perintah mvn sonar:sonar
- Project akan terconnect dengan SonarQube. 
- Pada dashboard SonarQube terdapat informasi terkait bug, code smells, security vulnerabilities dari source code project BelajarSpringJacoco.

