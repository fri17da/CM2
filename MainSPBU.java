import java.util.Scanner;
public class MainSPBU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKendaraan antrian = new AntrianKendaraan();
        QueueTransaksi transaksiQueue = new QueueTransaksi();

        int pilih;
        do {
            System.out.println("\n=== MENU SPBU ===");
            System.out.println("1. Tambah Antrian Kendaraan di awal");
            System.out.println("2. Tambah Antrian Kendaraan di akhir");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Jumlah Kendaraan dalam Antrian");
            System.out.println("5. Layani Kendaraan dan Catat Transaksi");
            System.out.println("6. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan plat nomor kendaraan: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan tipe kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan merk kendaraan: ");
                    String merk = sc.nextLine();
                    antrian.addFirst(new Kendaraan(plat, tipe, merk));
                    break;
                case 2: 
                    System.out.print("Masukkan plat nomor kendaraan: ");
                    String plat2 = sc.nextLine(); 
                    System.out.print("Masukkan tipe kendaraan: ");
                    String tipe2 = sc.nextLine(); 
                    System.out.print("Masukkan merk kendaraan: ");
                    String merk2 = sc.nextLine(); 
                    antrian.addLast(new Kendaraan(plat2, tipe2, merk2)); 
                    break;
                case 3:
                    antrian.tampilkanInformasi();
                    break;
                case 4:
                    System.out.println("Jumlah kendaraan dalam antrian: " + antrian.getSize());
                    break;
                case 5:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong, tidak ada kendaraan untuk dilayani.");
                        break;
                    }
                    Kendaraan k = antrian.layaniKendaraan();
                    System.out.println("Melayani kendaraan: " + k.platNomor);
                    System.out.print("Jenis BBM: ");
                    String bbm = sc.nextLine();
                    System.out.print("Jumlah Liter: ");
                    int liter = sc.nextInt();
                    System.out.print("Harga per Liter: ");
                    double harga = sc.nextDouble(); sc.nextLine();

                    Transaksi t = new Transaksi(k.platNomor, bbm, liter, harga);
                    transaksiQueue.enqueue(t);
                    System.out.println("Transaksi berhasil dicatat.");
                    break;
                case 6:
                    transaksiQueue.tampilkan();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
