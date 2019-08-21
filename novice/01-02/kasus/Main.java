public class Main {
    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar mBangunDatar = new BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        Persegi mPersegi = new Persegi();
        mPersegi.sisi = 2;

        // membuat objek lingkaran dan mengisi nilai properti
        Lingkaran mLingkaran = new Lingkaran();
        mLingkaran.r = 22;

        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang mPersegiPanjang = new PersegiPanjang();
        mPersegiPanjang.panjang = 8;
        mPersegiPanjang.lebar = 4;

        // membuat objek segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;

        // memanggil method luas dan keliling
        mBangunDatar.luas();
        mBangunDatar.keliling();

        mPersegi.luas();
        mPersegi.keliling();

        mLingkaran.luas();
        mLingkaran.keliling();

        mPersegiPanjang.luas();
        mPersegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();
    }
}