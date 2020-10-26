package songAndAlbumLinks;

import java.util.Arrays;

public class Album {
    String name;
    String author;
    private  Trek [] treks;

    Album(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void allTreks(Trek[] treks){
        this.treks = treks;
    }

    public String allString(Trek[] treks){
        String sn = Arrays.toString(treks);
        return sn;
    }


    @Override
    public String toString() {
        return this.name + " " + this.author + " " + allString(treks);
    }

}
