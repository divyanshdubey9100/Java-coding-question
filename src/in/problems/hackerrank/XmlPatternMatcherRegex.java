package in.problems.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlPatternMatcherRegex {

	public static String getStringFromXml(String in) {
		String regex = "<([^<>]+)>[^<>]*</\\1>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(in);
		if (matcher.matches()) {
			return "valid" +in;
		}
		return "invalid xml tag " + in;
	}

	public static void main(String[] args) {
		String[] str = { 
					"<h1>Nayeem loves counseling</h1>", 
					"<h1><h1>Sanjay has no watch</h1>",
					"</h1><par>So wait for a while</par>", 
					"<Amee>safat codes like a ninja</amee>",
					"<SA premium>Imtiaz has a secret crush</SA premium>" 
				};
		for (String s : str) {
			System.out.println(getStringFromXml(s));
		}
	}
}