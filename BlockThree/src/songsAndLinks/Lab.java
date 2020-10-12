package songsAndLinks;

public class Lab {
    public static void main(String[] args) {
        Albom a1 = new Albom("Кукловод ", " Металлов");
        Albom a2 = new Albom("Шоссе ООП", "Асид");

        Trek t1 = new Trek("Состояние объектов", "Янг", a2);
        Trek t2 = new Trek("Шоссе к ООП", null, a2);
        Trek t3 = new Trek("Одноразовый программист", "Бертон", a1);

        Trek[] a1All = {t1, t2, t3};

        a2.allTreks(a1All);

        System.out.println(t2.allTreks());
//        System.out.println(t2);
//        System.out.println(t3);

    }
}
