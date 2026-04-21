public class OVO extends Pembayaran implements LayananPembayaran {
    public OVO() {
        super("OVO");
    }

    @Override
    public void bayar(double jumlah) {
        System.out.println("Pembayaran menggunakan " + namaPlatform + " sebesar: Rp" + jumlah);
    }
}