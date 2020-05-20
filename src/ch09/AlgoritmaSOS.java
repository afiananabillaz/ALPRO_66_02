package ch09;

import java.util.Arrays;
import java.util.Scanner;

public class AlgoritmaSOS {
    public static int SOS(int x) {
        int A = (x-2)/2;
        boolean BilanganPrima[] = new boolean[A+1];
        Arrays.fill(BilanganPrima, false);
        for (int y = 1; y <= A; y++)
            for (int z = y; (y+z+2*z*y) <= A; z++)
                BilanganPrima[y+z+2*z*y] = true;
        if (x > 2)
            System.out.print(2 + " ");
        for (int a = 1; a <= A; a++)
            if (BilanganPrima[a] == false)
                System.out.print(2*a+1+ " ");
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Algoritma Sieve of Sundaram");
        System.out.println("===========================");
        System.out.print("Input batas = ");
        Scanner input = new Scanner(System.in);
        int batas = input.nextInt();
        SOS(batas);
        System.out.print("adalah bilangan prima yang kecil dari "+batas);
    }
}
