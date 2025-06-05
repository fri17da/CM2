public class Transaksi {
   String platNomor;
    String jenisBBM;
    int jumlahLiter;
    double hargaPerLiter;
    double totalBayar;

    Transaksi(String platNomor, String jenisBBM, int jumlahLiter, double hargaPerLiter) {
        this.platNomor = platNomor;
        this.jenisBBM = jenisBBM;
        this.jumlahLiter = jumlahLiter;
        this.hargaPerLiter = hargaPerLiter;
        this.totalBayar = jumlahLiter * hargaPerLiter;
    }

    void tampilkan() {
        System.out.println("Plat: " + platNomor + ", BBM: " + jenisBBM + ", Liter: " + jumlahLiter +
                ", Harga/liter: " + hargaPerLiter + ", Total: " + totalBayar);
    }
}
