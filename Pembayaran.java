public class Pembayaran {
    protected String namaPlatform;
    protected double saldo;

    public Pembayaran(String namaPlatform, double saldoAwal) {
        this.namaPlatform = namaPlatform;
        this.saldo = saldoAwal;
    }

    public double getSaldo() {
        return this.saldo;
    }
}