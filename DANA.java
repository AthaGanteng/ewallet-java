public class DANA extends Pembayaran implements LayananPembayaran {
    public DANA() {
        super("DANA");
    }

    @Override
    public void bayar(double jumlah) {
        System.out.println("Pembayaran menggunakan " + namaPlatform + " sebesar: Rp" + jumlah);
    }
}