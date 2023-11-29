import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //exception
        try {
            System.out.println("Masukkan Nomor Faktur:");
            String noFaktur = scanner.nextLine();

            System.out.println("Masukkan Nama Pelanggan:");
            String namaPelanggan = scanner.nextLine();
            Customer pelanggan = new Customer(namaPelanggan);

            System.out.println("Masukkan Nama Barang:");
            String namaBarang = scanner.nextLine();

            System.out.println("Masukkan Harga Barang:");
            double hargaBarang = scanner.nextDouble();

            System.out.println("Masukkan Jumlah Barang:");
            int jumlahBarang = scanner.nextInt();

            DetailTransaksi transaksi = new DetailTransaksi(namaBarang, hargaBarang, jumlahBarang);

            System.out.println("\nDetail Transaksi:");
            System.out.println("No. Faktur: " + noFaktur);
            System.out.println(pelanggan);
            System.out.println(transaksi);

        } catch (Exception e) {
            System.out.println("Input salah: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}