package projects.utils;

import java.io.*;

public class UserInput { //Class gia eisagogi dedomenwn apo to pliktrologio
	public static String getString() { //Methodos gia eisagogi String
		String line;
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(input);
		try
		{
			line=in.readLine();
			return line;
		}
		catch(Exception e)
		{
			return "Exception";
		}	
	}

	public static int getInteger() {//Methodos gia eisagogi Integer
		String line;
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(input);
		try{
			line=in.readLine();
			int i=Integer.parseInt(line);
			return i;
		}
	    catch(Exception e){
	    	return -1;
	    }
	 }

	public static short getShort() { //Methodos gia eisagogi short
		String line;
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(input);
		try{
			line=in.readLine();
			short i=Short.parseShort(line);
			return i;
		}
	    catch(Exception e){
	    	return -1;
	    }
	 }

	public static float getFloat() { //Methodos gia eisagogi float
		String line;
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(input);
		try{
			line=in.readLine();
			float i=Float.parseFloat(line);
			return i;
		}
	    catch(Exception e){
	    	return -1;
	    }
	 }

}
