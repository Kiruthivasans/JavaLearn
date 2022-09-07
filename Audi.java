package abstarctAndInterface;

public class Audi extends Car{

	@Override
	public void engineSecret() {
		System.out.println("5 Star stroke engine");
	}

	@Override
	public void price() {
		System.out.println("130000 on road");
		
	}

	
	
	public static void main(String[] args) {
		Audi a=new Audi();
		a.engineSecret();
		a.price();
		a.setPollutionControl();
		
	}

	
}
