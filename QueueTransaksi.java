public class QueueTransaksi {
    NodeTransaksi front;
    NodeTransaksi rear;

    public QueueTransaksi() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Transaksi data) {
        NodeTransaksi newNode = new NodeTransaksi(data, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void tampilkan() {
    if (isEmpty()) {
        System.out.println("Riwayat transaksi kosong.");
        return;
    }

    System.out.println("\n=== Riwayat Transaksi ===");
    NodeTransaksi current = front;
    int nomor = 1;
    while (current != null) {
        Transaksi t = current.data;
        System.out.println("Transaksi " + nomor + ":");
        System.out.println("Plat Nomor    : " + t.platNomor);
        System.out.println("Jenis BBM     : " + t.jenisBBM);
        System.out.println("Jumlah Liter  : " + t.jumlahLiter);
        System.out.println("Harga per Liter: " + t.hargaPerLiter);
        System.out.println("Total Bayar   : " + t.totalBayar);
        System.out.println("-----------------------------");
        current = current.next;
        nomor++;
    }
   }
}