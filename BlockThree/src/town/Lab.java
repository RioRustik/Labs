package town;

public class Lab {
    public static void main(String[] args) {
        Town a = new Town("A");
        Town b = new Town("B");
        Town c = new Town("C");
        Town d = new Town("D");
        Town e = new Town("E");
        Town f = new Town("F");

        a.way = new Way[3];
        a.way[0] = new Way(b, 5);
        a.way[1] = new Way(f, 1);
        a.way[2] = new Way(d, 6);
        System.out.println(a);

        b.way = new Way[3];
        b.way[0] = new Way(a, 5);
        b.way[1] = new Way(f, 1);
        b.way[2] = new Way(c, 3);
        System.out.println(b);

        c.way = new Way[2];
        c.way[0] = new Way(b, 3);
        c.way[1] = new Way(d, 4);
        System.out.println(c);

        d.way = new Way[3];
        d.way[0] = new Way(a, 6);
        d.way[1] = new Way(e, 2);
        d.way[2] = new Way(c, 4);
        System.out.println(d);

        e.way = new Way[2];
        e.way[0] = new Way(f, 2);
        e.way[1] = new Way(d, 2);
        System.out.println(e);

        f.way = new Way[3];
        f.way[0] = new Way(a, 1);
        f.way[1] = new Way(e, 2);
        f.way[2] = new Way(b, 1);
        System.out.println(f);
    }
}
