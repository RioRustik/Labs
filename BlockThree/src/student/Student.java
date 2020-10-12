package student;
import java.util.*;

public class Student {
    String name;
    int[] rating;
    //= new int[3];

    public Student(String name, int... rating) {
        this.name = name;
        this.rating = rating;
    }

    public String toString() {
        return name + " " + Arrays.toString(rating);
    }
}
