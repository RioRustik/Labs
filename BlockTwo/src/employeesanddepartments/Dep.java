package employeesanddepartments;

public class Dep {
    String title;
    Staff boss;

    public Dep(String title, Staff boss) {
        this.title = title;
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "Отдел " + this.title + " начальник " + this.boss.name;
    }
}
