public class Bank {
    int Saldo,simUang,ambilUang;
    public Bank (int saldo){
        this.Saldo=saldo;
        System.out.println("Selamat Datang Di Bank ABC");
        System.out.println("Saldo Saat Ini : Rp "+ Saldo);
    }

    void simUang (int simUang){
        this.Saldo=600000;
        System.out.println("Simpan Uang: Rp "+ simUang);
        System.out.println("Saldo Saat Ini : Rp "+Saldo);
    }

    void ambilUang (int ambilUang){
        this.Saldo=450000;
        System.out.println("Ambil Uang : Rp "+ ambilUang);
        System.out.println("Saldo Saat Ini : Rp "+ Saldo);
    }
}
