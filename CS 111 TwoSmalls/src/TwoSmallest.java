public class TwoSmallest {

	public static void main(String[] args) {
		int counter = 0;
		double term = IO.readDouble();
		counter++;
		double input = IO.readDouble();
		double s1, s2;
		if (input != term) {
			s1 = input;
			s2 = input;
			counter++;
		} else {
			do {
				IO.reportBadInput();
				input = IO.readDouble();
			} while (input == term);
			s1 = input;
			s2 = input;
			counter++;
		}
		input = IO.readDouble();
		if (input == term) {
			do {
				IO.reportBadInput();
				input = IO.readDouble();
			} while (input == term);
			counter++;
		} else
			counter++;
		if (input < s1) {
			double temp = s1;
			s1 = input;
			s2 = temp;
		} else
			s2 = input;
		if (counter == 3) {
			input = IO.readDouble();
			while (input != term) {
				if (input < s1) {
					double temp = s1;
					s1 = input;
					s2 = temp;
				} else {
					if (input < s2)
						s2 = input;
				}
				input = IO.readDouble();
			}
		} else
		System.out.println("");
		IO.outputDoubleAnswer(s1);
		IO.outputDoubleAnswer(s2);
	}

}