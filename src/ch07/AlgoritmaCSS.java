package ch07;

public class AlgoritmaCSS {
    static int urutan_baru;
    static void CSS(int nilai[], int y){
        boolean tukar = true;
        int x;
        int mulai = 0;
        int akhir = y-1;
        while(tukar){
            tukar = false;
            for (x = 0; x < akhir; ++x){
                if (nilai[x] > nilai[x+1]){
                    urutan_baru = nilai[x];
                    nilai[x]=nilai[x+1];
                    nilai[x+1]=urutan_baru;
                    tukar = true;
                }
            }
            if (!tukar)
                break;
            tukar = false;
            for (x = akhir - 1; x >= mulai; --x){
                if (nilai[x] > nilai[x+1]){
                    urutan_baru = nilai[x];
                    nilai[x]=nilai[x+1];
                    nilai[x+1]=urutan_baru;
                    tukar = true;
                }
            }
            ++mulai;
        }
    }
    public static void main(String[] args) {
        int nilai[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Mengurutkan nilai array dengan algoritma Cocktail Shaker Sort");
        System.out.print("Nilai array sebelum di urutkan : ");
        for(int a=0; a<nilai.length; a++){
            System.out.print(nilai[a]+" ");
        }
        CSS(nilai, nilai.length);
        System.out.println();
        System.out.print("Setelah di urutkan menjadi : ");
        for (int a = 0; a < nilai.length; a++)
            System.out.print(nilai[a]+" ");
    }
}