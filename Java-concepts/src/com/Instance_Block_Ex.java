package com;

class Xyz {

	int ins;

	static {

	}

	{
		System.out.println("common init...at instance level");
		ins = 123;
	}

	public Xyz() {
		// System.out.println("common init...at instance level");
		System.out.println("Xyz()");
	}

	public Xyz(int a) {
		// System.out.println("common init...at instance level");
		System.out.println("Xyz(a)");
	}

	public Xyz(int a, int b) {
		// System.out.println("common init...at instance level");
		System.out.println("Xyz(a,b)");

	}
}

public class Instance_Block_Ex {

	public static void main(String[] args) {

		Xyz xyz1 = new Xyz();
		Xyz xyz2 = new Xyz(1);
		Xyz xyz3 = new Xyz(1, 2);

	}

}
