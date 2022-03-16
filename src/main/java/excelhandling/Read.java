//Excel Handling	Write a program to open a excel file and read values from it. Then write this values into a HashTable and print it
package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
		//Object of the File Class with Location
		File src = new File("C:\\Users\\surajt\\Desktop\\ExcelRead.xlsx");
		
		//FileInputStream belongs to Java IO Package
		//Loading Excel Sheet
		FileInputStream fis = new FileInputStream(src);
		
		//Load Complete Excel Workbook
		//For xlsx 
		//Used Apache POI Dependecy and POI-OOXML Dependecy
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		//For .xls
		//HSSFWorkbook xsf = new HSSFWorkbook(fis);
		
		//For Specific Sheet Selction
		//Select Sheet With the help of Index
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		

		//Get Data and Store it in String Variable
		String data = sheet.getRow(2).getCell(1).getStringCellValue();
		//Data formater class gives in string - forat may be in double,numeric
		
		//Print First Name
		System.out.println("First Name is "+ data);
		
		//Close Workbook
		xsf.close();
		}
}

//We can do above Code by Adding @test in TestNg
//Used Apache POI Dependecy and POI-OOXML Dependecy

