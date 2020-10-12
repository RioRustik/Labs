package house;

public class House {
    final int n;

    public House(int n) {
        this.n = n;
    }

    public String toString() {
        if (n > 0) {
            if (n == 1) {
                System.out.println("Дом с " + n + " этажом");
            }
            if (n > 1) {
                System.out.println("Дом с " + n + " этажами");
            }
        } else {
            System.out.println("Вы не построили дом");
        }
        return "";
    }
}
