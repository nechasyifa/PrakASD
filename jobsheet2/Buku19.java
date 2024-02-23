public class Buku19 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        if (stok <= 0) {
            System.out.println("Maaf, Stok Buku Habis");
        } else {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jmlTerjual) {
        return harga * jmlTerjual;
    }

    double hitungDiskon(int hrgTotal) {
        if (hrgTotal > 150000) {
            return 0.12;
        } else if (hrgTotal <= 150000 || hrgTotal >= 75000) {
            return 0.05;
        } else {
            return 0.0;
        }
    }

    double hitungHargaBayar(int jmlTerjual) {
        int hrgTotal = hitungHargaTotal(jmlTerjual);
        double diskon = hitungDiskon(hrgTotal);
        return hrgTotal - (hrgTotal * diskon);
    }

    public Buku19() {

    }
    
    public Buku19(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public Buku19(String jud, String pg, int hal, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        harga = har;
    }
}
