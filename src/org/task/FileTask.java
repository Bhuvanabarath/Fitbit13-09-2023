package org.task;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileTask {
	public static void main(String[] args) throws IOException  {
		//Create Folder
//		File f=new File("D:\\Java\\java1");
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
		
		//Create File
		File f2=new File("D:\\Java\\Testing1.txt");
//		f2.createNewFile();
		
//		String[] list = f2.list();
//		for(int i=0;i<list.length;i++)
//		
//			System.out.println(list[i]);
//		File[] listFiles = f2.listFiles();
//		for(int i=0;i<listFiles.length;i++)
			
//			System.out.println(listFiles[i]);
		
//		List<String> readLines = FileUtils.readLines(f2);
//		System.out.println(readLines);
		
		FileUtils.write(f2, "JavaSeleniumerty", false);
		
	}
}
