
public class Fish extends Pet{
	private int numberOfFins;
	public int getNumberOfFins() {
		return numberOfFins;
	}
	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}
	@Override
	public void getLivingEnvironment() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Fish [numberOfFins=" + numberOfFins + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfFins;
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
		Fish other = (Fish) obj;
		if (numberOfFins != other.numberOfFins)
			return false;
		return true;
	}
	
	}
	


