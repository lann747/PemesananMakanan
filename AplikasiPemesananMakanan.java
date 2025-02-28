import java.util.Scanner;

public class AplikasiPemesananMakanan {

    // variabel yang menyimpan data pelanggan
    private String[] pelanggan = new String[2];

    // variabel yang menyimpan data pesanan
    private Object[] pesanan = new Object[3];

    // method untuk mengatur data pelanggan
    public void setPelanggan(String nama, String telepon) {
        pelanggan[0] = nama;
        pelanggan[1] = telepon;

    }

    // method untuk mengatur data pesanan
    public void setPesanan(String jenisMakanan, int jumlahPesanan, int hargaPerPorsi) {
        pesanan[0] = jenisMakanan;
        pesanan[1] = jumlahPesanan;
        pesanan[2] = hargaPerPorsi;
    }

    // method untuk menghitung total harga pesanan
    public int hitungTotalHarga() {
        int jumlahPesanan = (int) pesanan[1];
        int hargaPerPorsi = (int) pesanan[2];
        return jumlahPesanan * hargaPerPorsi;
    }

    // method untuk mendapat data pelanggan
    public String[] getPelanggan() {
        return pelanggan;
    }

    // method untuk mendapat data pesanan
    public Object[] getPesanan() {
        return pesanan;
    }

    // method untuk mendapatkan total harga
    public int getTotalHarga() {
        return hitungTotalHarga();
    }

    // main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat aplikasi
        AplikasiPemesananMakanan aplikasi = new AplikasiPemesananMakanan();

        Scanner scanner = new Scanner(System.in);

        // input data pelanggan
        System.out.println("Selamat datang di aplikasi pemesanan makanan! \n");
        System.out.println("Silakan masukkan data pelanggan:");
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Nomor Telepon: ");
        String telepon = scanner.nextLine();
        aplikasi.setPelanggan(nama, telepon);

        // input data pesanan
        System.out.println("Silakan masukan data pesanan makanan: ");
        System.out.print("Jenis Makanan: ");
        String jenisMakanan = scanner.nextLine();
        System.out.print("Jumlah Pesanan: ");
        int jumlahPesanan = scanner.nextInt();
        System.out.print("Harga Per Porsi: ");
        int hargaPerPorsi = scanner.nextInt();
        aplikasi.setPesanan(jenisMakanan, jumlahPesanan, hargaPerPorsi);

        // Menampilkan data pelanggan
        System.out.println("Data pelanggan: ");
        System.out.println("Nama: " + aplikasi.getPelanggan()[0]);
        System.out.println("Nomor Telepon: " + aplikasi.getPelanggan()[1]);

        // Menampilkan data pesanan
        System.out.println("Data Pesanan Makanan: ");
        System.out.println("Jenis Makanan " + aplikasi.getPesanan()[0]);
        System.out.println("Jumlah Pesanan " + aplikasi.getPesanan()[1]);
        System.out.println("Harga per porsi " + aplikasi.getPesanan()[2]);

        // Menampilakn total harga
        System.out.println("Total harga pesanan: " + aplikasi.getTotalHarga());

        scanner.close();

    }

}