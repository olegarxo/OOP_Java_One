public class HotDrinck extends Drinck{
    private int temperatur;

    public int getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    public HotDrinck(String name, Double cost, Double volume, int temperatur) {
        super(name, cost, volume);
        this.temperatur = temperatur;
    }

    @Override
    public String toString() {
        return "HotDrinck{" +
                "name='" + getName() + '\'' +
                ", volume=" + getVolume() + '\'' +
                ", temperatur " + this.temperatur + '}';
    }
}
