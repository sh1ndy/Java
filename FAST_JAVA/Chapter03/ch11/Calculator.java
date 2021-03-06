package ch11;

public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	public abstract int multiple(int num1, int num2);

	public abstract int divide(int num1, int num2);
	
}
