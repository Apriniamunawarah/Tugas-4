public class MainApp {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Ayam ayam = new Ayam();
        Kucing kucing = new Kucing();
        Kuda kuda = new Kuda();

        hewan.suara();

        hewan=ayam;
        hewan.suara();

        hewan=kucing;
        hewan.suara();

        hewan=kuda;
        hewan.suara();
    }
}
