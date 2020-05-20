package ch07;

public class AlgoritmaBlockSort {
    public static void main(String[]args){
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Mengurutkan nilai array dengan algoritma Block Sort");
        System.out.print("Nilai array sebelum di urutkan : ");
        for(int a=0; a<nilai.length; a++) {
            System.out.print(nilai[a] + " ");
        }
        int urutan_baru = 0;
        for(int x = 0; x < nilai.length; x++){
            for(int y = 0; y < nilai.length; y++){
                if (nilai[x]<nilai[y]){
                    urutan_baru = nilai[x];
                    nilai[x] = nilai[y];
                    nilai[y] = urutan_baru;
                }
            }
        }
        System.out.println();
        System.out.print("Setelah diurutkan menjadi : ");
        for(int a = 0; a < nilai.length; a++){
            System.out.print(nilai[a]+" ");
        }
    }
}