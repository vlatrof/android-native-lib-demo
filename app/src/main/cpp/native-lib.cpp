#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_vlatrof_myapplication_MainActivity_stringFromJNI(JNIEnv* env, jobject) {
    std::string hello = "This text was received from native c++ function!";
    return env->NewStringUTF(hello.c_str());
}