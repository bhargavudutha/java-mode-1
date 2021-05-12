package com.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatus {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\HCL Training\\java IDE\\Day 5\\info.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			BufferedReader br1 = new BufferedReader(new FileReader("D:\\HCL Training\\java IDE\\Day 5\\info1.txt"));
			String line2;
			while ((line2 = br1.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			br1.close();

		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}

	}

}
