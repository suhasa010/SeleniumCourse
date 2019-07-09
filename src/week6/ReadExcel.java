package week6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static final String FILEPATH = "C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\data\\test.xlsx";
	public static final String NEWFILEPATH ="C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\data\\newtest.xlsx";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File source = new File(FILEPATH);
		FileInputStream fis = new FileInputStream(source);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
//		System.out.println(sheet.getLastRowNum());
		System.out.println("Before Adding new subject");
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {;
			System.out.println(sheet.getRow(i).getCell(0));		
	}
	int num = sheet.getLastRowNum();
	Row r = sheet.createRow(num+1);
	r.createCell(0).setCellValue("MVC");
	
	FileOutputStream fout = new FileOutputStream("C:\\Users\\Suhasa\\git\\SeleniumCourse\\SeleniumCourse\\src\\data\\newtest.xlsx");
	wb.write(fout);

	
	fout.close();
	
	File newsource = new File(NEWFILEPATH);
	FileInputStream fis1 = new FileInputStream(newsource);
	XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
	XSSFSheet newsheet = wb1.getSheet("Sheet1");
	System.out.println("After Adding new subject");
	for (int i = 1; i <= newsheet.getLastRowNum(); i++) {
		System.out.println(newsheet.getRow(i).getCell(0));		
}

}
}
