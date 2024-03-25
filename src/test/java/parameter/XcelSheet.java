package parameter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelSheet {

	
	public static void main(String[] args) throws IOException {
		
		
	File file= new File("./src/test/resources/Test.xlsx");	
		System.out.println(file.exists());
		
		
		FileInputStream fis= new FileInputStream(file);
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int noOfRows= sheet.getPhysicalNumberOfRows();
		int noOfColumns=sheet.getRow(0).getLastCellNum();
		
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getLastRowNum());
		
		String [][] data=new String[noOfRows-1][noOfColumns];
		
		
		for(int i=1;i<noOfRows-1;i++) {
			
			for(int j=0;j<noOfColumns;j++) {
				
				DataFormatter df = new DataFormatter();
				//System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
				
				
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
				
			//System.out.println(	sheet.getRow(i).getCell(j).getStringCellValue());
				
			}
			System.out.println();
			
		}
		
		
		workbook.close();
		fis.close();
		
		for(String[] dataarr:data)
		{
			System.out.println(Arrays.toString(dataarr));
			
		}
		
		
		
	}
	
	
}
