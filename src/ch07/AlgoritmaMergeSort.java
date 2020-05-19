package ch07;

public class AlgoritmaMergeSort {
    void Merge(int nilai[], int awal, int tengah, int akhir) {
        int x = tengah - awal + 1;
        int y = akhir - tengah;
        int Array1[] = new int [x];
        int Array2[] = new int [y];
        for (int a=0; a<x; ++a)
            Array1[a] = nilai[awal + a];
        for (int b=0; b<y; ++b)
            Array2[b] = nilai[tengah + 1+ b];
        int m=0;
        int n=0;
        int k = awal;
        while (m<x && n<y){
            if (Array1[m] <= Array2[n]) {
                nilai[k] = Array1[m];
                m++;
            } else {
                nilai[k] = Array2[n];
                n++;
            }
            k++;
        }
        while (x>m) {
            nilai[k] = Array1[m];
            m++;
            k++;
        }
        while (y>n) {
            nilai[k] = Array2[n];
            n++;
            k++;
        }
    }
    void Merge(int nilai[], int awal, int akhir) {
        if (akhir>awal) {
            int tengah= (awal+akhir)/2;
            Merge(nilai, awal, tengah);
            Merge(nilai , tengah+1, akhir);
            Merge(nilai, awal, tengah, akhir);
        }
    }
    public static void main(String args[]) {
        int nilai[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Mengurutkan nilai array dengan algoritma Merge Sort");
        System.out.print("Nilai array sebelum di urutkan : ");
        for(int a=0; a<nilai.length; a++){
            System.out.print(nilai[a]+" ");
        }
        AlgoritmaMergeSort obj = new AlgoritmaMergeSort();
        obj.Merge(nilai, 0, nilai.length-1);
        System.out.println();
        System.out.print("Setelah di urutkan menjadi : ");
        for(int a =0; a<nilai.length;a++) {
            System.out.print(nilai[a]+" ");
        }
    }
}
