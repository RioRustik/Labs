package name;

public class Name {

    private String name;
    private String surname;
    private String patronymic;

    public Name(String name) {
        if(name.equals("") || name == null) throw new IllegalArgumentException();
        this.name = name;
    }

    public Name(String name, String surname) {
        if(name.equals("") || name == null) throw new IllegalArgumentException();
        this.name = name;
        if(surname.equals("") || surname == null) throw new IllegalArgumentException();
        this.surname = surname;
    }

    public Name(String name, String patronymic, String surname) {
        if(name.equals("") || name == null) throw new IllegalArgumentException();
        this.name = name;
        if(surname.equals("") || surname == null) throw new IllegalArgumentException();
        this.surname = surname;
        if(patronymic.equals("") || patronymic == null) throw new IllegalArgumentException();
        this.patronymic = patronymic;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setName(String name) {
        if(name.equals("") || name == null) throw new IllegalArgumentException();
        this.name = name;
    }

    public void setSurname(String surname) {
        if(surname.equals("") || surname == null) throw new IllegalArgumentException();
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        if(patronymic.equals("") || patronymic == null) throw new IllegalArgumentException();
        this.patronymic = patronymic;
    }


    public String toString() {
        String res=null;
        if (this.name != null) {
            //System.out.print(this.name + " ");
            res = this.name;
        }
        if (this.patronymic != null) {
            //System.out.print(this.patronymic + " ");
           res = res + this.patronymic;
        }
        if (this.surname != null) {
           // System.out.print(this.surname);
            res = res+ this.surname;
        }
        return res;
    }
}
