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

    public void tampilData(String x, int pos) {
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

    public int FindSeqSearch(String cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                return j;
            }
        }
        return -1;
    }

    public void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public Buku19 FindBuku(String cari) {
        for (Buku19 buku : listBk) {
            if (buku.kodeBuku.equals(cari)) {
                return buku;
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) /2;
            if (listBk[mid].kodeBuku.equals(cari)) {
                return mid;
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return FindBinarySearch(cari, mid + 1, right);
            } else {
                return FindBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }
}
