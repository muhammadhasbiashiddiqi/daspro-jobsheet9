import java.util.Scanner;

/**
 * ArrayRataNilai17
 */
public class ArrayRataNilai17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaimhs = new int[10];
        double total = 0;
        double rata2;
        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.print("mskkan nilai mahasiswa ke- " + (i +1) + " : ");
            nilaimhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaimhs.length; i++) {
            total += nilaimhs[i];
            
        }
        rata2 = total/nilaimhs.length;
        System.out.println("rata rta nilai = "+rata2);
    }
}