
public class CargoShips extends Ship {
	private double tonsOfCargo;
	
	public double getTonsOfCargo() {
		return tonsOfCargo;
	}
	public void setTonsOfCargo(double tonsOfCargo) {
		this.tonsOfCargo = tonsOfCargo;
	}
	@Override
	public void getSize(String s) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "CargoShips [tonsOfCargo=" + tonsOfCargo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(tonsOfCargo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CargoShips other = (CargoShips) obj;
		if (Double.doubleToLongBits(tonsOfCargo) != Double.doubleToLongBits(other.tonsOfCargo))
			return false;
		return true;
	}
	
	
	

}
