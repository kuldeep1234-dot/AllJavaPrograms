package practice;

import java.io.*;

public class Console {

	
	public static void main(String[] args) {
		
		String str;char ch[];
		java.io.Console obj= System.console();
		System.out.println("Enter user name");
        str=obj.readLine();
        System.out.println("Enter password");
        ch=obj.readPassword();
        String a=String.valueOf(ch);
        System.out.println("Username"+str);
        System.out.println("Password"+ch);
        
        
	}

}
