package excel_read;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {

	static FileInputStream f;//used to read the excel file from the given path
	static XSSFWorkbook w;//used to represent entire excel file or workbook
	static XSSFSheet sh;//used to represent the sheet from the workbook

	public static String readStringData(int row, int col) throws IOException {//method to read string data from excel file.
		f = new FileInputStream("/Users/noelabraham/git/JavaRepo/JavaProjects/src/main/resources/PersonalDetails.xlsx");//path of the excel file.
		w = new XSSFWorkbook(f);//load the excel workbook into memory using apache POI.
		sh = w.getSheet("Sheet1");//to select sheet named "Sheet1" from workbook.
		XSSFRow r = sh.getRow(row);//to gets the row based on the row number passed as an argument.
		XSSFCell c = r.getCell(col);//to gets the cell based on the column number passed as an argument.
		return c.getStringCellValue();//to return the cell value as text value

	}

	public static String readIntegerData(int row, int col) throws IOException {//method to read integer data from excel file
		f = new FileInputStream("/Users/noelabraham/git/JavaRepo/JavaProjects/src/main/resources/PersonalDetails.xlsx");
		w = new XSSFWorkbook(f);
		sh = w.getSheet("Sheet1");
		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);
		int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting
		return String.valueOf(val);   //convert int to string using valueOf() method because return type of this method is String.

	
	}

}
