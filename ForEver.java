public class ForEver {
    /**
     * Program ini akan mencetak baris secara terus-menerus.
     * Untuk menghentikan program, tekan ^C (Ctrl + C).
     */
    public static void main(String[] args) {
        // Menampilkan pesan bahwa program akan terus berulang
        System.out.println("Program akan looping, akhiri dengan ^c");

        // Menggunakan loop dengan kondisi yang dapat dihentikan
        int counter = 1; // Menambahkan counter untuk menunjukkan jumlah iterasi

        // Menjalankan loop dengan batas waktu untuk menghindari infinite loop yang terlalu lama
        while (true) {
            System.out.println("Print satu baris ke-" + counter);
            counter++;

            // Misalnya, hentikan setelah 10 iterasi untuk contoh
            if (counter > 10) {
                System.out.println("Loop dihentikan setelah 10 iterasi.");
                break;  // Keluar dari loop setelah 10 kali iterasi
            }
        }
    }
}
