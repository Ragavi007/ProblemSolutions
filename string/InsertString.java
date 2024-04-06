package string;

public class InsertString {
	public static String insertString(String origiString,String insertString,int index) {
		StringBuffer newString = new StringBuffer(origiString);
		newString.insert(index + 1,insertString);
		
		return newString.toString();
		
	}

	public static void main(String[] args) {
		String origiString = "My Name is";
		String insertString = " Raga";
		int index = 9;
		
		System.out.println("Original String: " + origiString); 
        System.out.println("String to be inserted: " +insertString); 
        System.out.println("String to be inserted at index: "+ index); 
        
		System.out.println("Modified String: "+ insertString(origiString,insertString,index));
		
 
	}

}
