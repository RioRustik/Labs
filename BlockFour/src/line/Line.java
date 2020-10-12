package line;

public class Line {
    Point a,  b;

    public Line(Point a, Point b) {
        this(a.x, a.y, b.x, b.y);
    }

    public Line(int x1, int y1, int x2, int y2) {

        this.a = new Point (x1,y1);
        this.b = new Point (x2,y2);;
    }

    public String toString() {
        return "линия от" + a + "до" + b;
    }
}
