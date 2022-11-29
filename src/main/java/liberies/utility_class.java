package liberies;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility_class {
	public static String Testd(int rowindex, int colindex) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\pm1\\testdata\\new file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		String us = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return us;
	}

}