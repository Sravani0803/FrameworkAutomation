package may27th;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("D:\\FLM19thFeb\\Book1.xlsx");
		
		//non-static factory Method
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		System.out.println("getLastRowNum: "+ws.getLastRowNum());
		
		System.out.println("getPhysicalNumberOfRows: "+ws.getPhysicalNumberOfRows());
		
		XSSFRow row=ws.getRow(0);
		
		System.out.println("getLastCellNum(): "+row.getLastCellNum());
		
		System.out.println("getPhysicalNumberOfCells(): "+row.getPhysicalNumberOfCells());

		XSSFCell cell1=row.getCell(0);
		
		CellType cellType=cell1.getCellType();
		if(cellType.equals(CellType.STRING))
		{
			System.out.println(cell1.getStringCellValue());
		}
		else if(cellType.equals(CellType.NUMERIC))
		{
			System.out.println(cell1.getNumericCellValue());
		}
		else if(cellType.equals(CellType.BOOLEAN))
		{
			System.out.println(cell1.getBooleanCellValue());
		}
		
	}

}
