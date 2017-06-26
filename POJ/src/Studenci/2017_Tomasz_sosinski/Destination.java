import java.util.Scanner;

public class Destination {
	public static void mDestination() {

		Scanner in = new Scanner(System.in);
		System.out.println("Odbiior osobisty (dostawa bezplatna): ");
		System.out.println("1: Morena");
		System.out.println("2: Zabianka");
		System.out.println("3: Wrzeszcz");
		System.out.println("Dostawa pod wybrany adres - wybierz 4");
		System.out.println("5-Zakoncz / Potwierdz zamowienie");
		String address;
		int zone = 0; 
		while(zone != 5){
			zone = in.nextInt();
		switch(zone){
		
		case 1:
			
				System.out.println("Odbior w lokalu Morena");
				System.out.println("nacisnij 5, aby zakonczyc");
				break;
		case 2:
			
				System.out.println("odbior w lokalu Zabianka");
				System.out.println("nacisnij 5, aby zakonczyc");
				break;
		case 3:
			
				System.out.println("odbior w lokalu Wrzeszcz");
				System.out.println("nacisnij 5, aby zakonczyc");
				break;
		case 4:
			
			System.out.print("Podaj adres dostawy: ");
			address = in.next();
			System.out.println("koszt dostawy pod adres: " + address + " to 5 zl" );
			System.out.println("nacisnij 5, aby zakonczyc");
			break;
		default:
			System.out.println("Bledny wybor. Wybierz jeszcze raz");
			System.out.println("Odbiior osobisty (dostawa bezplatna): ");
			System.out.println("1: Morena");
			System.out.println("2: Zabianka");
			System.out.println("3: Wrzeszcz");
			System.out.println("Dostawa pod wybrany adres - wybierz 4");
			System.out.println("5-Zakoncz / Potwierdz zamowienie");
				
			
		}
		}
		System.out.println("Dziekujemy za skorzystanie z naszych uslug");
	}

}
