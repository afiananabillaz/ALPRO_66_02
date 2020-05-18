package ch05;

public class AlgoritmaKadane {
    public int KandaneMaksimal(int[] nilai) {
        int besar = 0;
        int maksimal = 0;
        for (int x = 0; x < nilai.length; x++) {
            besar = besar + nilai[x];
            if (besar < 0) {
                besar = 0;
            }
            if (besar > maksimal) {
                maksimal = besar;
            }
        }
        return besar;
    }
    public int KandaneMaksimalNegatif(int[] nilai) {
        int besar = nilai[0];
        int maksimal = nilai[0];
        for (int x = 1; x < nilai.length; x++) {
            besar = Math.max(nilai[x], besar + nilai[x]);
            maksimal = Math.max(maksimal, besar);
        }
        return maksimal;
    }
    public static void main(String args[]) {
        System.out.println("Algoritma Kadane");
        System.out.println("================");
        int ArrayPositif[] = {2,4,1,6};
        AlgoritmaKadane nilakmaksimum = new AlgoritmaKadane();
        System.out.println("Nilai array maksimal dari array positif = " + nilakmaksimum.KandaneMaksimal(ArrayPositif));
        int ArrayNegatif[] = {-10,-5,-18,-20,-22};
        System.out.println("Nilai array maksimal dari array negatif = " + nilakmaksimum.KandaneMaksimalNegatif(ArrayNegatif));
    }
}
