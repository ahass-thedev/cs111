
public class stringPractice {

	public static void main(String[] args) {
		System.out.println(backwardsWord("hello"));
		System.out.println(switchNames("Ahmed Hassanein"));
		System.out.println(stringMath("10 * 10"));
		System.out.println(spaceMath("     11       *     10     "));
		System.out.println(camelCase("number_of_students"));
	}

	static String backwardsWord(String word) {
		String temp = "";
		for (int i = 0; i < word.length(); i++) {
			temp = word.charAt(i) + temp;
		}
		return temp;
	}

	static String switchNames(String name) {
		String firstName = "";
		String lastName = "";
		int index = name.indexOf(" ");
		firstName = name.substring(0, index);
		lastName = name.substring(index + 1, name.length());
		return lastName + " , " + firstName;
	}

	static int stringMath(String operation) {
		int answer = 0;
		int firstNum = 0;
		int secondNum = 0;
		int index = 0;
		for (int i = 0; i < operation.length(); i++) {
			if (operation.charAt(i) == '*') {
				index = operation.indexOf('*');
				firstNum = Integer.parseInt(operation.substring(0, index - 1));
				secondNum = Integer.parseInt(operation.substring(index + 2, operation.length()));
				answer = firstNum * secondNum;
			} else if (operation.charAt(i) == '/') {
				index = operation.indexOf('/');
				firstNum = Integer.parseInt(operation.substring(0, index - 1));
				secondNum = Integer.parseInt(operation.substring(index + 2, operation.length()));
				answer = firstNum / secondNum;
			} else if (operation.charAt(i) == '+') {
				index = operation.indexOf('+');
				firstNum = Integer.parseInt(operation.substring(0, index - 1));
				secondNum = Integer.parseInt(operation.substring(index + 2, operation.length()));
				answer = firstNum + secondNum;
			} else if (operation.charAt(i) == '-') {
				index = operation.indexOf('-');
				firstNum = Integer.parseInt(operation.substring(0, index - 1));
				secondNum = Integer.parseInt(operation.substring(index + 2, operation.length()));
				answer = firstNum - secondNum;
			}
		}

		return answer;
	}

	// failed attempt at ignoring space in string operation
	static int ignoreSpaceMath(String operation) {
		int answer = 0;
		int firstNum = 0, secondNum = 0;
		int operatorIndex = 0, startIndex = 0, endIndex = 0, preOpIndex = 0, postOpIndex = 0;
		// start index
		for (int i = 0; i < operation.length(); i++) {
			if (operation.charAt(i) != ' ') {
				startIndex = i;
				break;
			}
		}
		// end index
		for (int i = 0; i < operation.length(); i++) {
			if (operation.charAt(i) != ' ') {
				endIndex = i;
			}
		}
		// preOperator index

		// operator index and calculating
		for (int i = 0; i < operation.length(); i++) {
			if (operation.charAt(i) == '*') {
				operatorIndex = operation.indexOf('*');
				// firstNum = Integer.parseInt(operation.substring(startIndex,
				// index - 1));
				// secondNum = Integer.parseInt(operation.substring(index + 2,
				// endIndex);
				answer = firstNum * secondNum;
			} else if (operation.charAt(i) == '/') {
				operatorIndex = operation.indexOf('/');
				answer = firstNum / secondNum;
			} else if (operation.charAt(i) == '+') {
				operatorIndex = operation.indexOf('+');
				answer = firstNum + secondNum;
			} else if (operation.charAt(i) == '-') {
				operatorIndex = operation.indexOf('-');
				answer = firstNum - secondNum;
			}
		}
		return answer;
	}

	static int spaceMath(String operation) {
		int answer = 0;
		int index = 0;
		int firstNum = 0, secondNum = 0;
		operation = operation.replaceAll(" ", "");
		for (int i = 0; i < operation.length(); i++) {
			if (operation.charAt(i) == '*') {
				index = operation.indexOf('*');
				firstNum = Integer.parseInt(operation.substring(0, index));
				secondNum = Integer.parseInt(operation.substring(index + 1, operation.length()));
				answer = firstNum * secondNum;
			} else if (operation.charAt(i) == '/') {
				index = operation.indexOf('/');
				firstNum = Integer.parseInt(operation.substring(0, index - 1));
				secondNum = Integer.parseInt(operation.substring(index + 1, operation.length()));
				answer = firstNum / secondNum;
			} else if (operation.charAt(i) == '+') {
				index = operation.indexOf('+');
				firstNum = Integer.parseInt(operation.substring(0, index - 1));
				secondNum = Integer.parseInt(operation.substring(index + 1, operation.length()));
				answer = firstNum + secondNum;
			} else if (operation.charAt(i) == '-') {
				index = operation.indexOf('-');
				firstNum = Integer.parseInt(operation.substring(0, index - 1));
				secondNum = Integer.parseInt(operation.substring(index + 1, operation.length()));
				answer = firstNum - secondNum;
			}
		}
		return answer;
	}
//figure out how to not make the first letter capital
	static String camelCase(String phrase) {

		String camelCase = "";

		for (int i = 0; i < phrase.length(); i++) {
			char character = phrase.charAt(i);
			char capitalize = Character.toUpperCase(character);

			if (i == 0 || phrase.charAt(i - 1) == '_')
				camelCase += capitalize;
			else
				camelCase += character;
		}

		camelCase = camelCase.replaceAll("_", "");
		return camelCase;
	}
}
