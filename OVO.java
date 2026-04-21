public class OVO extends Pembayaran implements LayananPembayaran {
    public OVO(double saldoAwal) {
        super("OVO", saldoAwal);
    }

    @Override
    public void bayar(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah; 
            System.out.println("Pembayaran OVO Berhasil: Rp" + jumlah);
        } else {
            System.out.println("Pembayaran OVO Gagal: Saldo tidak cukup!");
        }
    }
}