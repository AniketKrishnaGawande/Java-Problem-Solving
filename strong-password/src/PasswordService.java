import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PasswordService {

	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
	
	public static boolean isConsonant(char ch) {
		return ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u';
	}

	public static int passwordSimilarity(String password) {
		
		List<Character> vowelsList= password.chars().mapToObj(ch->(char)ch).filter(ch->isVowel(ch)).collect(Collectors.toList());
		List<Character> consonantsList= password.chars().mapToObj(ch->(char)ch).filter(ch->isConsonant(ch)).collect(Collectors.toList());				
		int ans=0;
		int vowelSize=vowelsList.size();
		int consonantSize=consonantsList.size();
		int i=0;
		
		if(vowelSize<consonantSize) {
			while(consonantSize!=vowelSize && i<consonantsList.size()) {
				char ch=consonantsList.get(i);
				char prevChar=ch--;
				char nextChar=ch++;
				if(isVowel(prevChar) || isVowel(nextChar)) {
					ans++;
					consonantSize--;
				}
				i++;
			}
		}
		
		else if(vowelSize>consonantSize) {
			while(consonantSize!=vowelSize && i<vowelsList.size()) {
				char ch=vowelsList.get(i);
				char prevChar=ch--;
				char nextChar=ch++;
				if(isConsonant(prevChar) || isConsonant(nextChar)) {
					ans++;
					vowelSize--;
				}
				i++;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(passwordSimilarity("azlm"));
	}
}
