public class Pelanggan {
    private int idPelanggan;
    private String nama;
    private String nik;
    private String alamat;

    public Pelanggan() {
    }

    public Pelanggan(int idPelanggan, String nama, String nik, String alamat) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
