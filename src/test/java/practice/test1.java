package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test1 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\RAKESH\\Desktop\\Book1.xlsx");
Workbook wib = WorkbookFactory.create(fis);
Sheet sh = wib.getSheet("sheet1");
Row rh=sh.getRow(1);
Cell ch = rh.getCell(1);
String value=ch.getStringCellValue();
System.out.println(value);
wib.close();

}
}
