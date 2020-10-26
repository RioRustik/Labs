package album;

import java.util.ArrayList;

public class Labs {
    public static void main(String[] args) {
        Album kuklovod = new Album("Кукловод","Металлов");
        Album highway = new Album("Шоссе к ООП","Асид");
        Music music1 = new Music("Состаяние объектов","Янг");
        Music music3 = new Music("Одноразовый программист", "Бертон");
        music1.setAlbum(highway);
        music3.setAlbum(highway);
        Album test = music3.getAlbum();
        test = kuklovod;
        System.out.println(music1.getOtherMusicInAlbum());
    }

}
