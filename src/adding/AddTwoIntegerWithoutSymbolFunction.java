package adding;

public class AddTwoIntegerWithoutSymbolFunction {
	public int getSum(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}

		// Until we have no more carry
		while (b != 0) {
			// & is only 1 when both are 1, to see the position we need carry
			int carry = a & b;

			// XOR with can't be 00 or 11, simulating addition and store it in a
			a = a ^ b;

			// b hold carry, Make carry move to the left for the next iteration
			// everytime
			b = carry << 1;
		}

		return a;
	}
}
