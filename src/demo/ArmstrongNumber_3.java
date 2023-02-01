package Arrays;

public class ArmstrongNumber_3 {
	public static void main(String[] args) {
		int num = 371;
		System.out.println(checkArmstromngNum(num));

	}

	public static boolean checkArmstromngNum(int num) {
		int j = num;
		int sum = 0;
		int noOfDigits = counter(num);
		while (num > 0) {
			int rem = num % 10;
			sum = (int) (sum + Math.pow(rem, noOfDigits));
			num = num / 10;
		}
		System.out.println(sum);
		return sum == j;
	}

	public static int counter(int num) {
		int counter = 0;
		while (num > 0) {
			num = num / 10;
			counter++;
		}
		return counter;
	}
}
