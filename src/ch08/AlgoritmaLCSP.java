package ch08;

import java.util.Scanner;

public class AlgoritmaLCSP {
    public static void main(String[] args) {
        System.out.println("Algoritma Longest Common Substring Problem");
        System.out.println("==========================================");
        Scanner input = new Scanner(System.in);
        System.out.print("Input String x = ");
        String x = input.nextLine();
        AlgoritmaLCSP lcspMain = new AlgoritmaLCSP();
        System.out.print("Input Stirng y = ");
        String y = input.nextLine();
        System.out.print("Longest Common Substring Probelm tersebut = " + lcspMain.getLongestCommonSubstringProblem(x,y));
    }
    public String getLongestCommonSubstringProblem(String x, String y) {
        int a = x.length();
        int b = y.length();
        int maksimal = 0;
        int[][] hasil = new int[a][b];
        int akhir = -1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (x.charAt(i) == y.charAt(j)) {
                    if (i == 0 || j == 0) {
                        hasil[i][j] = 1;
                    } else {
                        hasil[i][j] = hasil[i-1][j-1] + 1;
                    }
                    if (maksimal < hasil[i][j]) {
                        maksimal = hasil[i][j];
                        akhir = i;
                    }
                }
            }
        }
        return x.substring(akhir-maksimal+1, akhir+1);
    }
}