package recordBook;

public class Appraisals {
    String subject, surname;
    int grade;

    Appraisals(String subject, String surname, int grade) {
        this.subject = subject;
        this.surname = surname;
        this.grade = grade;
    }

    public String toString() {
        return this.subject + " " + this.surname + " " + this.grade;
    }
}
