package ch04;

public class ArrayD {
    public static void main(String[] args) {
        System.out.print("Menapilkan angka-angka kelipatan 3 = ");
        int[] nilai = {3,8,9,12,19,20,26,32,38,41,48,55,82};
        for (int x = 0; x < nilai.length; x++) {
            if (nilai[x] % 3 == 0) {
                System.out.print(nilai[x]+" ");
            }
        }
    }
}
