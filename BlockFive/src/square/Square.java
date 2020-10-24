package square;

import java.util.Arrays;

public class Square {
    Point leftTopPoint;
    int a;

    Square(Point point, int a) {
        if (a == 0) {
            System.out.println("Введите длину");
        }
        this.leftTopPoint = point;
        this.a = a;
    }
    Square(int x, int y, int a) {this(new Point(x, y), a);}

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