package com.ex;

import java.io.IOException;
import java.io.InputStreamReader;

class NewResource {
	public void use() throws Exception {
		//
		boolean cond = false;
		throw new Exception();

	}
}

public class Checked_UnChecked_Exception_Demo {

	public static void main(String[] args) {

		// You
		try {
			NewResource newResource = new NewResource();
			newResource.use();
		} catch (Exception e) {
			System.out.println("handled Ex in main-method");
		}
		
		
		InputStreamReader isr=new InputStreamReader(System.in);
		try {
			isr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int ari=1/0;
		
		
		
	}

}
