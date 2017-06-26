
public class CapriCreate implements PizzaFactory{

	@Override
	public Pizza createPizza() {
		return new Capricciosa();
	}

}