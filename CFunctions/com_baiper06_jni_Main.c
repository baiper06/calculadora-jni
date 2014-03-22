/*
 * com_baiper06_jni_Main.c
 *
 *  Created on: 21/03/2014
 *      Author: bairon
 */


#include <jni.h>
#include "../JavaCalc/bin/com_baiper06_jni_Main.h"
#include <stdio.h>

JNIEXPORT float JNICALL Java_com_baiper06_jni_Main_add(JNIEnv *env, jobject obj, float pNumberX, float pNumberY){
	return pNumberX+pNumberY;
}

JNIEXPORT float JNICALL Java_com_baiper06_jni_Main_subtraction(JNIEnv *env, jobject obj, float pNumberX, float pNumberY){
	return pNumberX-pNumberY;
}


JNIEXPORT float JNICALL Java_com_baiper06_jni_Main_division(JNIEnv *env, jobject obj, float pNumberX, float pNumberY){
	return pNumberX/pNumberY;
}


JNIEXPORT float JNICALL Java_com_baiper06_jni_Main_multiplication(JNIEnv *env, jobject obj, float pNumberX, float pNumberY){
	return pNumberX*pNumberY;
}
