public class BukuMain19 {
    public static void main(String[] args) {
    Buku19 bk1 = new Buku19();
    bk1.judul = "Today Ends Tomorrow Comes";
    bk1.pengarang = "Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga = 71000;

    bk1.tampilInformasi();
    bk1.terjual(5);
    bk1.gantiHarga(60000);
    bk1.tampilInformasi();

    int jmlTerjualBk1 = 5;
    int hrgTotalBk1 = bk1.hitungHargaTotal(jmlTerjualBk1);
    double diskonBk1 = bk1.hitungDiskon(hrgTotalBk1);
    double hargaBayarBk1 = bk1.hitungHargaBayar(jmlTerjualBk1);

    System.out.println("Harga Total: " + hrgTotalBk1);
    System.out.println("Diskon: " + diskonBk1 * 100 + "%");
    System.out.println("Harga Bayar: " + hargaBayarBk1);
    System.out.println();

    Buku19 bk2 = new Buku19("Self Reward", "Maheera Ayesha", 160, 29, 59000);
    bk2.terjual(11);
    bk2.tampilInformasi();

    Buku19 bukuNecha = new Buku19("Mahika", "Aya", 516, 110000);
    bukuNecha.tampilInformasi();
    }
}