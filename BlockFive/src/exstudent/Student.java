package exstudent;
import java.util.*;

public class Student {
    String name;
    int[] rating;


    public Student(String name, int... rating) {
        this.name = name;
        this.rating = rating;
    }

    public String excellent(){
        double sum = 0;
        //for(int i : this.rating)sum += this.rating[i];
        for(int i = 0; i < this.rating.length; i++){
            sum += this.rating[i];
        }
        sum = sum / this.rating.length;
        if(sum == 5){
            return "отличник, " + "средний балл " + sum;
        }
        else return "не отличник, " + "средний балл " + sum;
    }

    public String toString() {
        return "Студент " + name + ", с оценками " + Arrays.toString(rating) +
                " " + this.excellent();
    }
}

