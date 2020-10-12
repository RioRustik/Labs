package human;

public class Human {

    String name;
    int height;

    public Human(String name, int height) {
        this.height = height;
        this.name = name;
    }

    public String toString() {
        if (this.height < 160) {
            return name + ", " + "рост " + height + " - маленький человек";
        } else if (this.height > 185) {
            return name + ", " + "рост " + height + " - большой человек";
        } else {
            return name + ", " + "рост " + height + " - средний человек";
        }
    }
}
