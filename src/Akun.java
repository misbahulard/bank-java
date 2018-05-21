public class Akun {
    private int noAkun;
    private int idPelanggan;
    private float saldo;
    private int idBank;
    private String namaBank;
    private String alamatBank;

    public Akun() {
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    public String getAlamatBank() {
        return alamatBank;
    }

    public void setAlamatBank(String alamatBank) {
        this.alamatBank = alamatBank;
    }

    public int getNoAkun() {
        return noAkun;
    }

    public void setNoAkun(int noAkun) {
        this.noAkun = noAkun;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public void buatAkun(int noAkun, int idPelanggan, float saldo, int idBank, String namaBank, String alamatBank) {
        this.noAkun = noAkun;
        this.idPelanggan = idPelanggan;
        this.saldo = saldo;
        this.idBank = idBank;
        this.namaBank = namaBank;
        this.alamatBank = alamatBank;
    }

    private void menabung(float uang) {
        this.saldo += uang;
    }

    private boolean tarikSaldo(float uang) {
        float sisaSaldo = this.saldo - uang;
        if (sisaSaldo >= 0) {
            this.saldo -= uang;
            return true;
        } else {
            System.out.println("Saldo anda tidak mencukupi");
            return false;
        }
    }
}
