public class Kendaraan {
    String platNomor, tipe, merk;

    public Kendaraan() {
    }
    public Kendaraan(String platNomor, String tipe, String merk) {
    this.platNomor = platNomor;
    this.tipe = tipe;
    this.merk = merk;
    }
    Kendaraan(String platNomor) {
        this.platNomor = platNomor;
    }
    void tampilkanInformasi() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
    }
}

