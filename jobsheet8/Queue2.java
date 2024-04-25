/**
 * Queue2
 */
public class Queue2 {
    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue2(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pembeli pembeli) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        antrian[rear] = pembeli;
        size++;
    }

    public Pembeli dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }

        Pembeli pembeli = antrian[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        size--;
        return pembeli;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        int i = front;
        while (i != rear) {
            System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
            i = (i + 1) % max;
        }
        System.out.println("Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Elemen terdepan: Nama: " + antrian[front].nama + ", No HP: " + antrian[front].noHP);
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Elemen terbelakang: Nama: " + antrian[rear].nama + ", No HP: " + antrian[rear].noHP);
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        int i = front;
        int position = 1;
        while (i != rear) {
            if (antrian[i].nama.equals(nama)) {
                System.out.println(nama + " berada di posisi antrian ke-" + position);
                return;
            }
            position++;
            i = (i + 1) % max;
        }

        if (antrian[i].nama.equals(nama)) {
            System.out.println(nama + " berada di posisi antrian ke-" + position);
        } else {
            System.out.println(nama + " tidak ditemukan dalam antrian");
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        int i = front;
        int position = 1;
        while (i != rear) {
            System.out.println("Antrian ke-" + position + ": Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
            position++;
            i = (i + 1) % max;
        }
        System.out.println("Antrian ke-" + position + ": Nama: " + antrian[i].nama + ", No HP: " + antrian[i].noHP);
    }
}