package comment;

import java.util.ArrayList;
import java.util.List;

public class Comment {
    List<Comment> answerComments = new ArrayList<>();
    int level = 0;
    String text;
    int rating;
    Comment(String text, int rating){
        this.text = text;
        this.rating = rating;
    }
    @Override
    public String toString(){
        String resStr = "";
        for (int i = 0; i < this.level; i++) resStr += "---";
        if (this.answerComments.size() == 0) return resStr + "(" + this.rating + ") " +this.text;
        resStr += "(" + this.rating + ") " + this.text;
        for (int i = 0; i < this.answerComments.size(); i++){
            resStr +='\n' + this.answerComments.get(i).toString();
        }
        return resStr;

    }
    public void setAnswerComment(Comment comment){
        comment.level = this.level + 1;
        this.answerComments.add(comment);
    }
}
