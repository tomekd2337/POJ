
public class Capricciosa implements Pizza { // nie potrzeba extends??
	@Override
	public void prepare() {
		System.out.println(" Capricciosa");
		System.out.println("Sklad: pieczarki, sos, szynka");
		System.out.println("Ostrosc 1");
	}

	@Override
	public void size() {
		int sP = 22;
		int mP = 27;
		int lP = 32;
		Size.sSize(sP, mP, lP);

	}
}
