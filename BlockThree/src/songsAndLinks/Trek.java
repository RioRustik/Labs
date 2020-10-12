package songsAndLinks;

public class Trek {
    String name;
    String author;
    Albom albom;

    Trek(String name, String author, Albom albom) {
        this.name = name;
        this.author = author;
        this.albom = albom;
    }

    public Albom allTreks() {
        return this.albom;
    }

    @Override
    public String toString() {
        return "Трек: '" + this.name + "' авторы: " + this.albom.author + " " + this.author + " альбом '" + this.albom.name + "'";
    }
}
