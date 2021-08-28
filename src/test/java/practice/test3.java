package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test3 {
public static void main(String[] args) throws Exception, InvalidFormatException, IOException {
	FileInputStream fib = new FileInputStream("C:\\Users\\RAKESH\\Desktop\\Book1.xlsx");
	Workbook wib=WorkbookFactory.create(fib);
	Sheet sh = wib.getSheet("sheet1");
	for(int i=1;i<sh.getLastRowNum();i++) {
		Row row = sh.getRow(i);
		
		 String cell1 = row.getCell(1).getStringCellValue();
		 String Test = "pass";
		 if(Test.equals(cell1))
		 System.out.println(cell1);

	}
	wib.close();
	 
	
}
}
