import java.util.Scanner;

/**
 * tugasjoobsheet9n02
 */
public class tugasjoobsheet9n02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine();
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("- " + namaPesanan[i] + " : Rp " + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}