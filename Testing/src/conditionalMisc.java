import java.util.Random;

public class conditionalMisc {

	public static void main(String[] args) {
		int arr[] = { 11, 9, 8, 100, 111, 103, 43};
		swapXandY(10, 100);
		doubleEquals(10, 100, 1e-6);
		System.out.println(simulatedDie());
		System.out.println(maxNum(11, 9, 8));
		System.out.println(maxNumArr(arr));
		rockPaperScissors("rock", "scissors");
		collatzConjecture(5);
		System.out.println();
		System.out.println(averageArr(arr));
	}

	static void swapXandY(int x, int y) {
		int temp = 0;
		temp = y;
		y = x;
		x = temp;
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}

	static void doubleEquals(double first, double second, double toler) {
		double tolerance = Math.abs(first - second);
		if (tolerance >= toler) {
			System.out.println("The numbers are not within specified tolerance");
		} else
			System.out.println("The numbers are within tolerance");
	}

	static int simulatedDie() {
		Random rand = new Random();
		int die1 = rand.nextInt(6) + 1;
		int die2 = rand.nextInt(6) + 1;
		return die1 + die2;

	}

	static int maxNum(int first, int second, int third) {
		int max = 0;
		if (first > second && first > third) {
			max = first;
		} else if (second > third && second > first) {
			max = second;
		} else if (third > second && third > second) {
			max = third;
		} else {
			System.out.println("There is an error in the input");
		}
		return max;
	}

	static int maxNumArr(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static void rockPaperScissors(String player1, String player2) {
		player1 = player1.toLowerCase();
		player2 = player2.toLowerCase();
		if ((player1.equals("rock") && player2.equals("rock"))
				|| (player1.equals("scissors") && player2.equals("scissors")
						|| (player1.equals("paper") && player2.equals("paper")))) {
			System.out.println("It is a tie");
		} else if (player1.equals("rock") && player2.equals("paper")) {
			System.out.println("Player 2 won");
		} else if (player2.equals("rock") && player1.equals("paper")) {
			System.out.println("Player 1 won");
		} else if (player1.equals("scissors") && player2.equals("paper")) {
			System.out.println("Player 1 won");
		} else if (player2.equals("scissors") && player1.equals("paper")) {
			System.out.println("Player 2 won");
		} else if (player1.equals("rock") && player2.equals("scissors")) {
			System.out.println("Player 1 won");
		} else if (player2.equals("rock") && player1.equals("scissors")) {
			System.out.println("Player 2 won");
		}
	}

	static void collatzConjecture(int n) {
		while (n != 1) {
			System.out.print(n + " -->");
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n * 3) + 1;
			}
		}
		System.out.print(n);
	}

	// implement user input
	public static double averageArr(int[] arr) {
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return (double) total / arr.length;
	}

	public static double averageLoop() {

		return (Double) null;
	}
}