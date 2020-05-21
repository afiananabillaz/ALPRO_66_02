package ch08;

public class AlgortimaBMSS {
    static int A = 100;
    static int maksimal(int x, int y) {
        return (x>y) ? x : y;
    }
    public static void BMSS(char[] string, int ukuran, int boyer[]) {
        int z;
        for (z = 0; z < A; z++)
            boyer[z] = -1;
        for (z = 0; z < ukuran; z++)
            boyer[(int) string[z]] = z;
    }
    public static void cari(char teks[], char pola[]) {
        int a = pola.length;
        int b = teks.length;
        int B[] = new int[A];
        BMSS(pola, a, B);
        int c = 0;
        while (c <= (b-a)) {
            int d = a-1;
            while (d >= 0 && pola[d] == teks[c+d])
                d--;
            if (d < 0) {
                System.out.print("\n"+"Pola ditemukan pada indeks ke-" + c);
                c = c+((c + a < b) ? a - B[teks[c + a]] : 1);
            } else
                c = c+(maksimal(1, d - B[teks[c + d]]));
        }
    }
    public static void main(String[] args) {
        System.out.println("Algoritma Boyer-Moore String Search");
        System.out.println("===================================");
        char teks[] = "AFIANA NABILLA ZULFA".toCharArray();
        System.out.print("Teks = ");
        System.out.print(teks);
        char pola[] = "ANA".toCharArray();
        System.out.print("\n"+"Pola = ");
        System.out.print(pola);
        cari(teks, pola);
    }
}
