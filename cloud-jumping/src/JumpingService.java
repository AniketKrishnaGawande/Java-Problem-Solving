import java.util.List;

public class JumpingService {

	public static int jumpingOnClouds(List<Integer> c) {
		int jumps = 0; // To count the number of jumps
		        int i = 0; // Current position in the array

		        while (i < c.size() - 1) {
		            // Try to jump two clouds if it's safe (not a thunderhead)
		            if (i + 2 < c.size() && c.get(i+2) == 0) {
		                i += 2;
		            } else {
		                i += 1;
		            }
		            jumps++;
		        }
		        return jumps;
		    }
}
