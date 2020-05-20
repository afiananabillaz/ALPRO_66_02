package ch09;

import java.util.Scanner;

public class AlgoritmaSOA {
    public static int SOA(int batas) {
        if (batas > 2)
            System.out.print(2 + " ");
        if (batas > 3)
            System.out.print(3 + " ");
        boolean BilanganPrima[] = new boolean[batas];
        for (int x = 0; x < batas; x++)
            BilanganPrima[x] = false;
        for (int y = 1; y*y < batas; y++) {
            for (int z = 1; z*z < batas; z++) {
                int i = (4*y*y) + (z*z);
                if (i <= batas && (i % 12 == 1||i % 12 == 5))
                    BilanganPrima[i] ^= true;
                i = (3*y*y) + (z*z);
                if (i <= batas && i % 12 == 7)
                    BilanganPrima[i] ^= true;
                i = (3*y*y) - (z*z);
                if (y > z && i <= batas && i % 12 == 11)
                    BilanganPrima[i] ^= true;
            }
        }
        for (int j = 5; j*j<batas; j++) {
            if (BilanganPrima[j]) {
                for (int i = j*j; i<batas;
                     i = i+j*j)
                    BilanganPrima[i] = false;
            }
        }
        for (int k = 5; k < batas; k++)
            if (BilanganPrima[k])
                System.out.print(k + " ");
            return 0;
    }
    public static void main(String[] args) {
        System.out.println("Algoritma Sieve of Atkin");
        System.out.println("========================");
        System.out.print("Input batas = ");
        Scanner input = new Scanner(System.in);
        int batas = input.nextInt();
        SOA(batas);
        System.out.print("adalah bilangan prima yang kecil dari "+batas);
    }
}
