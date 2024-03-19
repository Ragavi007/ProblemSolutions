package problem_solving;
//find the Number of words in a given String , separated by space/tabspace/newlinespace
public class WordCount {

	public static void main(String[] args) {
		String str = "One Two Three\n four\tfive ";
		int state = 0;
		int w =0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == '\n' || c == '\t' || c == ' ') {
				state = 0;
			}else if(state == 0) {
				w++;
				state = 1;
			}
		}
		System.out.println(w);

	}

}
