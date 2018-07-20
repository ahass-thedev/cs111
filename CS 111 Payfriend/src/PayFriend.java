public class PayFriend {

	public static void main(String[] args) {
		double fee = 0;
		System.out.println("How much are you paying?");
		double money = IO.readDouble();

		if (money <= 100)
			fee = 5;
		else if (money > 100 && money < 1000)
			if (money * .03 > 6)
				fee = money * .03;
			else
				fee = 6;
		else if (money >= 1000 && money < 10000)
			if (money * .01 > 15)
				fee = money * .01;
			else
				fee = 15;
		else if (money >= 10000)
			if (money >= 15000)
				fee = 10000 * .01 + 5000 * .02 + (money - 15000) * .03;
			else
				fee = 10000 * .01 + (money - 10000) * .02;
		IO.outputDoubleAnswer(fee);
	}
}