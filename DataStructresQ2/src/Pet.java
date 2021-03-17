
public abstract class Pet implements Nameable {
	boolean isSafeForKids;
	
	public boolean isSafeForKids() {
		return isSafeForKids;
	}

	public void setSafeForKids(boolean isSafeForKids) {
		this.isSafeForKids = isSafeForKids;
	}

	public abstract void getLivingEnvironment();
	
}
