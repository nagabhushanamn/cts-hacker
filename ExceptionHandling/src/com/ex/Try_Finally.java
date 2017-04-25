package com.ex;

import java.io.Closeable;
import java.io.FileReader;

class Resource implements Closeable{
	public void init() {
		System.out.println("init..");
	}

	public void use() {
		System.out.println("Use..");
		boolean condn = false;
		if (!condn)
			throw new RuntimeException("oops");
	}


	public void close() {
		System.out.println("Close");
	}
}

public class Try_Finally {

	public static void main(String[] args) {

//		Resource resource = new Resource();

//		try {
//			resource.init();
//			resource.use();
////			if (true) {
////				return;
////			}
//			//resource.close();
//		} catch (Exception e) {
//			System.out.println("Handled Ex on resource use");
//			//resource.close();
//		}finally{
//			resource.close();
//		}

		
		
		try(Resource resource = new Resource();FileReader fr=new FileReader("")){
			resource.init();
			resource.use();
		} catch (Exception e) {
			System.out.println("Handled Ex on resource use");
		}
		
	}

}
