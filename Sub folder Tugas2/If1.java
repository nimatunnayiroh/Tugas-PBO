import java.util.Scanner;

public class If1 {
    /**
     * Program untuk memeriksa apakah nilai integer yang dimasukkan positif atau negatif.
     * Jika nilai positif, program akan mencetak nilai tersebut.
     */
    public static void main(String[] args) {
        // Kamus 
        Scanner masukan = new Scanner(System.in);  // Membaca input dari pengguna
        int a;

        try {
            // Program
            System.out.print("Contoh IF satu kasus \n");
            System.out.print("Ketikkan suatu nilai integer: ");
            a = masukan.nextInt();  // Membaca input integer dari pengguna

            if (a >= 0) {
                // Jika nilai a positif atau nol
                System.out.println("\nNilai a positif: " + a);
            }
        } catch (Exception e) {
            // Menangani jika input yang dimasukkan bukan integer
            System.out.println("Input tidak valid. Harap masukkan nilai integer.");
        } finally {
            // Menutup scanner untuk menghindari memory leak
            masukan.close();
        }
    }
}
