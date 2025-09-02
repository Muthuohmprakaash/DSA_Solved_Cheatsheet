package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFileBasic {

	public static void main(String[] args) throws IOException , FileNotFoundException{
		
		FileInputStream fis = new FileInputStream("C:/Users/334884/Desktop/FileHandling/abc.txt");
		int data1 = fis.read();
		int data2 = fis.read();
		int data3 = fis.read();
		
		System.out.println(data1);
		
		System.out.println((char)data1);
		System.out.println((char)data2);
		System.out.println((char)data3);
		
		int data4 ;
		while((data4 = fis.read()) != -1) {
			System.out.println((char)data4);
		}
		fis.close();
	}

}
