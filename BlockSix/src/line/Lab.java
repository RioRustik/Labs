package line;

public class Lab {
    public static void main(String[] arrg) {
        Line l2 = new Line(new Point(1, 1),new Point(10, 15));
        System.out.println(l2);
        System.out.println(l2.getPointA());
        System.out.println(l2.getPointB());
        l2.setPointA(2,2);
        l2.setPointB(2,55);
        System.out.println(l2);
        System.out.println(l2.getPointA());
    }
}
