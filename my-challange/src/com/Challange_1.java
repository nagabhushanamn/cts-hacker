package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Challange_1 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("records.csv");
		BufferedReader br = new BufferedReader(fr);

		Map<String, Double> report = new HashMap<>();
//		String[][] report=new String[2][2];

		String record = null;
		while ((record = br.readLine()) != null) {
			String[] tokens = record.split("\\,");
			//for(String token:tokens){System.out.println(token);}
			
			String dep = tokens[1];
			if (report.containsKey(dep)) {
				double newTotal = report.get(dep) + Double.parseDouble(tokens[2]);
				report.put(dep, newTotal);
			} else {
				report.put(dep, Double.parseDouble(tokens[2]));
			}
		}
		
		System.out.println(report);

	}

}
