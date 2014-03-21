package com.baiper06.jni;

public class Main {
	public native int add(			 int pNumberX, int pNumberY);
	public native int subtraction(	 int pNumberX, int pNumberY);
	public native int division(		 int pNumberX, int pNumberY);
	public native int multiplication(int pNumberX, int pNumberY);

	 static {
		 System.loadLibrary("CFunctions");
	 }

	 public static void main(String[] args) {
		 Main h = new Main();
		 System.out.print( h.division(3, 0) );
	 }
}
