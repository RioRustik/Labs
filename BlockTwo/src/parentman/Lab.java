package parentman;

public class Lab {
    public static void main(String[] arr) {
        Human h1 = new Human("Лев", 170, null);
        Human h2 = new Human("Сергей", "Пушкин", 168, h1);
        Human h3 = new Human("Александр", 167, h2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

    }
}
