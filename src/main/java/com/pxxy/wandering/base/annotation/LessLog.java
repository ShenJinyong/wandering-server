package com.pxxy.wandering.base.annotation;

import com.pxxy.wandering.base.enums.LogType;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LessLog {

    LogType type() default LogType.NONE;
}