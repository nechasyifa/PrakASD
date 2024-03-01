public class Bola {
    public double jari2;
    
    public Bola(double jari2) {
        this.jari2 = jari2;
    }

    public double hitungLuasPermukaan() {
        return 4 * 3.14 * jari2 * jari2;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * 3.14 * jari2 * jari2 * jari2;
    }
}
