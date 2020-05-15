package ch03;

import java.util.Scanner;

public class NilaiTertinggi1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan nilai x= ");
        int x=input.nextInt();
        System.out.print("Masukkan nilai y= ");
        int y=input.nextInt();
        if (x<y){
            System.out.println("Nilai tertinggi adalah y= " +y);
        }else{
            System.out.println("Nilai tertinggi adalah x= "+x);
        }

    }
}
