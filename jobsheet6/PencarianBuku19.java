
/**
 * PencarianBuku19
 */
import java.util.Arrays;

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
        if (pos != -1) {
            System.out.println("Kode Buku    : " + x);
            System.out.println("Judul        : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang    : " + listBk[pos].pengarang);
            System.out.println("Stock        : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
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
            if (buku.judulBuku.equalsIgnoreCase(cari)) {
                return buku;
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        sortingBuku();

        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listBk[mid].judulBuku.equalsIgnoreCase(cari)) {
                return mid;
            } else if (listBk[mid].judulBuku.compareToIgnoreCase(cari) > 0) {
                return FindBinarySearch(cari, mid + 1, right);
            } else {
                return FindBinarySearch(cari, left, mid - 1);
            }
        }
        return -1;
    }

    public void sortingBuku() {
        Arrays.sort(listBk, 0, idx, (buku1, buku2) -> buku1.judulBuku.compareToIgnoreCase(buku2.judulBuku));
    }

    public void pencarianJudulBuku(String judul) {
        sortingBuku();

        int count = 0;
        int[] posisi = new int[listBk.length];
        for (int i = 0; i < idx; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(judul)) {
                posisi[count] = i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Judul buku " + judul + " tidak ditemukan.");
        } else if (count == 1) {
            int posSeq = FindSeqSearch(judul);
            if (posSeq != -1) {
                System.out
                        .println("Judul buku " + judul + " ditemukan pada indeks " + posSeq + " (Sequential Search):");
                tampilData(judul, posSeq);
            } else {
                int posBin = FindBinarySearch(judul, 0, idx - 1);
                if (posBin != -1) {
                    System.out
                            .println("Judul buku " + judul + " ditemukan pada indeks " + posBin + " (Binary Search):");
                    tampilData(judul, posBin);
                }
            }
        } else {
            System.out.println("Peringatan! Terdapat lebih dari 1 hasil pencarian untuk judul buku " + judul);
            for (int i = 0; i < count; i++) {
                System.out.println("Hasil ke-" + (i + 1) + ":");
                tampilData(judul, posisi[i]);
            }
        }
    }
}