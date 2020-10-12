package gun;

public class Gun {
    int cartridges;

    Gun(int cartridges) {
        this.cartridges = cartridges;
    }

    Gun() {
        this.cartridges = 5;
    }

    public void shot(){
        if (this.cartridges > 0) {
            this.cartridges--;
            System.out.println("Бах!");
        }
        else System.out.println("Клац!");
    }
}
