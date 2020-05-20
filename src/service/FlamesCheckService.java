package service;

import java.util.Scanner;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value
public class FlamesCheckService{
	
	public char findFlames(String name1, String name2) {
		
		System.out.print("hiii");
		
		StringBuilder sb1=new StringBuilder(name1);
		StringBuilder sb2=new StringBuilder(name2);
		 
		int m=sb1.length();
		int n=sb2.length();
		System.out.print(n);
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(sb1.charAt(i)==sb2.charAt(j)) {
				sb1.replace(i,i+1,"0");
				sb2.replace(j,  j+2, "0");
			}
		}
			System.out.print(sb1);
	}
	
		int x=0;
		int y=0;
		String s1="";
		String s2="";
		s1=sb1.toString();
		s2=sb2.toString();
		for(int i=0; i<s1.length();i++) {
			if(s1.charAt(i)!='0') {
				System.out.print(" "+s1.charAt(i));
				x+=1;
			}
		}
		System.out.println("First String: "+x);
		
		for(int i=0; i<s2.length(); i++) {
			if(s2.charAt(i)!='0') {
				System.out.print(" "+s2.charAt(i));
				y+=1;
			}
		}
		System.out.println("Second String: "+y);
		
		int z=x+y;
		System.out.println("Length is: "+x);
		
		
		String flames="flames";
		StringBuilder sb3=new StringBuilder(flames);
		char flameResult=0;
		
		while(sb3.length()!=1) {
			int y1=z%sb3.length();
			String temp;
			
			if(y1!=0) {
				temp=sb3.substring(y1)+sb3.substring(0, y1-1);
			}
			else {
				temp =sb3.substring(0, sb3.length()-1);
			}
			sb3=new StringBuilder(temp);
			flameResult=sb3.charAt(0);
			
		}
		
		System.out.print(flameResult);
		return flameResult;
	}
}
