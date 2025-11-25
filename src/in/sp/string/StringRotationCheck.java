package in.sp.string;

public class StringRotationCheck {
	
	public static boolean rotationCheck(String s1,String s2) {
		if((s1 == null || s2 == null) || (s1.length() != s2.length())) {
			return false;
		}
		String concat=s1 + s1;
		System.out.println(concat);
		if(concat.contains(s2))
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(rotationCheck("abc","cab"));

	}

}
