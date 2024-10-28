
public class CounterService {

	public static int valleyCounter(int steps, String path) {

		int seaLevel = 0;
		int valleys = 0;

		char[] stepsArray = path.toCharArray();
		for (char step : stepsArray) {
			if (step == 'D') {
				seaLevel--;

			} else if (step == 'U') {
				seaLevel++;
				if (seaLevel == 0)
					valleys++;
			}

		}

		return valleys;

	}

}
