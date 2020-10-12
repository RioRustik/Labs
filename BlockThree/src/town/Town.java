package town;
import java.util.*;

public class Town {
    String name;
    Way[] way;

    Town(String name, Way...way) {
        this.name = name;
        this.way = way;
    }

    @Override
    public String toString() {
        return this.name + " " + Arrays.toString(this.way);
    }
}
