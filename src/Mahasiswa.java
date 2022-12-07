public class Mahasiswa {
    private String npm;
    private String nama;
    private String npm1;
    private String nama1;

    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }
    
    public Mahasiswa(String npm) {
        this.npm = npm;
    }
    
    public Mahasiswa(String npm, String npm1, String nama1) {
        this.npm = npm;
        this.npm1 = npm1;
        this.nama1 = nama1;
    }

    public Mahasiswa() {
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm1() {
        return npm1;
    }

    public void setNpm1(String npm1) {
        this.npm1 = npm1;
    }

    public String getNama1() {
        return nama1;
    }

    public void setNama1(String nama1) {
        this.nama1 = nama1;
    }
    
    
}
