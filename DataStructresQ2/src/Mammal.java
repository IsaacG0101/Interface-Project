
public class Mammal extends Pet {
	private int numOfLegs;
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	@Override
	public void getLivingEnvironment() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Mammal [numOfLegs=" + numOfLegs + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numOfLegs;
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
		Mammal other = (Mammal) obj;
		if (numOfLegs != other.numOfLegs)
			return false;
		return true;
	}
	
	}


