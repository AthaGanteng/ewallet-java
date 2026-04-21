public class OVO implements LayananPembayaran {
    private double saldoOvo; 

    public OVO(double saldoAwal) {
        this.saldoOvo = saldoAwal;
    }

    @Override
    public void bayar(double jumlah) { 
        if (saldoOvo >= jumlah) {
            saldoOvo -= jumlah;
            System.out.println("Berhasil bayar pakai OVO: Rp" + jumlah);
        } else {
            System.out.println("Saldo OVO tidak cukup!");
        }
    }
}