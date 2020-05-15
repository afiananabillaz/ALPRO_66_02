package ch04;


import java.util.Scanner;

public class ArrayB {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Mencari sebuah angka di dalam array");
        System.out.print("Masukkan angka = ");
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        for (int x = 0; x < nilai.length; x++) {
            if (nilai[x] == angka) {
                System.out.println("Angka " + angka + " berada di indeks " + x);
            }
        }
    }
}
