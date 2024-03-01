public class Kerucut {
    public double jariJari;
    public double sisiMiring;

    public Kerucut(double r, double m) {
        jariJari = r;
        sisiMiring = m; 
    }

    public double hitungLuasPermukaan() {
        return 3.14 * jariJari * (jariJari + sisiMiring);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * 3.14 * jariJari * jariJari * sisiMiring;
    }
}