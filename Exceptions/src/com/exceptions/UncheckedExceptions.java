package com.exceptions;

public class UncheckedExceptions {
	public static void main(String args[]) {
		String crunchifyArr[] = { "Crunchify", "Google", "Yahoo", "Amazon", "eBay" };
		String myString = crunchifyArr[7]; // This throws ArrayIndexOutOfBoundException
		System.out.println(myString);
	}
}
