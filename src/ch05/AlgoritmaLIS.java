package ch05;

public class AlgoritmaLIS {
    public static int LIS(int nilai[], int x) {
        int LIS[] = new int[x];
        int y, z, maksimal = 0;
        for (y = 0; y < x; y++)
            LIS[y] = 1;
        for (y = 1; y < x; y++)
            for (z = 0; z < y; z++)
                if (nilai[y] > nilai[z] && LIS[y] < LIS[z] + 1)
                    LIS[y] = LIS[z] + 1;
        for (y = 0; y < x; y++)
            if (maksimal < LIS[y])
                maksimal = LIS[y];
        return maksimal;
    }
    public static void main(String[] args) {
        System.out.println("Algoritma Longest Increasing Subsequence");
        System.out.println("========================================");
        int nilai[] = {20,8,15,45,40};
        for (int y = 0; y < nilai.length; y++) {
        }
        int y = nilai.length;
        System.out.print("Longest Increasing Subsequence = " + LIS(nilai, y));
    }
}