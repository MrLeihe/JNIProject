//
// Created by 贺磊 on 2018/3/13.
//

#include "calculate.h"
#include <jni.h>
#include <android/log.h>

#define TAG    "myhello-jni-test" // 这个是自定义的LOG的标识
#define LOGD(...)  __android_log_print(ANDROID_LOG_DEBUG,TAG,__VA_ARGS__) // 定义LOGD类型

JNIEXPORT jint
JNICALL Java_com_muxiaolei_helei_util_NativeHelper_calculateSum(
        JNIEnv *env, jclass type, jint numberOne, jint numberTwo) {
    LOGD("numberOne-----------", numberOne);
    LOGD("numberTwo-----------", numberTwo);
    return numberOne + numberTwo;
}

