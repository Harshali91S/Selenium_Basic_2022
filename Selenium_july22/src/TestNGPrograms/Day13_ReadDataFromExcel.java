package TestNGPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day13_ReadDataFromExcel 
 {
  public static void main(String[] args) throws IOException 
   {
	FileInputStream fis = new FileInputStream("C:\\Users\\Abhijit\\Desktop\\Book1.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
	System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
	System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	System.out.println(sheet.getRow(1).getCell(1).getNumericCellValue());
	System.out.println(sheet.getRow(2).getCell(1).getNumericCellValue());
	System.out.println(sheet.getRow(3).getCell(1).getNumericCellValue());
	System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
	System.out.println(sheet.getRow(1).getCell(2).getNumericCellValue());
	System.out.println(sheet.getRow(2).getCell(2).getNumericCellValue());
	System.out.println(sheet.getRow(3).getCell(2).getNumericCellValue());
	System.out.println(sheet.getRow(0).getCell(3).getStringCellValue());
	System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());
	System.out.println(sheet.getRow(2).getCell(3).getStringCellValue());
	System.out.println(sheet.getRow(3).getCell(3).getStringCellValue());
	
	

   }
}
