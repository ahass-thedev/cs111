
public class PigLatin {
	public static void main(String[] args) {
		System.out.println("Enter Phrase");
		String original = IO.readString();
		IO.outputStringAnswer(translate(original));
	}

	public static String translate(String original) {
		original = original.toLowerCase();
		if (original.startsWith("a") || original.startsWith("e") || original.startsWith("i") || original.startsWith("o")
				|| original.startsWith("u"))
			return original + "vai";
		else
			return original.substring(1, original.length()) + original.charAt(0) + "ai";
	}
}