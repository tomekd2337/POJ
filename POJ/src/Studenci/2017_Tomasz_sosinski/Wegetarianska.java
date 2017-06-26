

public class Wegetarianska extends Size implements Pizza {


	@Override
	public void prepare() {
		System.out.println(" Wegetarianska");
		System.out.println("Sklad: papryka, pomidor, ser");
		System.out.println("Ostrosc 0");
		
	}

	@Override
	public void size() {
		int sW = 20;
		int mW = 25;
		int lW = 30;
		Size.sSize(sW, mW, lW);

	}


}
