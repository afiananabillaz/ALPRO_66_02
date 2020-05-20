package ch09;

import java.util.Scanner;

public class AlgoritmaAKSPrimalityTest {
    public static long x[] = new long[10000];
    public static void koefisien(int n) {
        x[0] = 1;
        for (int y = 0; y < n; x[0] = -x[0], y++) {
            x[1 + y] = 1;
            for (int z = y; z > 0; z--)
                x[z] = x[z - 1] - x[z];
        }
    }
    static boolean BilanganPrima(int a) {
        koefisien(a);
        x[0]++;
        x[a]--;
        int b = a;
        while ((b--) > 0 && x[b] % a == 0) ;
        return b < 0;
    }
    public static void main(String[] args) {
        System.out.println("Algoritma AKS Primality Test");
        System.out.println("============================");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int angka = input.nextInt();
        if (BilanganPrima(angka))
            System.out.print(angka + " adalah bilangan prima");
        else
            System.out.print(angka + " bukan bilangan prima");
    }
}

