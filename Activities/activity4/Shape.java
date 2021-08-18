package com.ltts_activity4;

public abstract class Shape {
	abstract int calculateArea(int value);
}

class Circle extends Shape{
	int calculateArea(int value){
		int area=2*22/7*value*value;
		return area;
	}
}

class Square extends Shape{
	int calculateArea(int value) {
		int area=value*value;
		return area;
	}
}