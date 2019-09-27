package groups.police;

public class RainbowPoliceDepartment {
	// The Rainbow Police Department restricts color usage to the general public.
	// Laws are stated, and must be enforced.

	public static void detain(String color) {
		int totalColorCount = 0;
		String tmpColor = color;

		while (tmpColor.contains("|")) {
			tmpColor = tmpColor.substring(0, tmpColor.indexOf("|"));
			totalColorCount++;
		}

		if (!(totalColorCount > 0)) {
			System.out.println("Police Report: We have detected " + totalColorCount + " colors today.");
		} else {
			//Nothing to report.
		}

		for (int i = 0; i < color.length(); i++) {
			if (color.contains("|")) {

			}
		}


		//Laws: These colors are illegal:
		String[] arrestLaws = {"blue", "red", "turquoise", "lime"};

		for (int i = 0; i < arrestLaws.length; i++) {
			if (color.toLowerCase().contains(arrestLaws[i])) {
				attemptArrest(arrestLaws[i]);
			}
		}
	}

	private static void attemptArrest(String arrestLaw) {

		double officerFumble = Math.random();
		//System.out.println(officerFumble);

		System.out.println("Arrest Warrant: The " + arrestLaw + " Police have detected a " + arrestLaw + " violation.");
	}
}
