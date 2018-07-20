public class WordCount {
	public static void main(String args[]) {

		int answer = 0;

		System.out.println("Enter sentence:");
		String original = IO.readString();
		System.out.println("max length:");
		int minLength = IO.readInt();
		System.out.println();

		answer = countWords(original, minLength);
		IO.outputIntAnswer(answer);
	}

	public static int countWords(String original, int maxLength) {
		String words[] = original.trim().split(" ");
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (getLetterCount(words[i]) <= maxLength)
				count++;
		}
		return count;
	}

	public static int getLetterCount(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (!Character.isDigit(word.charAt(i)) && word.charAt(i) != ' ' && Character.isLetter(word.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}