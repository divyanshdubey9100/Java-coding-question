package in.sp.string;

public class ReverseAString {
	
	public static String reverseString(String str) {
		String newStr="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.length() > 0) {
				newStr =newStr + str.charAt(i);
			}
		}
		System.out.println(str+" isPalindrom " +isPalindrom(str,newStr));
		return newStr;
	}

	private static boolean isPalindrom(String str, String newStr) {
		if(str.equals(newStr)) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println(reverseString("racecar"));

	}

}
