package ch08;

public class AlgoritmaMillerRabin {
    public static int Miller(int x, int y, int z ) {
        int akhir = 1;
        x = x % z;
        while (y > 0) {
            if ((y & 1) == 1)
                akhir = (akhir * x) % z;
            y = y >> 1;
            x = (x * x) % z;
        }
        return akhir;
    }
    public static boolean TestMR(int a, int b) {
        int A = 2 + (int) (Math.random() % (b - 4));
        int x = Miller(A, a, b);
        if (x == 1 || x == b - 1)
            return true;
        while (a != b - 1) {
            x = (x * x) % b;
            a = a*2;
            if (x == 1)
                return false;
            if (x == b - 1)
                return true;
        }
        return false;
    }
    public static boolean BilanganPrima(int c, int d) {
        if (c <= 1 || c == 4)
            return false;
        if (c <= 3)
            return true;
        int e = c - 1;
        while (e % 2 == 0)
            e = e/2;
        for (int i = 0; i < d; i++)
            if (!TestMR(e, c))
                return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Algoritma Miller-Rabin");
        System.out.println("======================");
        System.out.print("Bilangan prima yang kecil dari 10 = ");
        int d = 4;
        for (int f = 1; f < 10; f++)
            if (BilanganPrima(f, d))
                System.out.print(f + " ");
    }
}