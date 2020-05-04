package com.java8.method;

import java.lang.annotation.*;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Repeatable(value = Authors.class)
public @interface Author {
	String name();
    String method();
}

//@Target({ElementType.TYPE})    
//public @interface Author {
//	String name();
//	String method();
//}