import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		//int a=10;
		//int b=20;
		//int c=a+b;
		//System.out.println("Hello world"+c);
		//System.out.println("Enter the number");
		//int y= input.nextInt();
		//int z=(a+y);
		//System.out.println(z);
		//Hello.method1();
		//Hello.method2();	
		Loop.ifElse();
		Loop.forLoop();
	}

}

class Hello{
	public static void method1(){
		System.out.println("helloworld"); 
		int x = Class2.method3();
		System.out.println(x);
	}
	public static void method2(){
		System.out.println("I am method2");
		
	}
}

class Class2{
	public static int method3() {
		int a=3;
		int b=4;
		int c= a+b;
		return c;
	}
}

class Loop{
	public static void ifElse(){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number for loop");
		int a = input.nextInt();
		if(a>5) {
			System.out.println("It is greater than 5");
		}
		else {
			System.out.println("It is less than 5");
		}
	}
	
	public static void forLoop() {
		for (int i=0 ; i<5 ; i++ ) {
			System.out.println("For loop is working");
		}
			
			
	}
}
