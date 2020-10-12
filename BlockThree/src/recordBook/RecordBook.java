package recordBook;

public class RecordBook {
    long number;
    String name;
    Appraisals[] arr;

    public RecordBook(long number, String name, Appraisals... arr) {
        this.name = name;
        this.number = number;
        this.arr = arr;
    }

    public String toString() {
        String res = name + " " + number + ":\n";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + "; ";
        }
        return res;
    }
}
