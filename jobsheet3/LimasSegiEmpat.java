public class LimasSegiEmpat {
    public double panjangSisiAlas;
    public double tinggiLimas;
    
    public LimasSegiEmpat(double pjgAlas, double tLimas) {
        panjangSisiAlas = pjgAlas;
        tinggiLimas = tLimas;
    }

    public double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas * tinggiLimas);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
}