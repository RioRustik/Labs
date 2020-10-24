package house;

public class House {
        private final int n;

        public House(int n) {
            if(n<=0) throw new IllegalArgumentException(n+" is not a legal floor");
            this.n = n;
        }
        public int getFloor() {
            return this.n;
        }
//        public void setFloor(int n) {
//            if(n<=0) throw new IllegalArgumentException(n+"is not a legal floor");
//        this.n = n;
//        }
        public String toString() {
            if(this.n == 1) return "Дом с "+this.n+" этажом";
            return "Дом с "+this.n+" этажами";
        }
}
