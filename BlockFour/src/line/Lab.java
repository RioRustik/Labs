package line;

public class Lab {
    public static void main(String[] arrg) {

        Line l = new Line(1,3,23,8);
        System.out.println(l);

        Line l1 = new Line(5,10,25,10);
        System.out.println(l1);

        Line l2 = new Line(l.a.x, l.a.y, l1.b.x, l1.b.y);
        System.out.println(l2);
    }
}
