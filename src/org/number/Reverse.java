package org.number;

public class Reverse {
	
	static int temp;
	public static int count(int a) {
		temp = a;
		int d=0;
		while (a>0) {
			int b= a/10;
			int c= a%10;
			a=b;
			d=c+(d*10);
			
					
			
		}
		return d;

	}
	
	public static void main(String[] args) {
		
		int count = count(7117);
		System.out.println(count);
		if (temp==count) {
			
			System.out.println("given number is palindrome");
			
		}
		
		else {
			
			System.out.println("given number is not palindrome");
			
		}
		System.out.println("its a dev project");
		
		
	}
	
	
	
	
	
	

}
