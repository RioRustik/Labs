package employeesanddepartments;

public class Staff {
    String name;
    Dep dep;

    public Staff(String name, Dep dep) {
        this.name = name;
        this.dep = dep;
    }

    @Override
    public String toString() {
        if (this.dep.boss.name == this.name) {
            return this.name + " начальник отдела " + this.dep.title;

        } else {
            return this.name + " работает в " + this.dep.title + " начальник " + this.dep.boss.name;
        }

    }
}
