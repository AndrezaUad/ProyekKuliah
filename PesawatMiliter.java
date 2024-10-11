public class PesawatMiliter extends Pesawat {
    private String tipeSenjata;

    public PesawatMiliter(String nama, int kapasitas, String tipeSenjata) {
        super(nama, kapasitas);
        this.tipeSenjata = tipeSenjata;
    }

    public String getTipeSenjata() {
        return tipeSenjata;
    }

    public void setTipeSenjata(String tipeSenjata) {
        this.tipeSenjata = tipeSenjata;
    }

    // Overriding method terbang
    @Override
    public void terbang() {
        System.out.println("Pesawat militer " + getNama() + " dengan senjata " + tipeSenjata + " sedang terbang.");
    }
}
