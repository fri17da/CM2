public class NodeTransaksi {
    Transaksi data;
    NodeTransaksi next;

    NodeTransaksi(Transaksi data, NodeTransaksi next) {
        this.data = data;
        this.next = next;
    }
    void tampilkanTransaksi() {
        if (data != null) {
            data.tampilkan();
        } else {
            System.out.println("Data transaksi tidak tersedia.");
        }
    }
}