package com.upcasting.demo;

public class Parent_Class {
	public void old_Property() {
System.out.println("Old Property");
	}
public void new_Property() {
System.out.println("New Property");
}
public static void main(String[] args) {
	Parent_Class parent = new Child();
	parent.old_Property();
	parent.new_Property();
}
}
