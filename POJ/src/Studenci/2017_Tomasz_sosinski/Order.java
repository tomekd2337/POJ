
public class Order {  
    private Pizza pizza;
    
 
    public Order(PizzaFactory make) {
 
        pizza = make.createPizza();
        process();
        
}
    
    private void process() {
        System.out.print("Pizza: " );
        pizza.prepare();
        pizza.size();
    
}
}