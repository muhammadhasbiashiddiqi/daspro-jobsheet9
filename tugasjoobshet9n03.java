import java.util.Scanner;

/**
 * tugasjoobshet9n03
 */
public class tugasjoobshet9n03 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Makanan '" + makananDicari + "' tersedia di menu.");
        } else {
            System.out.println("Makanan '" + makananDicari + "' tidak ada di menu.");
        }
    }
}