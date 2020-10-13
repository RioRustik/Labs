package brokenLine;
//В любой момент к имеющимся Точкам можно добавить новые Точки (добавляется либо массив, либо просто перечень Точек, что приводит к получению нового массива, содержащего как старые, так и новые значения).
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
