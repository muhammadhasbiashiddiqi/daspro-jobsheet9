import java.util.Scanner;

/**
 * ArrayNilai17
 */
public class ArrayNilai17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiakhir = new int[10];
        for (int i= 0; i < nilaiakhir.length; i++) {
            System.out.print("masukkan nilai akhir ke- "+i+":");
            nilaiakhir[i] = sc.nextInt();
        }
            for (int i = 0; i < 10; i++) {
                System.out.println("nilai akhir ke- " +i+" adalah "+nilaiakhir[i]);
            
        }
    }
}