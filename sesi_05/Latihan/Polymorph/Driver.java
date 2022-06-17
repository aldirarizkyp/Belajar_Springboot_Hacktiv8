public class Driver {
    public static void main(String[] args) {
        // bentuk 1 (class sendiri)
        AnakUmur1Tahun i = new AnakUmur1Tahun();
		i.anakSiapa();
		i.makan();
        //bentuk 2 Class lain
		Induk a1 = new AnakUmur1Tahun();
		a1.minum();
        //Interface
		AktivitasPagi a11 = new AnakUmur1Tahun();
		a11.hobiAnak();
    }
}
