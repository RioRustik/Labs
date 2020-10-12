package student;

public class Lab {
    public static void main(String[] args) {
        Student vasia = new Student("Вася", 3, 4, 5);
        System.out.println(vasia);
        Student petia = new Student("Петя");
        petia.rating = vasia.rating;
        System.out.println(petia);
        petia.rating[0] = 5;
        System.out.println(petia);
        System.out.println(vasia);
        Student andrey = new Student("Андрей", 2, 3, 4);

        for (int i = 0; i < vasia.rating.length; i++) {
            andrey.rating[i] = vasia.rating[i];
        }
        vasia.rating[0] = 4;

        System.out.println(vasia);
        System.out.println(petia);
        System.out.println(andrey);
    }
}
