package com.upcasting.demo;

public class Child extends Parent_Class {
@Override
public void old_Property() {
System.out.println("Value increased to old property");
}
@Override
	public void new_Property() {
	System.out.println("value increased to new property");
	}
public void child_New_Property() {
System.out.println("Overall new property of child");
}
}
