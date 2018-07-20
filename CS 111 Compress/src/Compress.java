public class Compress {
	public static void main(String[] args) {
		System.out.println("Input");
		String original = IO.readString();
		original = compress(original);
		IO.outputStringAnswer(original);
	}
	public static String compress(String original) {
		String answer = "";
		for (int i = 0; i < original.length(); i++) {
			char currentChar = original.charAt(i);
			int currentCharCount = 1;
			while ((i + 1) < original.length() && original.charAt(i) == original.charAt(i + 1)) {
				currentCharCount++;
				i++;
			}
			if (currentCharCount > 1) {
				answer = answer + String.valueOf(currentCharCount) + String.valueOf(currentChar);
			} else {
				answer = answer + String.valueOf(currentChar);
			}
		}
		return answer;
	}
}