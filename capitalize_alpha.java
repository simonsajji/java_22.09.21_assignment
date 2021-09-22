package java_methods;

import java.util.Locale;

public class capitalize_alpha {
	
	
	// Excercise 2: Capitalize all the alphabets and leave the rest of the characters as it is using methods input: "abc1@3#xyz"    output: "ABC@3#XYZ"

    
	public static void main(String args[]) {
		
		String str="abc1@3#xyz";              // INPUT STRING
		
		char[] n=check(str);
		System.out.println(n);            // OUTPUT STRING
		
		
		
	}
	public static char[] check(String s) {
		char[] name=s.toCharArray();
		int i=0;
		for(i=0;i<name.length;i++) {
			if(name[i]>='a' && name[i]<='z') {
				 name[i] = Character.toUpperCase(name[i]);
				 			 			
				
			}
		}
		return(name);
	}

}
