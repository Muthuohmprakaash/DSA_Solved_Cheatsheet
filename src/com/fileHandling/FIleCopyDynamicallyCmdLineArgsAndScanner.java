package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FIleCopyDynamicallyCmdLineArgsAndScanner {

	public static void main(String[] args)throws IOException, FileNotFoundException {
		
//		FileInputStream fis = new FileInputStream(args[0]);
//
//		FileOutputStream fos = new FileOutputStream(args[1]);
//
//		int data;
//
//		while ((data = fis.read()) != -1) {
//			fos.write(data);
//		}
//
//		System.out.println("data copied");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source File: ");
		String src = sc.next();
		System.out.println("Enter destination File: ");
		String des = sc.next();
		
		
		FileInputStream fis1 = new FileInputStream(src);

		FileOutputStream fos2 = new FileOutputStream(des);
		int data1;

		while ((data1 = fis1.read()) != -1) {
			fos2.write(data1);
		}
		System.out.println("data Copied");
//		fis.close();
//		fos.close();
		
		fis1.close();
		fos2.close();
		sc.close();
		

	}

}
