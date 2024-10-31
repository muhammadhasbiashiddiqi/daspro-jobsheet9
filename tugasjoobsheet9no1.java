import java.util.Scanner;

/**
 * tugasjoobsheet9n01
 */
public class tugasjoobsheet9no1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahNilai = sc.nextInt();
        int[] nilaiMahasiswa = new int[jumlahNilai];
        int total = 0;
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
            total += nilaiMahasiswa[i];
        }
        double rataRata = (double) total / jumlahNilai;
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }
        System.out.println("\nNilai Mahasiswa yang telah dimasukkan:");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        System.out.println("\nRata-rata nilai = " + rataRata);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah = " + nilaiTerendah);
    }
}
