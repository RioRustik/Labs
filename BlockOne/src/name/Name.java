package name;

public class Name {
    String name;
    String surname;
    String patronymic;

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

    public String toString() {
        if (this.name != null) {
            System.out.print(this.name + " ");
        }
        if (this.patronymic != null) {
            System.out.print(this.patronymic + " ");
        }
        if (this.surname != null) {
            System.out.print(this.surname);
        }
        return "";
    }
}
