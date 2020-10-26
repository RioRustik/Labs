package square;

public class Square {
    private Point leftTopPoint;
    private int a;

    Square(Point point, int a) {
        this.leftTopPoint = point;
        if(a<=0) throw new IllegalArgumentException(a+" is not a legal floor");
        this.a = a;
    }
    Square(int x, int y, int a){this(new Point(x, y), a);}

    public int getLength(){
        return a;
    }
    public void setLength(int a) {
        if(a<=0) throw new IllegalArgumentException(a+" is not a legal floor");
        this.a = a;
    }

    public String toString(){
        return "Квадрат в точке " + leftTopPoint + " со стороной " + this.a;
    }

    public void toLine(){
        System.out.println(new Line(
                        leftTopPoint,
                        new Point(leftTopPoint.x + this.a, leftTopPoint.y),
                        new Point(leftTopPoint.x + this.a, leftTopPoint.y - this.a),
                        new Point(leftTopPoint.x, leftTopPoint.y - this.a)
                )
        );
    }
}
