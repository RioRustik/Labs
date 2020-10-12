package line;

public class Line {
    Point a,  b;
//    int x1, y1, x2, y2;

    public Line(Point a, Point b) {
//        this.a = a;
//        this.b = b;
        this(a.x, a.y, b.x, b.y);

    }

    public Line(int x1, int y1, int x2, int y2) {

        this.a = new Point (x1,y1);
        this.b = new Point (x2,y2);;

//        this.x1 = x1;
//        this.y1 = y1;
//        this.x2 = x2;
//        this.y2 = y2;
    }

    public String toString() {
        return "линия от" + a + "до" + b;
    }
}
