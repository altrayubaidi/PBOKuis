package seleksi;

public class android implements seleksi {
    String nik;
    String nama;
    int testulis;
    int tescoding;
    int teswawancara;

    public android(String nik, String nama, int testulis, int tescoding, int teswawancara) {
        this.nik = nik;
        this.nama = nama;
        this.testulis = testulis;
        this.tescoding = tescoding;
        this.teswawancara = teswawancara;
    }
    
    @Override
        public double nilaiAkhir(){
        return ((testulis*0.2)+(tescoding*0.5)+(teswawancara*0.3));
    }
    
    void tampil(){
        System.out.println("Nilai Akhir anda : " + nilaiAkhir());
        if (nilaiAkhir() >= 85 ) {
            System.out.println("Selamat kepada "+ nama + " , anda telah diterima di posisi Android Developer!");
        }
        else{
            System.out.println("Mohon maaf kepada "+ nama + ". Anda tidak diterima di posisi Android Developer");
        }
    }
}

