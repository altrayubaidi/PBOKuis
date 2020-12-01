package seleksi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        menu();
    }
    static void menu(){
    Scanner scan = new Scanner(System.in);
        System.out.println("FORM PENDAFTARAN IT STARTUP");
        System.out.println("===========================");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih jenis form    : ");
        int pilihan = scan.nextInt();
        switch (pilihan){
            case 1:
                android();
                break;
            case 2:
                web();
                break;
            default:
                System.exit(0);
                break;
        }
    }

    static void android(){
       Scanner scan = new Scanner(System.in);
       System.out.print("Masukkan NIK        : ");
       String nik = scan.next();
       scan = new Scanner(System.in);
       System.out.print("Masukkan Nama       : ");
       String nama = scan.nextLine();
       System.out.print("Nilai Tes Tulis     : ");
       int testulis = scan.nextInt();
       System.out.print("Nilai Tes Coding    : ");
       int tescoding = scan.nextInt();
       System.out.print("Nilai Tes Wawancara : ");
       int teswawancara = scan.nextInt();
       
       int choose;
        do {
            android andro = new android(nik, nama, testulis, tescoding, teswawancara);
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            choose = scan.nextInt();
            
            switch(choose){
                case 1:
                    scan = new Scanner(System.in);
                    System.out.println("");
                    System.out.println("FORM EDIT");
                    System.out.print("Input Nilai Tes Tulis     : ");
                    testulis = scan.nextInt();
                    System.out.print("Input Nilai Tes Coding    : ");
                    tescoding = scan.nextInt();
                    System.out.print("Input Nilai Tes Wawancara : ");
                    teswawancara = scan.nextInt();
                    break;
                case 2:
                    andro.tampil();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (choose != 3);
    }
    
    static void web(){
       Scanner scan = new Scanner(System.in);
       System.out.print("Masukkan NIK        : ");
       String nik = scan.next();
       scan = new Scanner(System.in);
       System.out.print("Masukkan Nama       : ");
       String nama = scan.nextLine();
       System.out.print("Nilai Tes Tulis     : ");
       int testulis = scan.nextInt();
       System.out.print("Nilai Tes Coding    : ");
       int tescoding = scan.nextInt();
       System.out.print("Nilai Tes Wawancara : ");
       int teswawancara = scan.nextInt();
       
       int choose;
        do {
            web site = new web(nik, nama, testulis, tescoding, teswawancara);
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            choose = scan.nextInt();
            
            switch(choose){
                case 1:
                    scan = new Scanner(System.in);
                    System.out.println("FORM EDIT");
                    System.out.print("Input Nilai Tes Tulis     : ");
                    testulis = scan.nextInt();
                    System.out.print("Input Nilai Tes Coding    : ");
                    tescoding = scan.nextInt();
                    System.out.print("Input Nilai Tes Wawancara : ");
                    teswawancara = scan.nextInt();
                    break;
                case 2:
                    site.tampil();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (choose != 3);
    }
}
