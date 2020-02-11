package adding;

public class AddTwoIntegerWithoutSymbolFunction {
	public int getSum(int a, int b) {
		// Easy check to see if one of them is 0
		if(a == 0){
			return b;
		}
		if(b == 0){
			return a;
		}
		
		// b will be 0 when there are no more carry
		while(b != 0){
			// & will get the position where the carry are, 1 & 1 is 1, when you add two binary, there is a carry
			int carry = a & b;
			
			// A will be the running addition result
			// XOR will act as a normal adding, cause only 0 ^ 1 or 1 ^ 0 is 1
			a = a ^ b;
			
			// b is the carries
			// Need to left shift one because we don't want the raw carry position
			// b will be 0 when there is no more carry
			b = carry << 1;
		}
		
		return a;
	}
}
