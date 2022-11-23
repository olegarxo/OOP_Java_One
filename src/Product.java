public class Product {
     private String name;
     private double cost;

     public Product(String name, Double cost){
         this.name = name;
         this.cost = cost;
     }
     public void setName(String name){
        this.name = name;
     }
     public String getName(){
         return this.name;
     }
     public void setCost(Double cost){
         this.cost = cost;
     }
     public double getCost(){
         return this.cost;
     }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
