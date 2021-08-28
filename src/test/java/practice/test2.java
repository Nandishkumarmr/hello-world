package practice;


import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class test2 {
public static void main(String[] args) throws Exception  {
	FileInputStream fib = new FileInputStream("C:\\Users\\RAKESH\\Desktop\\Book1.xlsx");
Workbook wib=WorkbookFactory.create(fib);
Sheet sh = wib.getSheet("sheet1");
Row rh = sh.getRow(2);
 Cell ch = rh.getCell(1);
 String value=ch.getStringCellValue();
 System.out.println(value);
 wib.close();
}
}
