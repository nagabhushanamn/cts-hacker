package com;

interface Subject {

}

class Java implements Subject {
}

class JS implements Subject {
}

class A {
	Subject a() {
		return new Java();
	}
}

class B extends A {

	@Override
	JS a() {
		return new JS();
	}
}

public class Covariant_Type {

	public static void main(String[] args) {

	}

}
