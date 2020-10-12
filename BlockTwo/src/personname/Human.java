package personname;

public class Human {
    Name name = new Name("", "", "");
    int height;

    public Human(String name, String surname, String patronymic, int height) {
        this.height = height;
        this.name.name = name;
        this.name.surname = surname;
        this.name.patronymic = patronymic;

    }

    public Human(String name, String surname, int height) {
        this.height = height;
        this.name.name = name;
        this.name.surname = surname;
    }

    public Human(String name, int height) {
        this.height = height;
        this.name.name = name;

    }

    public String toString() {
        return "Человек с именем - " + this.name.name + " " + this.name.surname + " " + this.name.patronymic + " и ростом " + height;
    }
}
