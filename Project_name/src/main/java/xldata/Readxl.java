package xldata;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readxl {
	public static void main (String[] agrs) throws IOException {
		
		String fileLocation ="./xmldata/eclips.xlsx";
		 XSSFWorkbook xwbook = new XSSFWorkbook(fileLocation);
		 XSSFSheet sheet = xwbook.getSheetAt(0);
		 XSSFRow row = sheet.getRow(1);
		 for (int i = 0; i < 2; i++) {
			XSSFCell cell = row.getCell(i);
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		
		
	}

}
