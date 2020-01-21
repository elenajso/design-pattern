package kr.ac.smu.elena.template;

public class WeightSortedDUck extends Duck {

	public WeightSortedDUck(String name, float weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//return this.weight.compareTo(((Duck)o)).getWeight();
		float oWeight=((Duck)o).getWeight();
		if (weight>oWeight){
			return 1;
			
		}else if(weight ==oWeight){
			return 0;
		}else if(weight==oWeight){
			return -1;
		}
		
		return -2;
	}

}
