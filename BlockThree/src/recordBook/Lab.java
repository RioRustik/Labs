package recordBook;

public class Lab {
    public static void main(String[] args) {
    RecordBook book1 = new RecordBook(171896, "Вася");

    Appraisals p1 = new Appraisals("информатика", "Ермаков", 5);
    Appraisals p2 = new Appraisals("математика", "Петрова", 4);
    Appraisals p3 = new Appraisals("физика", "Сидоров", 5);

    book1.arr = new Appraisals[]{p1, p2, p3};
        System.out.println(book1);

    p3 = new Appraisals("ангиский язык", "Буров", 4);
    book1.arr[2] = p3;
        System.out.println(book1);

    RecordBook book2 = new RecordBook(173654, "Петя");
    book2.arr = new Appraisals[]{p1, p2, p3};
        System.out.println(book2);

    book2.arr[1] = new Appraisals ("математика", "Петрова", 5);
        System.out.println(book2);
}
}
