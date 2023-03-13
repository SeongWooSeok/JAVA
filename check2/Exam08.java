package check2;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator{
	
	int value;
	
	public Calculator() {
		this.value= 0;
	}
	
	void add(int val) {
		this.value += val;
	}
	
	int getValue() {
		return value;
	}
	
	boolean isEven(int value) {
		if(value==0 || value%2==1) {
			return false;
		}else{
			return true;
		}
	}
	
	int avg(int[] data) {
		int sum = 0;
		int avg = 0;
		for(int i =0; i<data.length; i++ ) {
			sum+=data[i];
		}
		avg = sum/data.length;
		return avg;
		
	}
	
	int avg(ArrayList<Integer> data) {
		int sum = 0;
		for(int o : data) {
			sum+=o;
		}
		return sum/data.size();
	}
}

class UpgradeCalculator extends Calculator{
	void minus(int val) {
		this.value -= val;
	}
}

class MaxLimitCalculator extends Calculator{
	int max;
	
	public MaxLimitCalculator(int max) {
		this.max=max;
	}

	@Override
	void add(int val) {
		this.value += val;
		if(this.value > max) {
			this.value=max;
		}
	}

	
	/*@Override
	int getValue() {
		if(value>max) {
			return -1;
		}else {
			return value;
		}
	}*/
	
}

public class Exam08 {
	public static void main(String[] args) {
			Calculator cal1 = new Calculator();
			cal1.add(10);
			System.out.println(cal1.getValue()); //
			UpgradeCalculator cal2 = new UpgradeCalculator();
			cal2.add(10);
			cal2.minus(3);
			System.out.println(cal2.getValue()); //7
			
			MaxLimitCalculator cal3 = new MaxLimitCalculator(100);
			cal3.add(50);
			cal3.add(60);
			System.out.println(cal3.getValue());
			
			Calculator cal4 = new Calculator();
			System.out.println(cal4.isEven(3));//짝수여부 판단 false
			System.out.println(cal4.isEven(4));//짝수여부 판단 true
			System.out.println(cal4.isEven(0));//짝수여부 판단 false
			
			Calculator cal5 = new Calculator();
			
			int[] data1 = {1,3,5,7,9};
			System.out.println(cal5.avg(data1)); //5
			
			ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
			System.out.println(cal5.avg(data2)); //5
			
			
			
			
			
			
			
			
			
			
			
	}
}
