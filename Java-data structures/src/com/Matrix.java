package com;

public class Matrix {
	
	public static void main(String[] args) {
		char[] c = {'A','B','C','D','E','F','G'};
		int len=c.length-1;
		int k=0;
		for(int i=0; i<c.length; i++){
			for(int j=0; j<=c.length*2-2; j++){				
				if(j>=c.length-1){
					System.out.print(c[k--]);
				} else{
					System.out.print(c[k++]);
				}
			}
			k=0;
			System.out.println("");
			c[len--]=' ';
		}
	}

}
