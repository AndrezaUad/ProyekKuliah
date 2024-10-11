public class Pesawat {
    // Enkapsulasi: atribut private
    private String nama;
    private int kapasitas;

    // Constructor
    public Pesawat(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
    }

    // Overloading Constructor
    public Pesawat() {
        this.nama = "Default";
        this.kapasitas = 100;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Method umum yang dapat dioverride oleh kelas anak
    public void terbang() {
        System.out.println("Pesawat sedang terbang.");
    }
}
