package com.dom;

import java.io.*;


public class Create {
	public static void main(String[] args)  {
	try {
		FileWriter fw = new FileWriter("show.txt");
		fw.write("fuck");
		fw.flush();
		fw.close();
		}catch(IOException e) {
			e.getStackTrace();
		}
		}
}
