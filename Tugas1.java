import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;  
        int jumlahPelanggan, jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;
        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan = sc.nextInt();       
        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.println("\nPelanggan ke-" + i);           
            while (true) { 
                System.out.print("Masukkan jumlah tiket yang dibeli: ");
                jumlahTiket = sc.nextInt();
                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid! Silakan masukkan lagi.");
                    continue; 
                }
                break; 
            }           
            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;           
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }
            totalHarga = totalHarga - (totalHarga * diskon);
            System.out.println("Total harga untuk pelanggan ke-" + i + ": Rp " + (int)totalHarga);
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
        }
        System.out.println("\n=== Rekapitulasi Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + (int)totalPenjualan);
    }
}

    
    
