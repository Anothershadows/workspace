package Automation.Automationqa;



	import java.awt.geom.Arc2D.Double;
import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Webtable2 {

		public static void  main(String[] args) throws IOException {
			
			File f = new File("C:\\Users\\gokul\\Documents\\workspace\\sep\\Excel_read\\BookNew.xlsx");
			
			FileInputStream f1 = new FileInputStream(f); 
			
			Workbook b = new XSSFWorkbook(f1);
			
			Sheet s1 = b.getSheet("Sheet1");
			
		int rows = s1.getPhysicalNumberOfRows();			
			for (int i = 0; i < rows; i++) {				
				Row r1 = s1.getRow(i);
			
		int cells = r1.getPhysicalNumberOfCells();				
		    for (int j = 0; j < cells; j++) {					
				Cell c = r1.getCell(j);
				
			DataFormatter dft = new DataFormatter();	
			String value = dft.formatCellValue(c);
								
			System.out.print(value +"    ");				
			}
			System.out.println("");			
		  }		
		}
	}
	
