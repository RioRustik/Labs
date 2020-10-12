package parentman;

public class Name {
    String name;
    String surname;
    String patronymic;

    @Override
    public String toString() {
        if (this.patronymic == null && surname == null) {
            return this.name;
        }
        if (this.patronymic == null) {
            return this.name + " " + this.surname;
        } else {
            return this.name + " " + this.patronymic + " " + this.surname;
        }
    }
}
