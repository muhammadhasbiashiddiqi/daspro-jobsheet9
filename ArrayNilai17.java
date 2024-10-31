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
            for (int i = 0; i < nilaiakhir.length; i++) {
                if (nilaiakhir[i]>70) {
                    System.out.println("mahasiswa ke-"+ i +" lulus");
                }
                else{
                    System.out.println("mahasiswa ke-"+ i +" tidak lulus");
                }
            
        }
    }
}