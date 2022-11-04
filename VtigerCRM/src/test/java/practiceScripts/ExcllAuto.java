package practiceScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ExcllAuto
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fs = new FileInputStream("./src/test/resources/batch.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		Sheet sh= wb.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		String data = c.getStringCellValue();
		System.out.println(data);
	}

}

