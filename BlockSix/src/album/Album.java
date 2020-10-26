package album;

import java.util.ArrayList;

public class Album {
    String name;
    String author;
    private ArrayList<Music> songs = new ArrayList<>();
    Album(String name, String author){
        this.name = name;
        this.author = author;
    }
    public void addMusic(Music music){
        if (music.getAlbum() != null){
            music.getAlbum().songs.remove(music);
        }
        this.songs.add(music);
    }

    public Music[] getSongs() {
        return (Music[]) songs.toArray();
    }
}
