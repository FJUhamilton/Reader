package com.dom;
import java.io.*;
public class Play {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("goo.txt");
			BufferedReader in = new BufferedReader(new FileReader("goo.txt"));
			int n = in.read();
			while(n !=-1){
				System.out.print((char)n);
				n = in.read();
			}
			}catch(IOException e) {
				e.getStackTrace();
			}
			}
		}
	
