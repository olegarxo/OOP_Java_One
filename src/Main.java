import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(Arrays.asList(
                new Product("Snickers", 7.3),
                new Product("Milca", 20.6)));
        Machine machine = new Machine(list);
        String key = "Snickers";
        System.out.println((machine.getProdictByName(key)));
        List<Product> listDrink  = new ArrayList<>(Arrays.asList(
                new Drinck("Coca Cola", 1.2,0.5),
                new Drinck("Sprite", 1.3,0.5)));
        Machine bottlemachine = new DrinkMachine(listDrink);
        System.out.println(bottlemachine.getProdictByName("Sprite"));
        List<Product> listHotDrink = new ArrayList<>(Arrays.asList(
                new HotDrinck("Coffee", 20.3, 0.5, 50),
                new HotDrinck("Tea", 15.3, 0.4, 30),
                new HotDrinck("Cacao", 24.3, 0.6, 700)));
        Machine hotDrinkMachine = new HotDrinkMachine(listHotDrink);
        System.out.println(hotDrinkMachine.getProdictByName("Coffee", 0.5,  50));
    }
}