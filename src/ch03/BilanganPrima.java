package ch03;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int angka = input.nextInt();
        int cek = 0;

        for (int i = 2; i <= angka; i++) {
            if (angka%i == 0) {
                cek++;
            }
        }
        if (cek == 1) {
            System.out.print("Bilangan prima");
        } else {
            System.out.print("Bukan bilangan prima");
        }
    }
}
