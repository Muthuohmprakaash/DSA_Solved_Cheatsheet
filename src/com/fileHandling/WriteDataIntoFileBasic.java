package com.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataIntoFileBasic {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		FileOutputStream fos = new FileOutputStream("C:/Users/334884/Desktop/FileHandling/bcd.txt");
		
		fos.write(5);
		System.out.println("data is saved");
		fos.close();

	}

}
