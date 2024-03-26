/**
 * HotelService
 */
public class HotelService {
    Hotel[] rooms;
    int size;

    public HotelService() {
        rooms = new Hotel[10];
        size = 0;
    }

    public void tambah(Hotel H) {
        if (size < rooms.length) {
            rooms[size] = H;
            size++;
        } else {
            System.out.println("Kamar penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < size; i++) {
            System.out.println("Nama Hotel: " + rooms[i].nama);
            System.out.println("Kota: " + rooms[i].kota);
            System.out.println("Harga: " + rooms[i].harga);
            System.out.println("Bintang: " + rooms[i].bintang);
            System.out.println("------------------------");
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (rooms[j].bintang > rooms[minIndex].bintang) {
                    minIndex = j;
                }
            }
            Hotel temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}
