Sesi         : 8 (18 Juni 2022)
Pembelajaran : Multithreading - Synchronize Java
Nama         : Aldiransyah Rizky Putra
Kode Peserta : JVSB001ONL019

Multithreading
-Multithreading merupakan konsep untuk dapat menjalankan tugas secara bersamaan sehingga tidak perlu saling menunggu.
- Terdapat 2 cara membuat thread yaitu dengan cara:
 1. implement runnable
    
  - membuat class dengan nama thread hello yang mengimplements kelas runnable
  - mendeklarasikan variabel name
  - membuat constructor  ThreadHello yang berisi parameter nama
  - membuat method override run() yang menampilkan output hello
  - di dalam method tersebut terdapat try untuk memerintahkan program sleep selama 250 ms 
    and catch untuk memanggil kelas Loggger dan Level
  - lalu membuat method testRun yang berguna untuk membuat threaed sebanyak 5.
  - Output yang dihasilkan akan menampilkan hello secara tidak berurutan yang mengartika bahwa program tidak saling menunggu

2. extends thread
  - membuat kelas ThreadWorld yang mengextend kelas Thread
  - membuat method run() untuk mencetak World dan diberikan try sleep 250 ms agar sistem tidak terlalu cepat berjalan
  - catch memanggil kelas logger dan Level
  - Selanjutnya dibuat method testRun() yang akan menghasilkan thread sebanyak 5 kali. Di dalamnya terdapat setName untuk memberikan label 
    pada thread.

Synchronized
- Synchronized digunakan untuk mengontrol thread
- Membuat kelas Number Generator untuk membuat random number dengan batas atas dan bawah tertentu
- method randomNumber() dibuat untuk dipanggil oleh beberapa thread
- Membuat kelas ThreadNumber yang mengextend kelas Thread
- di dalam kelas tersebut terdapat method run() yang memenaggil callGenerator()
- callGenerator() berfungsi untu kmenampilkan 3 random number
- lalu dibuat method testRun() yang membuat instance generator dari kelas NumberGenerator yang memberikan parameter batas atas dan bawah (1000, 2000)
- apabila synchronized diaktifkan, thread akan muncul secara teratur.