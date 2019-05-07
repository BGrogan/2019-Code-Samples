public class Main {
// TODO: Expand project structure

	private static String jSdkVer = "";


	public static void main(String[] args) {


		setJSdkVer();

		System.out.println(getHelloWorldMessage(getJSdk()));
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
