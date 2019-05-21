package com.dom;

import java.io.*;

public class Creator {
	public static void main(String[] args)  {
		try {
		FileInputStream fis = new FileInputStream("goo.txt");
		}catch(IOException e) {
			e.getStackTrace();
		}
		}
}