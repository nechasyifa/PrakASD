public class Mahasiswa {
    public String nama;
    public String nim;
    public char jenisKelamin;
    public double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nilai IPK: " + ipk);
        System.out.println();
    }

    public static double hitungRataIpk(Mahasiswa[] mahasiswaArray) {
        double totalIpk = 0.0;

        for (Mahasiswa mhs : mahasiswaArray) {
            totalIpk += mhs.ipk;
        }

        return totalIpk / mahasiswaArray.length;
    }

    public static void tampilIpkTertinggi(Mahasiswa[] mahasiswaArray) {
        Mahasiswa ipkTinggi = null;

        for (Mahasiswa mhs : mahasiswaArray) {
            if (ipkTinggi == null || mhs.ipk > ipkTinggi.ipk) {
                ipkTinggi = mhs;
            }
        }

        if (ipkTinggi != null) {
            System.out.println("Mahasiswa dengan IPK tertinggi: ");
            ipkTinggi.tampilInformasi();
        } else {
            System.out.println("Tidak valid");
        }
    }
}