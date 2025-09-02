package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBasic {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:/Users/334884/Desktop/FileHandling/abc.txt");

		FileOutputStream fos = new FileOutputStream("C:/Users/334884/Desktop/FileHandling/bcd.txt");

		int data;

		while ((data = fis.read()) != -1) {
			fos.write(data);
		}

		System.out.println("data copied");
		fis.close();
		fos.close();

	}

}
