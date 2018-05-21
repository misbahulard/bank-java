public class App {

    public static void main(String[] args) {
        Akun akun = new Akun();
        Pelanggan pelanggan = new Pelanggan(1, "Arka", "351001112950001", "Krian, Sidoarjo, 61262");
        akun.buatAkun(1, 1, 50000, "BCA", "Sedati, Sidoarjo, 62125");

        System.out.println("Nasabah: " + pelanggan.getNama());
        System.out.println("Akun: " + akun.getNamaBank() + ", No Akun: " + akun.getNoAkun() + ", Saldo: " + akun.getSaldo());
    }
}
