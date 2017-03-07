#include "com_example_android_store_MyNDK.h"

JNIEXPORT jstring JNICALL Java_com_example_android_store_MyNDK_getMyString(JNIEnv* env, jobject){
    return env->NewStringUTF("This is MyLibrary!!!");
}