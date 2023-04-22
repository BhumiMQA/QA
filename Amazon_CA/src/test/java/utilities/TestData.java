package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData 
{
	public static Workbook book;
	public static Sheet sheet;
	public static Object[][] Readdata(String SheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\n\\eclipse-workspace\\Amazon_CA\\src\\test\\java\\utilities\\LoginData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// *auto detected and make auto workbook
			// interface=class(workfactory)
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = book.getSheet(SheetName);

		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}

		}
		return data;
	}

}
