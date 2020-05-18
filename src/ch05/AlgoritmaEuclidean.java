package ch05;

import java.util.Scanner;

public class AlgoritmaEuclidean {
    public static void main(String[] args) {
        System.out.println("Algoritma Euclidean Menampilkan FBB");
        Scanner input = new Scanner(System.in);
        System.out.print("Input nilai x = ");
        int x = input.nextInt();
        System.out.print("Input nilai y = ");
        int y = input.nextInt();
        int z;
        int A = x;
        int B = y;

        z = x % y;
        while (z != 0) {
            x = y;
            y = z;
            z = x % y;
        }
        System.out.println("FBB dari "+A+ " dan " +B+" = "+y);
    }
}
