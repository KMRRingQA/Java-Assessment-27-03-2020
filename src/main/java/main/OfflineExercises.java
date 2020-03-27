package main;

public class OfflineExercises {

	public int amISearch(String input) {
		int length = input.length();
		String amIAm = "";
		int counter = 0;
		input = "  " + input + "  ";
		for (int i = 0; i < length + 1; i++) {
			amIAm = input.substring(i, i + 4);
			System.out.println(amIAm);
			if (amIAm.equalsIgnoreCase(" am ")) {
				System.out.println("found you");
				counter++;
			}
		}
		return counter;
	}

	public boolean endsDev(String input) {
		int length = input.length();
		String isDev = "";
		if (length < 3) {
			return false;
		}
		isDev = input.substring(length - 3, length);
		if (isDev.equalsIgnoreCase("dev")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean evenlySpaced(int a, int b, int c) {
		if (a + b == 2 * c || a + c == 2 * b || b + c == 2 * a) {
// rearranged some stuff. this holds true only when, and always if, the spacing is equal.
			return true;
		} else {
			return false;
		}
	}

	public String fizzBuzz(int arg1) {
		if (arg1 % 15 == 0) {
			// more efficient than %5==0 && %3==0
			return "fizzbuzz";
		} else if (arg1 % 3 == 0) {
			return "fizz";
		} else if (arg1 % 5 == 0) {
			return "buzz";
		} else {
			return null;
		}
	}

	public String getBert(String input) {
		int length = input.length();
		int bert1 = -1;
		int bert2 = -1;
		String empty = "";
		if (length >= 4) {
			for (int i = 0; i < length - 3; i++) {
				String isItBert = (input.substring(i, i + 4));
				if (isItBert.equalsIgnoreCase("Bert")) {
					if (bert1 == -1) {
						bert1 = i;
					} else {
						bert2 = i;
					}
				}
			}
			if (bert1 == -1 || bert2 == -1) {
				return empty;
			} else {
				String reversedMessage = input.substring(bert2 - 1, bert2);
				for (int i = bert2 - 1; i > bert1 + 4; i--) {
					reversedMessage = reversedMessage + input.substring(i - 1, i);
				}
				return reversedMessage;
			}
		} else {
			return empty;
		}
	}

	public int largest(String arg1) {
		int length = arg1.length();
		String addSpace = " " + arg1 + " ";
		int space1 = 0;
		int space2 = 0;
		int maxSum = 0;
		int currentSum = 0;
		String isolatedNumber = " ";
		for (int i = 1; i < length + 2; i++) {
			if (addSpace.substring(i, i + 1).equals(" ")) {
				space2 = i;
				isolatedNumber = addSpace.substring(space1 + 1, space2);
				System.out.println(isolatedNumber);
				for (int j = 0; j < isolatedNumber.length(); j++) {
					int integerValue = Integer.parseInt(isolatedNumber.substring(j, j + 1));
					currentSum += integerValue;
				}
				if (currentSum > maxSum) {
					maxSum = currentSum;
				}
				space1 = i;
				currentSum = 0;
			}
		}
		return maxSum;
	}

	public String multChar(String input) {
		int length = input.length();
		String string = input.substring(0, 1) + input.substring(0, 1) + input.substring(0, 1);
		for (int i = 1; i < length; i++) {
			string = string + input.substring(i, i + 1) + input.substring(i, i + 1) + input.substring(i, i + 1);
		}
		return string;
	}

	public String nMid(String input, int a) {
		int length = input.length();
		int oddCenter = 0;
		String newString = "";
		if (a % 2 == 1) {
			int oddRemoveFromCenter = (a - 1) / 2;
			oddCenter = (length - 1) / 2;
			newString = input.substring(0, oddCenter - oddRemoveFromCenter)
					+ input.substring(oddCenter + oddRemoveFromCenter + 1, length);
			return newString;
		} else {
			int evenRemoveFromCenter = a / 2;
			newString = input.substring(0, length / 2 - evenRemoveFromCenter)
					+ input.substring(length / 2 + evenRemoveFromCenter, length);
			return newString;
		}
	}

	public int superBlock(String input) {
		String currentChar = "";
		String lastChar = "";
		// technically not a Char but String holding 1 char.
		int currentCounter = 1;
		int currentMax = 1;
		int length = input.length();
		if (length == 0) {
			return 0;
		}
		for (int i = 0; i < length; i++) {
			currentChar = input.substring(i, i + 1);
			if (currentChar.equals(lastChar)) {
				currentCounter++;
				if (currentCounter > currentMax) {
					currentMax = currentCounter;
				}
			} else {
				lastChar = currentChar;
				currentCounter = 1;
			}
		}
		return currentMax;

	}

}
