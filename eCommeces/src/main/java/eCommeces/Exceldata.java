package eCommeces;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;



public class Exceldata {

	public String getExcelData(String shettName , int rowNum , int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream(Pathdata.excel);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(shettName);
		Row row = sh.getRow(rowNum);
		wb.close();
		return row.getCell(colNum).getStringCellValue();
				
	}
	
	public Double getExcelData1(String shettName , int rowNum , int colNum) throws Throwable {
		FileInputStream fis = new FileInputStream(Pathdata.excel);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(shettName);
		Row row = sh.getRow(rowNum);
		wb.close();
		return row.getCell(colNum).getNumericCellValue();
				
	}
	
	
}
