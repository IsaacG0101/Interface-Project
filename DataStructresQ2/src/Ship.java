
public abstract class Ship implements Nameable {
	public String ManufactureLocation;
	
	public String getManufactureLocation() {
		return ManufactureLocation;
	}

	public void setManufactureLocation(String manufactureLocation) {
		ManufactureLocation = manufactureLocation;
	}

	public abstract void getSize(String s);
	
}
