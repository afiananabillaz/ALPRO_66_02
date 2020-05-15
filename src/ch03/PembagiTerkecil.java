package ch03;

import java.util.Scanner;

public class PembagiTerkecil {
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan = ");
        Scanner input = new Scanner(System.in);
        int angka= input.nextInt();
        int a=3;
        int terkecil;

        while (a<=angka){
            if(angka%a==0) {
                terkecil = a;
                System.out.println("Pembagi terkecil dari bilangan " + angka+ " adalah "+terkecil);
            }else{
                if(angka%a==1){
                    terkecil=a;
                    break;
                }
            }
            a++;
        }
    }
}
