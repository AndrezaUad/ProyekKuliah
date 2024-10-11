public class Pilot {
    private String nama;
    private int jamTerbang;

    public Pilot(String nama, int jamTerbang) {
        this.nama = nama;
        this.jamTerbang = jamTerbang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJamTerbang() {
        return jamTerbang;
    }

    public void setJamTerbang(int jamTerbang) {
        this.jamTerbang = jamTerbang;
    }

    public void infoPilot() {
        System.out.println("Nama Pilot: " + nama + ", Jam Terbang: " + jamTerbang);
    }
}
