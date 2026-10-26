package excel_read;

import java.io.IOException;

public class ExcelMain { 
	  
 	public static void main(String[] args) throws IOException { 
 		 
 		String s=ExcelCode.readStringData(1, 0); //to read data of 2nr row and 1st column from excel file.
 		System.out.println(s); 
 		String s1=ExcelCode.readIntegerData(1, 1); 
 		System.out.println(s1); 
 		 
  
 	} 
  
 }
