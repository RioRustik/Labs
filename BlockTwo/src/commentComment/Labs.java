package commentComment;

public class Labs {
    public static void main(String[] args) {
        Comment comment1 = new Comment("отличные задачи!",169);
        comment1.setAnswerComment(new Comment("совершенно согласен с этим комментарием!",5));
        comment1.answerComment.setAnswerComment(new Comment("что-то я ничего не понял",0));
        System.out.println(comment1);
    }
}
