package line;

public class Line {
    private Point a,  b;

    public Line(Point a, Point b) {
        this(a.x, a.y, b.x, b.y);
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.a = new Point (x1,y1);
        this.b = new Point (x2,y2);
    }

    public Point getPointA(){
        return a;
    }

    public Point getPointB(){
        return b;
    }

    public void setPointA(int x1, int y1){
        this.a = new Point(x1,y1);
    }

    public void setPointB(int x2, int y2){
        this.b = new Point(x2,y2);
    }


    public int Distance(){
        int d;
        double d1 = b.x - a.x;
        double d2 = b.y - a.y;
        d = (int) Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
        return d;
    }

    public String toString() {
        return "Линия от точки с координатами " + a + " до точки с координатами " + b + "\n" + "Длина линии: "+Distance();
    }

}
