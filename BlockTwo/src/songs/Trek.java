package songs;

public class Trek {
    String name;
    String author;
    Albom albom;

    Trek(String name, String author, Albom albom){
        this.name = name;
        this.author = author;
        this.albom = albom;
    }

    public String toString(){
        return "Трек: '" + this.name + "' авторы: " + this.albom.author + " " + this.author + " альбом '" + this.albom.name + "'";
    }
}
