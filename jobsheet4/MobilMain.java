/**
 * MobilMain
 */
public class MobilMain {
    static Mobil[] mobilList = {
        new Mobil("BMW", "M2 Coupe", 2016, 6816, 728),
        new Mobil("Ford", "Fiesta ST", 2014, 3921, 575),
        new Mobil("Nissan", "370Z", 2009, 4360, 657),
        new Mobil("Subaru", "BRZ", 2014, 4058, 609),
        new Mobil("Subaru", "Impreza WRX STI", 2013, 6255, 703),
        new Mobil("Toyota", "AE86 Trueno", 1986, 3700, 553),
        new Mobil("Toyota", "86/GT86", 2014, 4180, 609),
        new Mobil("Volkswagen", "Golf GTI", 2014, 4180, 631)
    };
    
    // Divide and Conquer top acceleration tertinggi
    static Mobil MaxAcceleration(Mobil[] arr, int min, int max) {
        if (min == max) return arr[min];
        
        int mid = (min + max) / 2;
        
        Mobil leftMax = MaxAcceleration(arr, min, mid);
        Mobil rightMax = MaxAcceleration(arr, mid + 1, max);
        
        return (leftMax.topAcceleration > rightMax.topAcceleration) ? leftMax : rightMax;
    }
    
    // Divide and Conquer top acceleration terendah
    static Mobil MinAcceleration(Mobil[] arr, int min, int max) {
        if (min == max) return arr[min];
        
        int mid = (min + max) / 2;
        
        Mobil leftMin = MinAcceleration(arr, min, mid);
        Mobil rightMin = MinAcceleration(arr, mid + 1, max);
        
        return (leftMin.topAcceleration < rightMin.topAcceleration) ? leftMin : rightMin;
    }
    
    // Brute Force rata-rata top power
    static double RatarataPower(Mobil[] arr) {
        int totalPower = 0;
        for (Mobil mobil : arr) {
            totalPower += mobil.topPower;
        }
        return (double) totalPower / arr.length;
    }

    static void tampilMobil(Mobil mobil) {
        System.out.println("Merk: " + mobil.merk);
        System.out.println("Tipe: " + mobil.tipe);
        System.out.println("Tahun: " + mobil.tahun);
        System.out.println("Top Acceleration: " + mobil.topAcceleration);
    }

    public static void main(String[] args) {
        Mobil maxAcceleration = MaxAcceleration(mobilList, 0, mobilList.length - 1);
        Mobil minAcceleration = MinAcceleration(mobilList, 0, mobilList.length - 1);
        
        System.out.println("Mobil dengan top acceleration tertinggi:");
        tampilMobil(maxAcceleration);
        
        System.out.println("\nMobil dengan top acceleration terendah:");
        tampilMobil(minAcceleration);
        
        double averagePower = RatarataPower(mobilList);
        System.out.println("\nRata-rata top power dari seluruh mobil: " + averagePower);
    }
}