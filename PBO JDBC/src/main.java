
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
        //update username dan password
        Scanner scanner = new Scanner(System.in);
        UpdateEmployee.updateEmployeeCredentials(scanner);
        System.out.println("");

        //membuat data pegawai baru
        CreateNewEmployee.insertEmployeeData();
        
        //hapus pegawai
        DeleteEmployee.deleteEmployeeById();
        System.out.println("");
        
        //login employee
        Captcha login = new Captcha();

        //faktur pembelian
        Pelanggan customer = new Pelanggan("", "", " ", " ");
        customer.displaySupermarketInfo();
        System.out.println("-----PELANGGAN-----");
        customer.inputCustomerData();

        pembayaran purchase = new pembayaran("", "");
        System.out.println("- PEMBELIAN -");
        purchase.inputPurchaseData();
        purchase.displayPurchaseData();

        
    }
}