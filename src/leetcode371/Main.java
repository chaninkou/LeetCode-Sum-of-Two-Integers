package leetcode371;

public class Main {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		System.out.println("A: " + a + " + B: " + b);
		
		AddTwoIntegerWithoutSymbolFunction solution = new AddTwoIntegerWithoutSymbolFunction();
		
		System.out.println("Soluton: " + solution.getSum(a, b));
	}
}
