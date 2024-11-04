import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CloudGame {

	public static int activityNotifications(List<Integer> expenditure, int d) {
		int notificationCnt = 0;

		for (int i = d; i < expenditure.size(); i++) {
			int median = 0;
			int num = d / 2;
			List<Integer> expHistory = expenditure.subList(i - d, i - 1);
			Collections.sort(expHistory);
			if (d % 2 == 0) {
				median = expHistory.get(num) + expHistory.get(num - 1) / 2;
			} else {
				median = expHistory.get(num);
			}
			if (expenditure.get(i) >= (2 * median))
				notificationCnt++;

		}

		return notificationCnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());

		int result = JumpingService.jumpingOnClouds(c);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
