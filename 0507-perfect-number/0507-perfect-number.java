class Solution {
	public boolean checkPerfectNumber(int num) {
//		System.out.println("in method");
		int num2 = 0;
		for (int i = 1; i < num; i++) {
//			System.out.println("in loop");
			if (num % i == 0) {
				num2 =num2+ i;
			}
		}
		System.out.println(num2);
		if (num == num2)
			return true;

		return false;
	}
}