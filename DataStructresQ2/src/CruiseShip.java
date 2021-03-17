
public class CruiseShip extends Ship {
	private int passengerCapacity;
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	@Override
	public void getSize(String s) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "CruiseShip [passengerCapacity=" + passengerCapacity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + passengerCapacity;
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
		CruiseShip other = (CruiseShip) obj;
		if (passengerCapacity != other.passengerCapacity)
			return false;
		return true;
	}
	
	}


