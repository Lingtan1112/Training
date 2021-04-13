package com.Chainsys.ValidOrNot;
//public class Valid {
	/*public static void main (String [] args) {
		int a = 10;	
		boolean validAnswer= check(a);
		System.out.println(validAnswer);
		
	}
	public static Boolean check(int x) {
		boolean valid = false;
		if(x>0) {
			valid=true;
			
		}
		else {
			valid=false;	
		}
		return valid;	
	}
	
	
	
}*/

public class Valid{
	public static void main(String[] args) {
		String a= "Hello";
		String x=call(a);
		System.out.println(x);	
		int x1=5;
		int y=10;
		int m= addition(x1,y);
		System.out.println(m);
	}

	public static String call(String x){
		String c=x+"Lingtan";
		return c;
	}
	public static int addition(int a, int b) {
		int c= a+b;
		return c;
		
	}
}