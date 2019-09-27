import groups.colors;
import groups.police.RainbowPoliceDepartment;
import java.util.Iterator;
import java.util.List;

class Main {
	private static String jSdkVer = "";

	public static void main(String[] args) {

		List<List<Integer>> optimalRoute = null;
		//optimalRoute = [[2,1]];
		setJSdkVer();

		//System.out.println(getHelloWorldMessage(getJSdk()));

		String[] aryColors = new String[]{"red", "blue", "green"};
		String colors = "";

		for (int i=0; i < aryColors.length; i++) {
			colors += (groups.colors.delimitedColors(aryColors[i]));
		}

		//System.out.println("Do you like colors? These are some of the greatest:");

		groups.police.RainbowPoliceDepartment.detain(colors);

		//System.out.println("(The original colors were: " + colors + ").");

	}


	public static String getHelloWorldMessage(String theAmazingReturnedText) {

		setJSdkVer();

		return "FirstClassTest start - Basic java command line app. Java SDK " + theAmazingReturnedText;
	}

	private static void setJSdkVer() {

		// critical variable declaration for 12.01
		int zero = 0;
		int one = 1;
		int two = 2;

		jSdkVer = jSdkVer + String.valueOf(one) + String.valueOf(two) + "." + String.valueOf(zero) + String.valueOf(one);
	}


	public static String getJSdk() {

		return jSdkVer;
	}


}
