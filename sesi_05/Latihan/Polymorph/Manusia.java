abstract class Manusia {

    // deklarasi class dan method tipe abstract
    protected abstract void nyanyiLagu();

}

class Cowok extends Manusia {
    @Override
    protected void nyanyiLagu() {
        System.out.println("da du du di dam");
        // statement dari perilaku yang menampilkan output pesan text yang berbeda dari
        // class manusia
    }
}

class Cewek extends Manusia {
    // menggunakan method dari class abstract manusia
    @Override
    protected void nyanyiLagu() {
        System.out.println("du ri dam dam");
    }

}