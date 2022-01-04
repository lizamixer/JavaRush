package Other.Serialization2;

import java.io.Serializable;

class Point implements Serializable {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ") reference=" + super.toString();
    }
}
