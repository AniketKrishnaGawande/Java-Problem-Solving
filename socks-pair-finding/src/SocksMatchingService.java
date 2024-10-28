import java.util.Collections;
import java.util.List;

public class SocksMatchingService {

	public static int findSocksPair(int n, List<Integer> socks) {
		Collections.sort(socks);
		int i = 0;
		int pairs = 0;
		while (i < n - 1) {
			if (socks.get(i).equals(socks.get(i + 1))) {
				pairs++;
				i = i + 2;
			} else {
				i++;
			}

		}
		return pairs;
	}

}
