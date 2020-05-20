package typeinfo.pets;

public class Individual {
	int count=0;
	int id() {
		return count++;
	}
	public Individual() {}
	public Individual(String name) {System.out.println(name);}
	@Override
	public String toString() {
		return "Individual [count=" + count + "]";
	}
	
}
