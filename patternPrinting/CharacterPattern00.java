package patternPrinting;

public class CharacterPattern00 {
/*	A 
	A B 
	A B C 
	A B C D 
    A B C D E
    */
	public static void printa(int n) {
		for(int i = 1;i<=n;i++) {
			for(char ch = 'A';ch<'A'+i;ch++) {
				System.out.print(ch+ " ");
			}
			System.out.println();
		}
		System.out.println();
		}
/*	A B C D E
	A B C D
	A B C
	A B
	A
	*/
	public static void printb(int n) {
		for(int i = n;i>=0;i--) {
			for(char ch = 'A';ch<'A'+i;ch++) {
				System.out.print(ch+ " ");
			}
			System.out.println();
		}
		System.out.println();
		}
/*  A 
	B B 
	C C C 
	D D D D 
	E E E E E

*/	public static void printc(int n) {
		for(int i = 1;i<=n;i++) {
			for(char ch ='A';ch<'A'+i;ch++) {
				System.out.print((char)('A'+i-1)+ " ");
			}
			System.out.println();
		}
		System.out.println();
		}
   
    
   public static void main(String[] args) {
      	int n = 5;
        printa(5);
        printb(5);
        printc(5);
}	

}
