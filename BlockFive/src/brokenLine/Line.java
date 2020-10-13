package brokenLine;

import java.util.Arrays;

public class Line {
    Point [] points;

    public Line(Point...points) {
        this.points = points;
    }

    public long distance(Point [] points){
        double d1 = 0, d2 = 0;
        long d = 0, sum=0;
        for(int i = 0; i < points.length-1; i++){
            d1 = this.points[i+1].x - this.points[i].x;
            d2 = this.points[i+1].y - this.points[i].y;
            d = (long) Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2));
            sum += d;
        }
        return sum;
    }
    public void length(){
       System.out.println("Длина линии равна: " + distance(points));
    }

    public String toString() {
        return "Линия " + Arrays.toString(this.points);
    }
}
