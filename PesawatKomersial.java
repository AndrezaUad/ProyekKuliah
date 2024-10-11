public class PesawatKomersial extends Pesawat {
    private String maskapai;

    public PesawatKomersial(String nama, int kapasitas, String maskapai) {
        super(nama, kapasitas);
        this.maskapai = maskapai;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    // Overriding method terbang
    @Override
    public void terbang() {
        System.out.println("Pesawat komersial " + getNama() + " dari maskapai " + maskapai + " sedang terbang.");
    }
}
