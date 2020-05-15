package ch04;

public class ArrayF {
    public static void main(String[] args) {
        System.out.print("Menampilkan ngka-angka ganjil yang diapit oleh angka genap = ");
        int[] nilai = {3, 8, 9, 12, 19, 20, 26, 32, 38, 41, 48, 55, 82};
        for(int x=0; x<nilai.length; x++){
            if(nilai[x]%2!=0){
                for(int y = x+1; y<nilai.length; y++)
                    if(nilai[y]%2==0){
                    }
                System.out.print(nilai[x]+" ");
                }
            }
        }
    }