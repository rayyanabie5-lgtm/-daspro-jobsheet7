import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("\nMasukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;  
                } else if (jenis == 1) {
                    total += durasi * 3000;  
                } else if (jenis == 2) {
                    total += durasi * 2000;  
                }
            } else if (jenis != 0) {
                System.out.println("Input tidak valid! Masukkan 1, 2, atau 0 untuk keluar.");
            }

        } while (jenis != 0);

        System.out.println("\nTotal pembayaran parkir hari ini: Rp " + total);
    }
    
}
