package com.app.demokmit.SEexternal99;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int add(int a, int b) {
		return a+b;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Add 2 and 3 : " + add(2,3));
        System.out.println("Subtract 7 and 5 : " + subtract(7,5));
        System.out.println("Multiply 10 and 2 : " + multiply(10, 2));
        }
}
