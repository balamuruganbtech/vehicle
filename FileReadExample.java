//package com;

// Java Program to illustrate reading from FileReader
// using BufferedReader
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadExample {

	public static void main(String[] args) throws Exception {
		// We need to provide file path as the parameter:
		// double backquote is to avoid compiler interpret words
		// like \test as \t (ie. as a escape sequence)
		File file = new File("F:\\JAVA\\dump\\Vahana\\dump\\hebron_travel_data-2018-05-11-01-00-01.sql");
		FileWriter fw = new FileWriter("F:\\JAVA\\dump\\Vahana\\dump\\testout.sql");

		boolean flag = false;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = in.readLine()) != null) {
				if (!flag && line.startsWith("DROP TABLE IF EXISTS `operator_theme`;")) {
					System.out.println("==============BLOCKED===============");
					flag = true;
				}
				
				if (flag) {
					fw.write(line);
					fw.write("\n");
				}
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fw.close();
			in.close();
		}

	}
}
