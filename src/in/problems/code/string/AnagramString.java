package in.problems.code.string;

import java.util.Arrays;

public class AnagramString {
	public boolean isAnagram(String str1,String str2) {
		str1=str1.toLowerCase().replace(" ", "");
		str2=str2.toLowerCase().replace(" ", "");
		StringBuilder sb1=new StringBuilder(str1);
		StringBuilder sb2=new StringBuilder(str2);
		char[] ch1=sb1.toString().toCharArray();
		char[] ch2=sb2.toString().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}
	public static void main(String[] args) {
		
AnagramString anagramString=new AnagramString();
System.out.println(anagramString.isAnagram("Bobby", "YobbB"));
	}
}
