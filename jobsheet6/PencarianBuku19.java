/**
 * PencarianBuku19
 */
public class PencarianBuku19 {
    Buku19 listBk[] = new Buku19[5];
    int idx;
    
    void tambah(Buku19 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku19 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public void tampilData(int x, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku    : " + x);
            System.out.println("Judul        : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang    : " + listBk[pos].pengarang);
            System.out.println("Stock        : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public int FindSeqSearch(int cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                return j;
            }
        }
        return -1;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}