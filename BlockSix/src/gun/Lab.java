package gun;

public class Lab {
    public static void main(String[] args) {
        Gun p = new Gun(7);
        p.setPatrons(3);
        p.shot();
        p.shot();
        p.shot();
        p.shot();
        p.shot();
        p.recharge(8);
        p.shot();
        p.shot();
        p.discharge();
        p.shot();


    }
}
