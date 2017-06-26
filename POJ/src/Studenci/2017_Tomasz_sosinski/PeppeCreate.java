
public class PeppeCreate implements PizzaFactory{

	@Override
	public Pizza createPizza() {
		return new Pepperoni();
	}

}