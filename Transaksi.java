public interface Transaksi {
    // Setiap transaksi pasti butuh eksekusi dan pencatatan jumlah
    void prosesTransaksi();
    double getJumlah();
}
