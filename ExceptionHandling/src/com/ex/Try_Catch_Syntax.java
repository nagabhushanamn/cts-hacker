package com.ex;


class Employee{
	public void doWork() {
		//..
	}
}
public class Try_Catch_Syntax {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			System.out.println("B");
			int ari=1/1;
			int[] arr={1,2};
			//System.out.println(arr[1]);
			Employee employee=null;
			employee.doWork();
			System.out.println("C");
		} 
		//		catch (ArithmeticException ae) {
		//			// Exception Handling code..
		//			// -> Report to end user with friendly message
		//			// -> log it
		//			// -> release used resources
		//			// -> re-throw exception to other module
		//			System.out.println("Ex-" + ae.getMessage());
		//			System.out.println("D");
		//		} catch (ArrayIndexOutOfBoundsException aioobe) {
		//			System.out.println("Arra Ex-" + aioobe.getMessage());
		//		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Ex-"+e.getMessage());
		}catch (Exception e) {
			System.out.println("Ex-"+e.getMessage());
		}

		System.out.println("E");

	}

}
