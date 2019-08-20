import java.util.Scanner;

public class MultidimensiInput {
    public static void main(String[] args) {
        int jumlahBaris, jumlahKolom;
        Scanner scanner = new Scanner(System.in);

        // meminta input jumlah baris dan jumlah kolom
        System.out.print("Masukkan Jumlah Index Baris : ");
        jumlahBaris = scanner.nextInt();
        System.out.print("Masukkan Jumlah Index Kolom : ");
        jumlahKolom = scanner.nextInt();

        // deklarasi matriks
        Integer[][] array = new Integer[jumlahBaris][jumlahKolom];

        // meminta input isi matriks untuk setiap baris dan kolom
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Masukkan isi indeks baris ke " + i + " kolom ke " + j + " : " );
                array[i][j] = scanner.nextInt();
            }
        }
 
        //untuk mengeluarkan detail isi matriks pada baris dan kolom
        System.out.println();
        System.out.println("berikut adalah isi array yang tadi dimasukkan:");
        for (int i = 0; i < jumlahBaris; i++) { 
            for (int j = 0; j < jumlahKolom; j++){
                System.out.println("isi indeks baris ke " + i + " kolom ke " + j + " adalah : " + array[i][j]);
            }
        }

        System.out.println();
        System.out.println("Bentuk matriks : ");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom;  j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

    }
}