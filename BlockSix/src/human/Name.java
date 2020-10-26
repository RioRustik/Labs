package human;

public class Name {

    String name;
    String surname;
    String patronymic;

    public Name() {

    }
    public Name(String name) {
        this.name = name;
    }
    public Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Name(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

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
