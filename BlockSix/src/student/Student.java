package student;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] rating;

    public String getRating() {
        return Arrays.toString(rating);
    }

    public Student(String name, int... rating) {
        this.name = name;
        for(int i = 0; i < rating.length; i++) {
            if (rating[i] < 2 || rating[i] > 5) throw new IllegalArgumentException();
            this.rating = rating;
        }
    }

    private String excellent(){
        double sum = 0;
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
