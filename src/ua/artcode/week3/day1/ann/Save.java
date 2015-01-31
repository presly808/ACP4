package ua.artcode.week3.day1.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Save {

    //property of ann must be primitive, enum, String(Immutable)
    String desc() default "";
    int num();


}
