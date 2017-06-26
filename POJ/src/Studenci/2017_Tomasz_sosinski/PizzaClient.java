import java.util.ArrayList;

public class PizzaClient {

	public static void main(String[] args) {
		
		  ArrayList<Order> placek = new ArrayList<>();
		  placek.add(new Order(new WegeCreate()));
		  placek.add(new Order(new CapriCreate()));
		  placek.add(new Order(new PeppeCreate()));
		 
		  Destination.mDestination();
	        
	    }

	}


