public class LuckySevens
{
	public static void main(String[] args)
	{
		System.out.println("Low num");
		int lowerEnd = IO.readInt();
		System.out.println("Upper num");
		int higherEnd = IO.readInt();
		if (higherEnd < lowerEnd) {
			IO.outputIntAnswer(-1);
			IO.reportBadInput();
			return;
		}
		int counter = 0;
		String container = "";
		int stringLength = 0;
		for (int i = lowerEnd; i <= higherEnd; i++) {
			container = Integer.toString(i);
			stringLength = container.length();
			for (int j = 0; j < stringLength; j++)
				if ((container.charAt(j)) == '7')
					counter = counter + 1;
			if (i == higherEnd)
				IO.outputIntAnswer(counter);
		}
	}
}