import java.util.ArrayList;
import java.util.List;

public class Machine {
    private final List<Product> list;
    public Machine(List<Product> list){
        this.list = list;
    }
    public Product getProdictByName(String name){
        for (Product item:this.list) {
            if(name.equals(item.getName())){
                return item;
            }
        }
        throw new IllegalStateException();
    }
    public HotDrinck getProdictByName(String name, double volume, int temperature){
        for (Product item:this.list) {
            if(item instanceof HotDrinck){
                if(item.getName().equalsIgnoreCase(name) &&
                        ((HotDrinck) item).getVolume() == volume &&
                        ((HotDrinck) item).getTemperatur() == temperature){
                return (HotDrinck) item;
                }
            }
            }
        throw new IllegalStateException();
    }
}
