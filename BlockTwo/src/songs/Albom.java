package songs;

public class Albom {
    String name;
    String author;

    Albom(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String toString(){
        return this.name + " " + this.author;
    }
}
