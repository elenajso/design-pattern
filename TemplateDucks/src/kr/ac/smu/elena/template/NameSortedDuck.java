package kr.ac.smu.elena.template;

public class NameSortedDuck extends Duck{

	public NameSortedDuck(String name, float weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Object o) {

		return this.name.compareTo(((Duck)o).getName());
	}
	

}
