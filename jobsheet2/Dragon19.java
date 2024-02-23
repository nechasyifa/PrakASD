public class Dragon19 {
    int x, y, width, height;
    
    public Dragon19(int X, int Y, int w, int h) {
        x = X;
        y = Y;
        width = w;
        height = h;
    }

    void moveLeft() {
        x--;
        if (x < 0 && x > width) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x++;
        if (x < 0 && x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y--;
        if (y < 0 && y > height) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y++;
        if (y < 0 && y > height) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        if (x >= 0 && y >= 0 && x <= width && y <= height) {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
    } else {
        detectCollision(x, y);
    }
}

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }

    public Dragon19() {

    }
}