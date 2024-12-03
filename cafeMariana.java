import java.util.Scanner;
public class cafeMariana {
    
    public static void inputData(String [] hari, String [] menu, int [][] penjualan ){
        System.out.println("Masukan data ");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < menu.length; i++){
            System.out.println(menu[i]);
            for (int j = 0; j < hari.length; j++){
                System.out.print(hari[j] + ": " );
                penjualan[i][j] = input.nextInt();
            }
            System.out.println();
        }

    }
    
    static void cetakData(String [] hari, String [] menu, int [][] penjualan ){
        System.out.println("Data Penjualan");

        for(int i = 0; i < menu.length; i++){
            System.out.println(menu[i]);
            for (int j = 0; j < hari.length; j++){
                System.out.print(hari[j] + " " + penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }
    


    public static void tertinggi(String [] hari, String [] menu, int [][] penjualan){
        int max = 0;
        String menuMax = "";

        for(int i = 0; i < menu.length; i++){
            int total = 0;
            for (int j = 0; j < hari.length; j++){
                total += penjualan[i][j];
            }
            if (total >= max) {
                max = total ;
                menuMax = menu[i];
            }
            
        }   
        System.out.println("Menu tertinggi : " + menuMax);
        System.out.println("Dengan total penjualan : " + max);

    }

    public static void Rata(String [] hari, String [] menu, int [][] penjualan){
        
        for(int i = 0; i < menu.length; i++){
            int total = 0;
            for (int j = 0; j < hari.length; j++){
                total += penjualan[i][j];
                
            }
            double rata = total / hari.length;
            System.out.println("rata-ratanya adalah " + menu[i] + ": " + rata);
        }
    }


    public static void main(String[] args) {

        String [] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        String [] menu = {"Kopi", "Teh", "Es Degan", "Roti bakar", "Gorengan"};
        
        int [][] penjualan = new int[menu.length][hari.length];

       inputData(hari, menu, penjualan);
       cetakData(hari, menu, penjualan);
       tertinggi(hari, menu, penjualan);
       Rata(hari, menu, penjualan);
    }
     

}
