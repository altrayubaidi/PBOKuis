package seleksi;

public class web implements seleksi {
    String nik;
    String nama;
    int testulis;
    int tescoding;
    int teswawancara;

    public web(String nik, String nama, int testulis, int tescoding, int teswawancara) {
        this.nik = nik;
        this.nama = nama;
        this.testulis = testulis;
        this.tescoding = tescoding;
        this.teswawancara = teswawancara;
    }
    
    @Override
        public double nilaiAkhir(){
        return ((testulis*0.4)+(tescoding*0.35)+(teswawancara*0.25));
    }
    
    void tampil(){
        System.out.println("Nilai Akhir anda : " + nilaiAkhir());
        if (nilaiAkhir() >= 85 ) {
            System.out.println("Selamat kepada "+ nama + " , anda telah diterima di posisi Web Developer!");
        }
        else{
            System.out.println("Mohon maaf kepada "+ nama + " . Anda tidak diterima di posisi Web Developer");
        }
    }
}
