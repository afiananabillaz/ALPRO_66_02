package ch04;

public class ArrayE {
    public static void main(String[] args) {
        int [] nilai= {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.print("Menampilkan angka-angka yang memiliki angka 2 = ");
        String tampil="2";
        for (int x = 0; x < nilai.length; x++) {
            if(String.valueOf(nilai[x]).startsWith(tampil) || String.valueOf(nilai[x]).endsWith(tampil)){
                System.out.print(nilai[x]+" ");
            }
        }
    }
}
