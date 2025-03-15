import java.util.Scanner;

/* Program untuk menjumlahkan nilai yang dibaca dengan iterasi.
   Mengakhiri input dengan 999 dan mencetak hasil penjumlahan */
public class PrintXinterasi {
    /**
     * Program ini membaca nilai integer x secara berulang, menjumlahkan nilai-nilai 
     * yang dibaca, dan mengakhiri input dengan 999.
     */
    public static void main(String[] args) {
        // Kamus:
        int sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in); // Membaca input dari pengguna

        // Program
        System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
        x = masukan.nextInt();  // Membaca nilai pertama

        if (x == 999) {
            System.out.println("Kasus kosong");  // Jika tidak ada nilai yang dimasukkan selain 999
        } else {
            // Minimal ada satu data yang dijumlahkan
            sum = x;  // Inisialisasi sum dengan nilai pertama
            while (true) {
                System.out.print("Masukkan nilai x (int), akhiri dg 999: ");
                x = masukan.nextInt();  // Membaca nilai berikutnya

                if (x == 999) {
                    break;  // Jika 999 dimasukkan, keluar dari loop
                } else {
                    sum = sum + x;  // Menjumlahkan nilai x
                }
            }
            System.out.println("Hasil penjumlahan = " + sum);
        }

        masukan.close();  // Menutup scanner untuk menghindari kebocoran memori
    }
}
