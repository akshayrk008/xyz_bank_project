package utilities.excelutilitis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilitis {
	
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	//Created constructor to acces path of the excelsheet and sheet name while creating object
	
	public ExcelUtilitis(String excelPath, String sheetName) {
		
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void getRowCount() throws IOException {
		
		
		int RowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count: "+RowCount);
		
	}
	
	public static String getCellData(int rowNum, int colNum) throws IOException {
		
		String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println("ColumnCount: "+cellData);
		return cellData;
		
	}
	
public static String getCellDataNum(int rowNum, int colNum) throws IOException {
		
		double cellDatanum = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		String cellData = Double.toString(cellDatanum);
		System.out.println("ColumnCount: "+cellData);
		return cellData;
		
	}

}
