package com.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("/home/techvidvan/file.txt");
        try {
			FileReader fileReader =new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Successfull");
		
	}

}
