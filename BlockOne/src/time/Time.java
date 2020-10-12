package time;

public class Time {
    int hours;
    int minutes;
    int second;
    int x;

    public Time(int x) {
        this.x = x;
    }

    public void func() {
        this.hours = x / 3600;
        x %= 3600;
        this.minutes = x / 60;
        x %= 60;
        this.second = x;

    }

    public void fanc() {
        func();
        if (this.hours >= 24) {
            this.hours %= 24;
        }
        if (this.minutes > 60) {
            this.minutes %= 60;
        }
        if (this.second > 60) {
            this.second %= 60;
        }
    }

    public String toString() {
        fanc();
        return "Время " + this.hours + ":" + this.minutes + ":" + this.second;
    }
}
