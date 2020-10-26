package songAndAlbumLinks;

public class Trek {
    String name;
    String author;
    Album album;

    Trek(String name, String author, Album album) {
        this.name = name;
        this.author = author;
        this.album = album;
    }

    public Album allTreks() {
        return this.album;
    }

    @Override
    public String toString() {
        return "Трек: '" + this.name + "' авторы: " + this.album.author + " " + this.author + " альбом '" + this.album.name + "'";
    }
}
