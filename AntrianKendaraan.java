import java.util.Scanner;
public class AntrianKendaraan {
    Scanner sc = new Scanner(System.in);
    NodeKendaraan head, tail;
    boolean isEmpty() {
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            NodeKendaraan tmp = head;
            System.out.println("Daftar Kendaraan dalam Antrian:");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Antrian kosong.");
        }
    }
    public void addFirst(Kendaraan input) {
        NodeKendaraan ndInput = new NodeKendaraan(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
         System.out.println("Kendaraan dengan plat " + input.platNomor + " berhasil ditambahkan ke antrian.");
    }
    public void addLast(Kendaraan input) {
        NodeKendaraan ndInput = new NodeKendaraan(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        System.out.println("Kendaraan dengan plat " + input.platNomor + " berhasil ditambahkan ke antrian.");
    }
    public Kendaraan layaniKendaraan() {
    if (isEmpty()) {
        System.out.println("Tidak ada kendaraan dalam antrian.");
        return null;
    } else {
        Kendaraan dilayani = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return dilayani;
    }
}
    public Kendaraan lihatAntrianDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            return head.data;
        }
    }
    public Kendaraan lihatAntrianBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            return tail.data;
        }
    }
    public int getSize() {
        int size = 0;
        NodeKendaraan tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }
        return size;
    }
    public void clear() {
        head = null;
        tail = null;
    }

    void tampilkanInformasi() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            NodeKendaraan tmp = head;
            System.out.println("Daftar Kendaraan dalam Antrian:");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
        }
    }
}