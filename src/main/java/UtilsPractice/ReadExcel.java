package UtilsPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel extends ReadDataFromDb
{
public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException 
{
	FileInputStream fs=new FileInputStream("C:\\Users\\vaish\\AutomationPractice\\GitCheckOut\\src\\test\\resources\\TestUtils\\TestData.xlsx");
	
	XSSFWorkbook wb=new XSSFWorkbook(fs);
	
	XSSFSheet sh=wb.getSheetAt(0);
	
	int rows=sh.getPhysicalNumberOfRows();
	
	
	System.out.println("Total number of rows : "+rows);
	ReadExcel rs=new ReadExcel();

	for(int i=1;i<=rows;i++)
	{				
		XSSFRow row=sh.getRow(i);
		if(row!=null)
		{
		System.out.println((int)row.getCell(0).getNumericCellValue()+" - "+row.getCell(1).getStringCellValue()+" - "+row.getCell(2).getStringCellValue());
		int userId=(int)row.getCell(0).getNumericCellValue();
		String password=row.getCell(1).getStringCellValue().toString();
		String userName=row.getCell(2).getStringCellValue().toString();

		rs.WriteDataFromExcel(userId,password,userName);
		}
	}
	
	
	
	
	
    

}
}
