package ch04;

public class ArrayK {
    public static void main(String[] args) {
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Menampilkan angka-angka yang setelahnya bernilai lebih besar");
        for (int x = 0; x < nilai.length; x++) {
            if (x < nilai.length - 1) {
                    if (nilai[x+1] > nilai[x]) {
                        System.out.print("Angka " +nilai[x]+" kecil dari "+nilai[x+1]);
                        System.out.println();
                    }
                }
            }
        }
    }
