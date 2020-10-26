package time;

public class Time {
    int time;

    Time(int time) {
        this.time = time;
    }
    Time(int hour, int min, int sec){
        this.time = hour * 3600 + min * 60 + sec;
    }
    public String toString() {
        return (this.time / 3600) % 24
                + ":"
                + this.time / 60 % 60
                + ":"
                + this.time % 60 % 60;
    }
}
