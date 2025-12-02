package in.problems.code.string;


public class StringCustomReplace {
	
	public  static String replaceChar(String inputStr,char target,char replace) {
		StringBuilder result=new StringBuilder();
	for(int i=0;i<inputStr.length();i++) {	
		if(inputStr.charAt(i)== target) {
			result.append(replace);
		}else {
			result.append(inputStr.charAt(i));
		}
	}
	return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(replaceChar("hello", 'l', 'x'));

	}

}
