package firstPackage;

public class Calculator {
	public static final int ADD = 0;
	public static final int SUB = 1;
	public static final int MULT = 2;
	public static final int DIV = 3;
	
	private int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	private int subtract(int a, int b) {
		int result = a - b;
		return result;
	}
	
	private int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	private
	int divide(int a, int b) {
		int result = a / b;
		return result;
	}
	
	public int calculate(int[] instructions) {
		int retVal = 0;
		int currentInstruction = 0;
		int[] nums = new int[(instructions.length + 1)/2];
		for(int i = 0; i < instructions.length; i ++) {
			if(i % 2 == 1 & i != 0) {
			} else if(i % 2 == 0){
				nums[i/2] = instructions[i];
			} 
		}
		for(int i = 0; i < instructions.length; i ++) {
			if(i % 2 == 1) {
				//odd
				currentInstruction = instructions[i];
			} else if(i % 2 == 0 & i != 0){
				//even
				if(currentInstruction == Calculator.ADD){
					retVal = this.add(retVal, nums[i/2]);
				} else if(currentInstruction == Calculator.SUB){
					retVal = this.subtract(retVal, nums[i/2]);
				} else if(currentInstruction == Calculator.MULT){
					retVal = this.multiply(retVal, nums[i/2]);
				} else if(currentInstruction == Calculator.DIV){
					retVal = this.divide(retVal, nums[i/2]);
				}
			} else if(i == 0) {
				retVal = instructions[i];
			}
		}
		
		return retVal;
	}
}
