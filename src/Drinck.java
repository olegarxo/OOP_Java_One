public class Drinck extends Product {
    private Double volume;

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Drinck(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public String toString() {
        return "Drinck{" +
                "name='" + getName() + '\'' +
                ", cost=" + getCost() + '\'' +
                ", volume " + this.volume + '}';

    }
}