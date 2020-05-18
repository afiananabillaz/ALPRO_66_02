package ch05;

public class AlgoritmaLCS {
    public static void main(String[] args) {
        System.out.println("Algoritma Longest Common Subsequence");
        System.out.println("====================================");
        String x = "AFIANA";
        String y = "NABILLA";
        int A = x.length();
        int B = y.length();

        int[][] tmp = new int[A + 1][B + 1];

        for (int a = 1; a <= A; a++) {
            for (int b = 1; b <= B; b++){
                if (x.charAt(a - 1) == y.charAt(b - 1)) {
                    tmp[a][b] = tmp[a - 1][b - 1] + 1;
                }else {
                    tmp[a][b] = Math.max(tmp[a][b - 1], tmp[a - 1][b]);
                }
            }
        }
        System.out.print("Longest Common Subsequence tersebut = "+tmp[A][B]);
    }
}