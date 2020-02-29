public class Animal {

	String name;
	int legs;
	
	public int getLegs() {
		return this.legs;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.legs;
	}
}
