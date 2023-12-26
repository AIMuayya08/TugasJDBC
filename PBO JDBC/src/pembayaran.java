import java.util.InputMismatchException;
import java.util.Scanner;

class pembayaran extends swalayan implements Datapembayaran {
    String productCode;
    String productName;
    double productPrice;
    int quantity;
    double totalPayment;
    boolean input = true;


    pembayaran(String marketName, String cashier) {
        super(marketName, cashier);
    }

    @Override
    public void inputPurchaseData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kode Barang   : ");
        productCode = scanner.nextLine();
        System.out.print("Nama Barang   : ");
        productName = scanner.nextLine();
        
        do {
            try {
                System.out.print("Harga Barang  : ");
                productPrice = scanner.nextDouble();
                input = false;
            } catch (InputMismatchException e) {
                System.out.println("bukanlah angka, coba lagi");
                scanner.next();
            }
        } while (input);


        System.out.print("Jumlah Beli   : ");
        quantity = scanner.nextInt();

        
        totalPayment = productPrice * quantity;
        scanner.close();
    }

    @Override
    public void displayPurchaseData() {
        System.out.println("_____________________________");
        System.out.println("TOTAL BAYAR   : " + totalPayment);
        
    }
    
}