package may27th;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("D:\\FLM19thFeb\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//case 1: modifying an existing an cell in row
		// ws.getRow(1).getCell(1).setCellValue("New FLM");
		
		//case 2: creating a cell in an existing row 
		//ws.getRow(2).createCell(1).setCellValue(100);
		
		//case 3: creating a row and cell in it
		//ws.createRow(3).createCell(0).setCellValue("Passed");
		ws.createRow(4).createCell(0).setCellValue(false);
		
		FileOutputStream fos=new FileOutputStream("D:\\FLM19thFeb\\Book1.xlsx");
		
		wb.write(fos);
		
		wb.close();

	}

}
