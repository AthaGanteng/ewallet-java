public class DANA extends Pembayaran {
    public DANA(double saldoAwal) {
        super("DANA", saldoAwal);
    }

    public void prosesDana(double jumlah) { 
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Berhasil bayar pakai DANA: Rp" + jumlah);
        } else {
            System.out.println("Saldo DANA tidak cukup!");
        }
    }
}