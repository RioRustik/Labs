package сomment;

public class Lab {

    public static void main(String[] arr) {
        Comment point = new Comment();
        point.rating = 5;
        point.string = "задача первого блока №1";
        Comment comment = new Comment();
        comment.rating = 5;
        comment.string = "задача первого блока №2";
        Comment human = new Comment();
        human.rating = 0;
        human.string = "задача первого блока №3 (не решена)";
        System.out.println(point);
        System.out.println(comment);
        System.out.println(human);
    }
}
