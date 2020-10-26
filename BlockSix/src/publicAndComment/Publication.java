package publicAndComment;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private String name;
    private String text;
    private String tag;
    int rating;
    private List<Comment> comments = new ArrayList<>();

    public Publication(String name, String text, String tag, int rating) {
        this.name = name;
        this.text = text;
        this.tag = tag;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public void addRating() {
        rating++;
    }

    public void reduceRating() {
        rating--;
    }

    public void setText(String text) {
        if ((comments.size() == 0) && (rating == 0)) {
            this.text = text;
        } else {
            System.out.println("Text can't edit");
        }
    }

    public boolean isEditable() {
        if ((rating == 0) && (comments.size() == 0)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String resStr = "("
                + this.rating
                + ") "
                + this.name
                + "\n тэги: "
                + this.tag
                + "\n"
                + this.text
                + "\nКоментарии:\n";
        for (int i = 0; i < comments.size(); i++) {
            resStr += comments.get(i).toString() + '\n';
        }
        return resStr;
    }

    public void setComment(Comment comment) {
        comments.add(comment);
    }
}
