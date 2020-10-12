package employeesanddepartments;

public class Lab {
    public static void main(String[] args) {

        Dep IT = new Dep("IT", null);

        Staff Kozlov = new Staff("Козлов", IT);
        Staff Sidorov = new Staff("Сидоров", IT);
        Staff Petrov = new Staff("Петров", IT);

        IT.boss = Petrov;

        System.out.println(Kozlov);
        System.out.println(Petrov);
        System.out.println(Sidorov);
        System.out.println(IT);
    }
}
