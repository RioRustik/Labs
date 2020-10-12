package town;

public class Way {
    Town town;
    int cost;

    public Way(Town town, int cost) {
        this.town = town;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.town.name+ "=" + this.cost;
    }
}
