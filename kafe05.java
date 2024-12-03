    import java.util.Scanner;
    public class kafe05 {
        public static void Menu(String namaPelanggan, boolean isMember) {
            System.out.println("Selamat datang, " + namaPelanggan + "!");

            if (isMember) {
                System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
            }

            System.out.println("==== MENU RESTO KAFE ====");
            System.out.println("1. Kopi Hitam - Rp 15,000");
            System.out.println("2. Cappuccino - Rp 20,000");
            System.out.println("3. Latte - Rp 22,000");
            System.out.println("4. Teh Tarik - Rp 12,000");
            System.out.println("5. Roti Bakar - Rp 10,000");
            System.out.println("6. Mie Goreng - Rp 18,000");
            System.out.println("===========================");
            System.out.println("Silahkan pilih menu yang anda inginkan");
        }

        public static void daftarPengunjung(String...namaPengunjung) {
            System.out.println("Daftar Nama Pengunjung:");
            for (String nama : namaPengunjung) {
                System.out.println("- " + nama);
            }
        }

        public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo ) {
            int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
            double hargaTotal = hargaItems[pilihanMenu - 1 ] * banyakItem;

            
            if (kodePromo.equalsIgnoreCase("DISKON50")) {
                hargaTotal *= 0.5;
                System.out.println("Anda dapat diskon 50%");
                
            } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
                hargaTotal *= 0.7;
                System.out.println("Anda dapat diskon 30%");   
            }else {
                System.out.println("Anda tidak memiliki kode promo");
            }
            return hargaTotal;

        }

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            Menu("nino", false);

            daftarPengunjung("Ali","Budi","Citra");
            int pilihanMenu;

            double totalKeseluruhan = 0;

            while (true) {
                System.out.print("\nMasukan nomor menu yang ingin Anda pesan: ");
                pilihanMenu = input.nextInt();

                System.out.print("Masukan jumlah item yang ingin dipesan: ");
                int banyakItem = input.nextInt();

                if (banyakItem == 0 || pilihanMenu == 0) {
                    break;
                }
                System.out.print("Masukan kode promo (DISKON50/DISKON30): ");
                String kodePromo = input.next();


                totalKeseluruhan += hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            }
     
            System.out.println("Total harga untuk pesanan Anda: " + totalKeseluruhan);
        }
    }