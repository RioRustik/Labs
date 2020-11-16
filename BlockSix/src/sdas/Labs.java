package sdas;

public class Labs {
    public static void main(String[] args) throws Exception {
        Student vasia = new Student("Вася",3,2);
        Student pete = new Student("Петя",5,5,5,5);
        System.out.println(vasia.getAverage());
        System.out.println(vasia.isExcellent());
        System.out.println(pete.getAverage());
        System.out.println(pete.isExcellent());
    }
}
