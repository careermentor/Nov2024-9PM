package basicJava;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;

import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception  
	{
		FileReader fr = new FileReader("./TestData/abc.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("name"));
		System.out.println(prop.get("automation"));
		
	}
	
	
	public static void writedata() throws Exception
	{
		File f = new File("C:\\TestData\\data2.txt");  //file connection
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nthis is forth line of data");
		fw.flush();
		fw.close();
		
		
	}

	public static void readdata() throws Exception
	{
		//File f = new File("C:\\TestData\\data1.txt");  //file connection
		FileReader fr = new FileReader("./TestData/data1.txt");
		
		int r = fr.read();  //84
		
		while(r!=-1)  //r=84, 104
		{
			System.out.print((char)r); //Th
			r=fr.read(); //r = 104
		}
		
		/*
		System.out.print((char)r);
		r=fr.read();
		System.out.print((char)r);
		r=fr.read();
		System.out.print((char)r);
		r=fr.read();
		System.out.print((char)r);
		r=fr.read();
		System.out.print((char)r);
		r=fr.read();
		System.out.print((char)r);
		r=fr.read();
		System.out.print((char)r);
		r=fr.read();
		System.out.print((char)r); */
		
	}
	
	public static void main(String[] args) throws Exception
	{
		readprop();
	}
	
}
