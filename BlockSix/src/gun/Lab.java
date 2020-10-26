package gun;

public class Lab {
    public static void main(String[] args) {
        Gun colt = new Gun(7);
        colt.setPatrons(3);
        colt.shot();
        colt.shot();
        colt.shot();
        colt.shot();
        colt.shot();
        colt.recharge(8);
        colt.shot();
        colt.shot();
        colt.discharge();
        colt.shot();


    }
}
