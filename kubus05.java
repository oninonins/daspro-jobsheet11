public class kubus05 {
    
    static int hitungVol(int sisi) {
        int vol = sisi*sisi*sisi;
        return vol;
    }

    static int hitungLuas(int sisi) {
        int luas = 6*sisi*sisi;
        return luas;
    }

    public static void main(String[] args) {
        int sisi = 5;

        System.out.println("Luas kubus : " + hitungLuas(sisi));
        System.out.println("Volume kubus : " + hitungVol(sisi));
    }
}
