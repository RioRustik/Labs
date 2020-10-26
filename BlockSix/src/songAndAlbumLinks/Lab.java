package songAndAlbumLinks;

public class Lab {
    public static void main(String[] args) {
        Album a1 = new Album("Кукловод ", " Металлов");
        Album a2 = new Album("Шоссе ООП", "Асид");

        Trek t1 = new Trek("Состояние объектов", "Янг", a2);
        Trek t2 = new Trek("Шоссе к ООП", null, a2);
        Trek t3 = new Trek("Одноразовый программист", "Бертон", a1);

        Trek[] aAll = {t1, t2, t3};
        Trek[] aAll2 = {t3};
        a1.allTreks(aAll2);
        a2.allTreks(aAll);

        System.out.println(t2.allTreks());
        System.out.println(t3.allTreks());

    }
}
