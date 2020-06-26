package com.upperlink.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
	  
	public static void print_first_none_repeated_character(String str) {
		  for (int i = 0; i < str.length(); i++) {
		   boolean isUnique= true;
		   for (int j = 0; j < str.length(); j++) {
		    if (i != j && str.charAt(i) == str.charAt(j)) {
		     isUnique= false;
		     break;
		    }
		   }
		   if (isUnique) {
		    System.out.println("The first non repeated character: " + str.charAt(i));
		    break;
		   }
		  }
	}

	public static void main(String[] args) {
		print_first_none_repeated_character("hello");
		SpringApplication.run(TestApplication.class, args);
	}

}
