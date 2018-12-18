package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {
	public static void main(String args[]) throws FileNotFoundException {
		//Without try resource
		Scanner scanner = null;
		try {
		    scanner = new Scanner(new File("test.txt"));
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} finally {
		    if (scanner != null) {
		        scanner.close();
		    }
		}
		
		//try resource with multiple resources
		try (Scanner scanner1 = new Scanner(new File("testRead.txt"));
			    PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
			    while (scanner1.hasNext()) {
			    writer.print(scanner1.nextLine());
			    }
			}
	}
}
