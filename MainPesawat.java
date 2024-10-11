public class MainPesawat {
    public static void main(String[] args) {
        // Inisiasi objek dari kelas-kelas anak
        PesawatKomersial komersial = new PesawatKomersial("Boeing 747", 400, "Garuda Indonesia");
        PesawatMiliter militer = new PesawatMiliter("F-16", 2, "Rudal");
        PesawatKargo kargo = new PesawatKargo("C-130 Hercules", 5, 20.5);

        // Polimorfisme: Semua objek dianggap sebagai Pesawat
        Pesawat pesawat1 = komersial;
        Pesawat pesawat2 = militer;
        Pesawat pesawat3 = kargo;

        // Menggunakan method overriding
        pesawat1.terbang();  // Output: Pesawat komersial Boeing 747 dari maskapai Garuda Indonesia sedang terbang.
        pesawat2.terbang();  // Output: Pesawat militer F-16 dengan senjata Rudal sedang terbang.
        pesawat3.terbang();  // Output: Pesawat kargo C-130 Hercules dengan kapasitas kargo 20.5 ton sedang terbang.

        // Inisiasi dan penggunaan kelas Pilot
        Pilot pilot1 = new Pilot("John", 1000);
        pilot1.infoPilot();  // Output: Nama Pilot: John, Jam Terbang: 1000
    }
}
