package com.jda.ds.core;

import java.io.File;
import java.util.Scanner;

public class FirstProb {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("/home/bridgelabz/workspace/DataStructures/src/com/jda/ds/util/TextFile.txt");
		Scanner in = new Scanner(file);
		while( in.hasNextLine()){
			System.out.println(in.nextLine());
		}
	}

}
