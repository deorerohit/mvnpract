package com.rohit.mavenpractice;
import java.io.*;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Name : ");
		String name = br.readLine();
		System.out.println("Roll No : ");
		int rollno = Integer.parseInt(br.readLine());
		
		Student stud = new Student(rollno, name);
		
		
		
		
		//stud.setRollno(rollno);
		//stud.setName(name);
		
		System.out.println("Roll No : "+stud.getRollno());
		System.out.println("Name    : "+stud.getName());
		
    }
}
