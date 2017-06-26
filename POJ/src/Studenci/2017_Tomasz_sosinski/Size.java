import java.util.Scanner;

public class Size  {
	
	public static void sSize(int s, int m, int l) {
		
		System.out.println("");
		System.out.println("Podaj rozmiar Pizzy");
		System.out.println("1- Mala:" +s);
		System.out.println("2- Srednia: " +m);
		System.out.println("3- Duza: " +l);
		System.out.println("4-Zakoncz / Potwierdz zamowienie");
		Scanner in = new Scanner(System.in);
		int a = 0;
		while(a != 4){
			a = in.nextInt();
		switch(a){
		case 1:
			System.out.println("Rozmiar mala. Cena to " +s  +" zl ");
			break;
		case 2:
			System.out.println("Rozmiar srednia. Cena to " +m  +" zl ");
			break;
		case 3:
			System.out.println("Rozmiar duza. Cena to " +m  +" zl ");
			break;
		case 4: 
			System.out.println("Dziekujemy");
			
		default:
			System.out.println("Zly wybor");
		}
		} 
		System.out.println("");
	}
}
