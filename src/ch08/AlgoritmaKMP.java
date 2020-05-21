package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgoritmaKMP {
    private int[] A;
    private int op_angka = 0;
    public AlgoritmaKMP(String teks, String bentuk) {
        A = new int[bentuk.length()];
        C(bentuk);
        int B = cek(teks, bentuk);
        if (B == -1)
            System.out.println("Tidak ditemukan pola pada teks");
        else
            System.out.println("Pola ditemukan pada indeks ke-"+B);
    }
    private void C(String bentuk) {
        int y = bentuk.length();
        A[0] = -1;
        for (int x = 1; x < y; x++) {
            int z = A[x - 1];
            this.op_angka = this.op_angka+1;
            while ((bentuk.charAt(x) != bentuk.charAt(z+1)) && z >= 0){
                z = A[z];
            }
            if (bentuk.charAt(x) == bentuk.charAt(z+1))
                A[x] = z + 1;
            else
                A[x] = -1;
        }
    }
    private int cek(String text, String bentuk) {
        int a = 0;
        int b = 0;
        int fungsi1 = text.length();
        int fungsi2 = bentuk.length();
        while (a < fungsi1 && b < fungsi2) {
            this.op_angka += 1;
            if (text.charAt(a) == bentuk.charAt(b)) {
                a++;
                b++;
            } else if (b == 0)
                a++;
            else
                b = A[b - 1] + 1;
        }
        return ((b == fungsi2) ? (a - fungsi2) : -1);
    }
    public int getOp_angka(){
        return this.op_angka;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Algoritma Knut-Morris-Pratt");
        System.out.println("===========================");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan teks = ");
        String teks = input.readLine();
        System.out.print("Masukkan pola = ");
        String pola = input.readLine();
        AlgoritmaKMP obj = new AlgoritmaKMP(teks, pola);
    }
}