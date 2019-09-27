package groups;

public class colors {
	public static String delimitedColors(String aryColors) {
		// friendly color managing method. Returns a pipe delimited list of colors.

		return delimitWithBars(aryColors.toString());
	}

	private static String delimitWithBars(String strDelimitedColors) {
		// takes a String and decides if it should recieve a | delimiter or not

		if (strDelimitedColors.isEmpty()) {
			return strDelimitedColors = "strToDelimit";
		} else {
			return strDelimitedColors += "|";
		}

	}
}
