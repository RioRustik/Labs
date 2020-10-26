package human;

public class Human {
    private Name name = new Name();
    private int height;
    private final Human dad;

    public Human(String name, String surname, String patronymic, int height, Human dad) {
        this.name.name = name;
        this.name.surname = surname;
        this.name.patronymic = patronymic;
        this.dad = dad;
        if(height<=0 || height>=300) throw new IllegalArgumentException();
        this.height = height;
    }

    public Human(String name, String surname, int height, Human dad) {
        this.name.name = name;
        this.name.surname = surname;
        this.dad = dad;
        if(height<=0 || height>=300) throw new IllegalArgumentException();
        this.height = height;
    }

    public Human(String name, int height, Human dad) {
        this.name.name = name;
        this.dad = dad;
        if(height<=0 || height>=300) throw new IllegalArgumentException();
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public Human getDad() {
        return dad;
    }

    public void setHeight(int height) {
        if(height<=0 || height>=300) throw new IllegalArgumentException();
        this.height = height;
    }

    public Name getName() {
        return new Name(name.name, name.surname, name.patronymic);
    }

    public void setName(Name name) {
        this.name = new Name(name.name, name.surname, name.patronymic);
    }

    @Override
    public String toString() {
        func();
        return name + " " + height;
    }
}
