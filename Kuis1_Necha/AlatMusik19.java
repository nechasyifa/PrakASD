public class AlatMusik19 {
    String nama;
    String merk;
    String kategori;
    int stok;
    int jumlahterjual;

    public AlatMusik19() {

    }

    public AlatMusik19(String nama, String merk, String kategori, int stok, int jumlah) {
        this.nama = nama;
        this.merk = merk;
        this.kategori = kategori;
        this.stok = stok;
        this.jumlahterjual = jumlah;
    }
    
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Merk: " + merk);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Jumlah Terjual: " + jumlahterjual);
        System.out.println();
    }

    public int hitungSisa() {
        return stok - jumlahterjual;
    }
}


