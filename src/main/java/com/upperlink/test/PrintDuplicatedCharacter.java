package com.upperlink.test;

public class PrintDuplicatedCharacter {
	public static void print_duplicate_char(String str) {
		int count;  
	      
	    //Converts given string into character array  
	    char[] strArray = str.toCharArray();  
	      
	    //Counts each character present in the string  
	    for(int i = 0; i <strArray.length; i++) {  
	        count = 1;  
	        for(int j = i+1; j <strArray.length; j++) {  
	            if(strArray[i] == strArray[j] && strArray[i] != ' ') {  
	                count++;  
	                //Set strArray[j] to 0 to avoid printing visited character  
	                strArray[j] = '0';  
	            }  
	        }  
	        //A character is considered as duplicate if count is greater than 1  
	        if(count > 1 && strArray[i] != '0')  
	            System.out.println(strArray[i]+"="+count);  
	    }
		
	} 
}
