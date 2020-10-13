package brokenLine;

public class Lab {
    public static void main(String[] arrg) {
        Point b = new Point(2,8);
        Point c = new Point(5,3);

        Line l =  new Line(new Point(1,5), b, c);
        System.out.println(l);
        l.length();
     //   {5;15}, {8;10}через  list?

    }
}
