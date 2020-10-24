package gun;

public class Gun {
    private int patrons;
    private final int maxPatrons;

    Gun(int maxPatrons) {
        if(maxPatrons <= 0) throw new IllegalArgumentException(maxPatrons+" is not a legal floor");
        this.maxPatrons = maxPatrons;
    }
    public void setPatrons(int patrons){
        if(patrons > this.maxPatrons || patrons <= 0) throw new IllegalArgumentException(patrons+" is not a legal floor");
        this.patrons = patrons;
    }

    public int getmaxPatrons(){
        return this.maxPatrons;
    }

    public void shot(){
        if (this.patrons > 0) {
            this.patrons--;
            System.out.println("Бах!");
        }
        else System.out.println("Клац!");
    }
    public void recharge(int patrons){
        if(patrons <= 0) throw new IllegalArgumentException(patrons+" is not a legal floor");
        int ch = this.maxPatrons - this.patrons;
        if(patrons > ch) {
            int exc = patrons - ch;//лишние патроны
            System.out.println("Лишние патроны "+exc);
            this.patrons = this.patrons+ch;
        }else
            this.patrons = this.patrons + patrons;
        System.out.println("Пистолет перезаряжен число патронов " + this.patrons);

    }
    public void discharge(){
        System.out.println("Писталет разряжен вынуто паронов "+this.patrons);
        this.patrons = 0;
    }
    public int getPatron(){
        return this.patrons;
    }
    public void state(){
        if(this.patrons == 0)  System.out.println("Писталет разряжен");
        if(this.patrons != 0)  System.out.println("Писталет заряжен");
    }

}
