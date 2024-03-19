/**
 * Mobil
 */
public class Mobil {
    String merk;
    String tipe;
    int tahun;
    int topAcceleration;
    int topPower;

    public Mobil(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public int getTopAcceleration() {
        return topAcceleration;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getTopPower() {
        return topPower;
    }
}