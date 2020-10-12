package personname;

public class Lab {
    public static void main(String[] arr) {

        Human h1 = new Human("Клеопатра", 52);
        Human h2 = new Human("Александр", "Сергеевич", "Пушкин", 167);
        Human h3 = new Human("Владимир", "Маяковский", 189);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
