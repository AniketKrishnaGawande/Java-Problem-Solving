
public class Counter {

	public static long repeatedString(String s, long n) {

		long multiplier = n / s.length();
		long cnt = s.chars().filter(ch -> ch == 'a').count();

		long ans = cnt * multiplier;
		long divisor = n % s.length();

		ans = ans + s.substring(0, (int) divisor).chars().filter(ch -> ch == 'a').count();

		return ans;
	}

}
