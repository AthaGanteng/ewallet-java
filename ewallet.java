class ewallet {
    private String owner;
    private double saldo;

    public String getOwner() {
        return owner;
    }

    public ewallet(String nama, int topup) {
        this.owner = nama;
        if (topup< 0) {
            this.saldo = 0;
            System.out.println("Saldo awal tidak boleh negatif. Set ke 0.");
        } else {
            this.saldo = topup;
        }
    }

    public double getsaldo() {
        return this.saldo;
    }
    
    public boolean deposit(int jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            return true;
        }
        return false;
    }

    public boolean withdraw(int jumlah) {
        if (jumlah > 0 && jumlah <= this.saldo) {
            this.saldo -= jumlah;
            return true;
        }
        return false;
    }
}