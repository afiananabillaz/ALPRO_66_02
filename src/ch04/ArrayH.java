package ch04;

public class ArrayH {
    public static void jumlah(int[] data) {
        System.out.println("Menampilkan jumlah angka pada array");
        int jumlah=0;
        for(int i=0; i<data.length; i++){
            jumlah += data[i];
        }
        System.out.println("Jumlah angka= "+jumlah);
        }

    public static void main(String[] args) {
        int x[]={82,12,41,38,19,26,9,48,20,55,8,32,3};
        jumlah(x);
    }
    }
