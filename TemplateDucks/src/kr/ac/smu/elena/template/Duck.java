package kr.ac.smu.elena.template;

public abstract class Duck implements Comparable{
	float weight;
	String name;
	
	
	
	public Duck(String name, float weight){
		this.name= name;
		this.weight=weight;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�̸�: " +name+ ", ������: "+weight;
	}
	public String getName(){
		return name;
	}
	public float getWeight(){
		return weight;
	}

	
}
