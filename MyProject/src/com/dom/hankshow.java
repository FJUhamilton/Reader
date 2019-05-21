package com.dom;

import java.io.*;
public class hankshow {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("show.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line != null){
			System.out.println(line);
			String[] tokens = line.split(",");
			if(tokens.length == 2) {
				System.out.println(tokens[0]+"/"+tokens[1]);
				int n = Integer.parseInt(tokens[1]);
				if(n>=10) {
					System.out.println(n*1200);
				}else if (n<10) {
					System.out.println(n*1000);
				}
			}
			line = in.readLine();	
			}
			}catch(FileNotFoundException e) {
				e.getStackTrace();
			}catch(IOException e) {
				e.getStackTrace();
			}
			}
		}

