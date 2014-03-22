package com.baiper06.jni;

public class Main {
	public native float add(			 float pNumberX, float pNumberY);
	public native float subtraction(	 float pNumberX, float pNumberY);
	public native float division(		 float pNumberX, float pNumberY);
	public native float multiplication(float pNumberX, float pNumberY);

	 static {
		 System.loadLibrary("CFunctions");
	 }

}
