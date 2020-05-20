package ch09;

import java.util.Scanner;

public class AlgoritmaSOE {
    public void SOE(int n) {
        boolean BilanganPrima[] = new boolean[n+1];
        for(int x=0; x<n; x++)
            BilanganPrima[x] = true;
        for(int y = 2; y*y <=n; y++) {
            if(BilanganPrima[y] == true) {
                for(int z = y*2; z <= n; z=z+y)
                    BilanganPrima[z] = false;
            }
        }
        for(int a = 2; a <= n; a++) {
            if(BilanganPrima[a] == true)
                System.out.print(a + " ");
        }
    }
    public static void main(String args[]) {
        System.out.println("Algoritma Sieve of Eratosthenes");
        System.out.println("===============================");
        System.out.print("Input batas = ");
        Scanner input = new Scanner(System.in);
        int batas = input.nextInt();
        System.out.print("Bilangan prima yang kecil dari "+batas+" = ");
        AlgoritmaSOE obj = new AlgoritmaSOE();
        obj.SOE(batas);
    }
}