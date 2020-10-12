package human;

public class Human {
    Name name = new Name();
    int height;
    Human dad;

    public Human(String name, String surname, String patronymic, int height, Human dad) {
        this.height = height;
        this.name.name = name;
        this.name.surname = surname;
        this.name.patronymic = patronymic;
        this.dad = dad;
    }

    public Human(String name, String surname, int height, Human dad) {
        this.height = height;
        this.name.name = name;
        this.name.surname = surname;
        this.dad = dad;
    }

    public Human(String name, int height, Human dad) {
        this.height = height;
        this.name.name = name;
        this.dad = dad;
    }

    public void func() {
        if (this.name.surname == null) {
            if (this.dad != null) {
                this.name.surname = this.dad.name.surname;
                this.name.patronymic = this.dad.name.name + "Ович";
            }
        }
        if (this.name.patronymic == null) {
            if (this.dad != null) {
                this.name.patronymic = this.dad.name.name + "Ович";
            }
        }
    }

    @Override
    public String toString() {
        func();
        return name + " " + height;
    }
}
