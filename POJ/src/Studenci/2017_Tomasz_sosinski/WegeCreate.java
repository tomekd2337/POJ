
public class WegeCreate implements PizzaFactory{

	@Override
	public Pizza createPizza() {
		return new Wegetarianska();
	}

}
