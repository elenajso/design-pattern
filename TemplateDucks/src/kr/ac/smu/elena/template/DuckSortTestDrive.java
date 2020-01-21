
package kr.ac.smu.elena.template;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck ducks[] = {
				new WeightSortedDUck("Han", 50),
				new WeightSortedDUck("Kim",35),
				new WeightSortedDUck("Alpha", 70),
				new WeightSortedDUck("Zoo", 60)
		};
		
		Duck ducks1[] = {
				new NameSortedDuck("Han", 50),
				new NameSortedDuck("Kim",35),
				new NameSortedDuck("Alpha", 70),
				new NameSortedDuck("Zoo", 60)
		};
		Integer nums []={ 
				new Integer(5),
				new Integer(3),
				new Integer(1),
				new Integer(7)
		};
		display(ducks);
		System.out.println("정렬합니다!");
		
		Arrays.sort(ducks);
		display(ducks);
		
		Arrays.sort(ducks1);
		display(ducks1);
		
		
		Arrays.sort(nums);
		display(nums);
	}

	private static void display(Object[] nums) {
		for (Object i : nums){
			System.out.println(i);
		}
		
	}

}
