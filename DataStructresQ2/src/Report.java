

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish f = new Fish();
		Mammal m = new Mammal();
		CruiseShip c = new CruiseShip();
		CargoShips s = new CargoShips();
		
		c.setManufactureLocation("Lousiana");
		s.setManufactureLocation("Miami");
		m.setSafeForKids(true);
		f.setSafeForKids(false);
		showName(m);
		showName(f);
		showName(s);
		showName(c);
		
		
	}

	private static void showName(Nameable o) {
		// TODO Auto-generated method stub
		System.out.println(o);
	}
	
	private static <T extends Nameable> void showNameGeneric(T string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

}
