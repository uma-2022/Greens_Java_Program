package org.string_all.prac;

public class String_All {
	public static void main(String[] args) {
		String s1="PArtial Abstraction abstract";
		String s2="   fully Abstraction   ";
		String s3="";
		String s4="Welcome to Automation Teting";
		
		int length1 = s1.length();
		System.out.println("1.Length of the String:"+length1+'\n');
		
		boolean equals1 = s1.equals(s2);
		System.out.println("2.String is Equal?     "+equals1+'\n');
		
		boolean ignore1 = s2.equalsIgnoreCase(s1);
		System.out.println("3.String case is ignore!    "+ignore1+'\n');
		
		String upper1 = s1.toUpperCase();
		System.out.println("4.Upper Case!    "+upper1+'\n');
		
		String lower1 = s1.toLowerCase();
		System.out.println("5.String Lower!"    +lower1+'\n');
	
		char charat1 = s1.charAt(1);
		System.out.println("6.Char At 1st Position:   "+charat1+'\n');
		
		int indexof1 = s1.indexOf("i");
		System.out.println("7.Index of 1st Position:    "+indexof1+'\n');
		
		int lastindex1 = s1.lastIndexOf("i");
		System.out.println("8.Index of  'i'in  last Position:   "+lastindex1+'\n');
		
		boolean contains1 = s2.contains("act");
		System.out.println("9.Contains This String?    "+contains1+'\n');
		
		boolean startsWith1 = s2.startsWith("fully");
		System.out.println("10. string starts with:   "+startsWith1+'\n');
		
		boolean endswith1 = s1.endsWith("on");
		System.out.println("11. string ends with:   "+ endswith1+'\n');
		
		String trim1 = s2.trim();
		System.out.println("12. Trim: "+trim1+'\n');
		
		String replace1 = s1.replace("Abstraction","Interface"+'\n');
		System.out.println("13.Replace:   "+replace1);
		
		String concat1 = s1.concat(s2);
		System.out.println("14.Concatenation:    "+concat1+'\n');
		
		String substring1 = s1.substring(8);
		System.out.println("15.Substring:   "+substring1+'\n');
		
		String substring2 = s1.substring(19, 28);
		System.out.println("16.Substring:   "+substring2+'\n');
		
		String join1 = s1.join("@","Welcome","to","Selenium","Testing");
		System.out.println("17.Join:   "+join1); 
		
		boolean empty1 = s3.isEmpty();
		System.out.println("18.Empty:   "+empty1);
		
		
		boolean empty2 = s1.isEmpty();
		System.out.println("19.Empty:   "+empty2);
		
		String[] split1 = s4.split("");
		System.out.println("20.Split by char: "+'\n');
		for (String string : split1) {
	    System.out.println(string);
		}
		
		
		String[] split2 = s4.split(" ");
		System.out.println("21.Split by words: "+'\n');
		for (String string1 : split2) {
			System.out.println(string1+'\n');
		
		}
		
		String s5="244Ja4#$$ v906a t@@e##s$%&*s,,,; 't2334in???g";
		String replaceAll1 = s5.replaceAll("[^a-zA-Z]","");
		System.out.println("22.Replace All:   "+ replaceAll1+'\n');
		String replaceAll2 = s5.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("22.Replace All:   "+ replaceAll2+'\n');
		
		String s6="Welcome to Tutorial";
		int indexOf3 = s6.indexOf('o',7);
		System.out.println("23:Middle Char:  "+indexOf3+'\n');
		
		
		
		
		
		
		
		
	}

}
