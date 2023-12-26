import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


abstract class swalayan {
    private String Namaswalayan;
    private String cashier;
    private Scanner scan = new Scanner(System.in);

    swalayan(String name, String cashier) {
        this.Namaswalayan = name;
        this.cashier = cashier;
    }

    void displaySupermarketInfo() {
        System.out.println("------- SWALAYAN -------");
        System.out.println("========================");
            Date tglSekarang = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MM yyyy");
            String tglFormat = sdf.format(tglSekarang);
        System.out.println("Tanggal     : "+tglFormat);
            Date waktu = new Date();
            SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
            String waktuFormat = sdf2.format(waktu);
        System.out.println("Waktu       : "+waktuFormat);
        
        System.out.print("Kasir       : ");
        cashier = scan.nextLine();
        System.out.println("_______________________");
    }
}