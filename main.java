public class main{
    public main() { 
}
    public static void main(String[] args) {
        ewallet dompetku = new ewallet("Alice", 50000);
        System.out.println("Saldo Awal: " + dompetku.getsaldo());

        dompetku.deposit(20000);
        System.out.println("Setelah Deposit 20rb: " + dompetku.getsaldo());

        if (!dompetku.withdraw(100000)) {
            System.out.println("Transaksi Gagal: Saldo tidak cukup!");
        }
    }
}