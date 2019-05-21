package com.dom;

import java.io.*;

public class MyWorkSpace {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = null;
        try{
            FileWriter fw = new FileWriter("goo.txt");
            pw = new PrintWriter(fw);
            pw.write("JAVA MGCHIU1");
            pw.flush();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (pw != null){
                pw.close();
            }
        }
        }
	
	
	
}

