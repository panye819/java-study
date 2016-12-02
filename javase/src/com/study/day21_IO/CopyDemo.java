package com.study.day21_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		char[] chs = new char[1024];
		int len = 0;
		while((len=br.read(chs)) != -1){
			bw.write(new String(chs,0,len));
		}
		
		br.close();
		bw.close();
	}

}
