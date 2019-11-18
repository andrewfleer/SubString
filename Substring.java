public class Substring {
	static String HELLO_WORLD = "hello world!";

	public static void main(String[] args) {
		// cool way that I wrote myself
		System.out.println(customSubstring(HELLO_WORLD, 1, 5));

		System.out.println(customSubstring(HELLO_WORLD, 6, null));

		// old boring way that java does for you.
		System.out.println(HELLO_WORLD.substring(1, 5));

		System.out.println(HELLO_WORLD.substring(6));
	}

	public static String customSubstring(String string, Integer startIndex, Integer endIndex) {
		// other validation
		if (string == null)
			return null;

		// convert to char array
		char[] chars = string.toCharArray();

		// validating the end index
		if (endIndex == null)
			endIndex = chars.length - 1;
		if (endIndex > chars.length - 1)
			endIndex = chars.length - 1;

		if (startIndex == null)
			throw new RuntimeException("Cannot start with a null index");
		if (startIndex > chars.length - 1)
			throw new RuntimeException("Cannot start with an index larger than the length of the string");

		if (startIndex > endIndex)
			throw new RuntimeException("Cannot do reverse substrings....yet?");

		String returnString = "";
		// now do work
		for (int i = startIndex; i <= endIndex; i++) {
			returnString += chars[i];
		}

		return returnString;
	}
}
