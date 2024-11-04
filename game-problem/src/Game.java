
public class Game {

	public static String playGame(String str) {
		int wScore = 0;
		int bScore = 0;
		int i = 0;
		int n = str.length();
		while (i < n) {
			int j = i;
			int c = 0;

			while (j < n && str.charAt(i) == str.charAt(j)) {
				j++;
				c++;
			}

			if (c > 2) {
				if (str.charAt(i) == 'w')
					wScore = wScore + c - 2;
				else
					bScore = bScore + c - 2;
			}

			i = j;
		}

		if (wScore > bScore)
			return "W";
		else
			return "B";

	}

	public static void main(String[] args) {
		System.out.println(playGame("wwwbbbwwwb"));
	}
}
