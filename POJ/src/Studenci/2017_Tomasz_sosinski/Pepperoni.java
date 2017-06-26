
public class Pepperoni extends Size implements Pizza {
	@Override
	public void prepare() {
		System.out.println("Pizza: Pepperoni");
		System.out.println("Sklad: salami, papryka ostra, cebula, ser");
		System.out.println("Ostrosc 5");
	}

	@Override
	public void size() {
		int sP = 25;
		int mP = 30;
		int lP = 35;
		Size.sSize(sP, mP, lP);

	}
	
}
