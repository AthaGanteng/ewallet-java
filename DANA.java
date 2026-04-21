public class DANA extends Pembayaran implements LayananPembayaran {
    public DANA(double saldoAwal) {
        super("DANA", saldoAwal);
    }

    @Override
    public void bayar(double jumlah) {
        if (saldo >= jumlah) {  
            saldo -= jumlah;
            System.out.println("Pembayaran DANA Berhasil: Rp" + jumlah);
        } else {
            System.out.println("Pembayaran DANA Gagal: Saldo tidak cukup!");
        }
    }
}