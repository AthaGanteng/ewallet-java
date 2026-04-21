public class Main {
    public static void main(String[] args) {

        OVO ovoAtha = new OVO(50000);
        DANA danaAtha = new DANA(100000);

        System.out.println("--- Saldo Awal ---");
        System.out.println("OVO: " + ovoAtha.getSaldo());
        System.out.println("DANA: " + danaAtha.getSaldo());

        System.out.println("\n--- Proses Transaksi ---");
        System.out.println("Melakukan pembayaran sebesar Rp20.000 menggunakan OVO...");
        System.out.println("Melakukan pembayaran sebesar Rp150.000 menggunakan DANA...");
        ovoAtha.bayar(20000); 
        danaAtha.bayar(150000); 
        System.out.println("\n--- Saldo Akhir ---");
        System.out.println("Sisa OVO: " + ovoAtha.getSaldo());
        System.out.println("Sisa DANA: " + danaAtha.getSaldo());
    }
}