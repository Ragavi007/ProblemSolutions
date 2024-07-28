package gfg_Solutions;

public class Leap_Year {
	static int isLeap(int N){
		if(N%100 == 0) {
			if(N%400 == 0) {
				return 1;
			}else {
				return 0;
			}
			
		}else {
			if(N%4 == 0) {
				return 1;
			}else {
				return 0;
			}
		}
	}

/*	public static void main(String[] args) {
		Leap_Year o = new Leap_Year();
		int N = 1978;
		System.out.println(o.isLeap(N));

	}
	*/

}
