/**
 * SingleLinkedList
 */
public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }
void addFirst(int input) {
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addFirst
        Node ndInput = new Node(input, head);
        if (isEmpty()) { // jika kosong, maka peran head dan tail
                         // harus dimiliki node yang sama
            tail = ndInput;
        }
        head = ndInput;
    }
void addLast(int input) {
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addLast
        Node ndInput = new Node(input, null);
        if (isEmpty()) { // jika kosong, maka peran head dan tail
                         // harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) { // jika tidak ada node selanjutnya
                                            // maka dijadikan ndInput sebagai tail
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null); // selama masih ada node, lanjutkan
    }


    void insertAt(int index, int input) {
        // pastikan operasi dari method ini adalah menggeser posisi
        // node yang terletak di indeks dan node tersebut berpindah
        // satu indeks setelahnya

        if (index < 0) {
            System.out.println("indeks tidak valid");
            return;
        }
        if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}