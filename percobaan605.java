import java.util.Scanner;
public class percobaan605 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukan panjang");
        p = input.nextInt();
        System.out.println("Masukan lebar");
        l = input.nextInt();
        System.out.println("Masukan tinggi");
        t = input.nextInt();

        hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah"+hitungLuas(p, l));


       hitungVolume(p, l, t);
        System.out.println("Volume balok adalah"+hitungVolume(t, l, p));
    }

    //fungsi hitung luas
    static int hitungLuas (int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }

    //fungsi hitung volume
    static int hitungVolume (int tinggi, int a, int b){
        int volume= hitungLuas(a, b)*tinggi;
        return volume;
    }

    

}
