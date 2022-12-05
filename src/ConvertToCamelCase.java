import java.lang.StringBuilder;
import java.util.Arrays;

/*

Complete the method/function so that it converts dash/underscore
delimited words into camel casing.

The first word within the output should be capitalized only 
if the original word was capitalized (known as Upper Camel Case, 
also often referred to as Pascal case). 

The next words should be always capitalized.

*/
public class ConvertToCamelCase {

	static String toCamelCase(String s) {
		String[] str = s.split("[-,_]");
		System.out.println(Arrays.toString(str));
		StringBuilder res = new StringBuilder();
		
		res.append(str[0]);
		for (int i=1; i<str.length; i++) {
			res.append(str[i].substring(0,1).toUpperCase());
			res.append(str[i].substring(1));
		}
		
		return res.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toCamelCase("the-stealth-warrior"));

	}

}
