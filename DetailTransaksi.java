//inheritance
public class DetailTransaksi extends Barang implements Pembayaran {
    private int jumlah;

    public DetailTransaksi(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJumlah Barang: " + jumlah + "\nTotal Harga: " + hitungTotal();
    }
}