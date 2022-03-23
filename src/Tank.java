public class Tank {
    int x, y;
    int dir;
    int fuel;

    public Tank() {
        this(0, 0, 100);//создали конструктор 1 танка
    }

    public Tank(int x, int y) {
        this(x, y, 100);//конструктор 2 танка
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;//конструктор 3 танка
    }

    public void goForward(int i) {

    }
}

