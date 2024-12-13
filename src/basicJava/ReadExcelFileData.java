package basicJava;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFileData 
{

	public static void readexcel() throws Exception
	{
		File f = new File("C:\\TestData\\abc.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("datasheet");
		
		int nr = sh1.getPhysicalNumberOfRows();  //3
		System.out.println(nr);
		
		for(int i=0; i<nr; i++)  //0<3, 1<3, 2<3
		{
			XSSFRow row = sh1.getRow(i);  //0,1, 2
			
			int nc = row.getPhysicalNumberOfCells();
			
			for(int j = 0; j<nc; j++)
			{
				XSSFCell col = row.getCell(j);  
				System.out.print(col.getStringCellValue() + "    ");
			}
			
			System.out.println();
			
		}
		
		/*
		XSSFRow row1 = sh1.getRow(0);  //first row
		XSSFCell col1 = row1.getCell(0);  //first column
		System.out.println(col1.getStringCellValue());
		
		XSSFRow row2 = sh1.getRow(1);  //second row
		
		XSSFCell col21 = row2.getCell(0);
		System.out.println(col21.getStringCellValue());
		
		XSSFCell col22 = row2.getCell(1);
		System.out.println(col22.getStringCellValue());
		*/
		
	}
	
	public static void main(String[] args) throws Exception {
		readexcel();
	}
	
}
