import java.util.Scanner;

/**
 * ArrayRataNilai17
 */
public class ArrayRataNilai17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaimhs = new int[jumlahMahasiswa];
        double total = 0;
        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaimhs[i] = sc.nextInt();
            total += nilaimhs[i];
        }
        int jumlahNilaiLulus = 0,jumlahntidaklulus = 0;
        int nilaiLulus = 0 , nilaitidaklulus = 0;
        for (int nilai : nilaimhs) {
            if (nilai >= 70) {
                jumlahNilaiLulus += nilai;
                nilaiLulus++;
            }
            else {
                jumlahntidaklulus += nilai;
                nilaitidaklulus++;
            }
        }
        double rataRataLulus = (nilaiLulus > 0) ? (double) jumlahNilaiLulus / nilaiLulus : 0;
        double rataRataTidakLulus = (nilaitidaklulus> 0) ? (double) jumlahntidaklulus/ nilaitidaklulus : 0;
        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
    }
}
