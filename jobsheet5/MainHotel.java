/**
 * MainHotel
 */
public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();

        hotelService.tambah(new Hotel("Savana", "Jakarta", 500000, (byte) 3));
        hotelService.tambah(new Hotel("Mentari", "Bandung", 700000, (byte) 4));
        hotelService.tambah(new Hotel("Chamber", "Surabaya", 400000, (byte) 4));
        hotelService.tambah(new Hotel("Sage", "Yogyakarta", 800000, (byte) 5));
        hotelService.tambah(new Hotel("Ibis", "Bali", 600000, (byte) 3));

        System.out.println("Daftar Hotel Sebelum Sorting:");
        hotelService.tampil();

        // Sorting Bubble Sort
        hotelService.bubbleSort();
        System.out.println("Daftar Hotel Setelah Sorting menggunakan Bubble Sort:");
        hotelService.tampil();

        // Sorting Selection Sort
        hotelService.selectionSort();
        System.out.println("Daftar Hotel Setelah Sorting menggunakan Selection Sort:");
        hotelService.tampil();
    }
}
