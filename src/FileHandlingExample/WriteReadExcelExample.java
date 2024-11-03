package FileHandlingExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteReadExcelExample 
{
	// Create a workbook and a sheet
	public static void writeExcel() 
	{
		 XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet = workbook.createSheet("Employee Data");
		 // Write data to the sheet
		 sheet.createRow(0).createCell(0).setCellValue("ID");
         sheet.getRow(0).createCell(1).setCellValue("Name");
         sheet.getRow(0).createCell(2).setCellValue("Salary");
         
         sheet.createRow(1).createCell(0).setCellValue(1);
         sheet.getRow(1).createCell(1).setCellValue("John Doe");
         sheet.getRow(1).createCell(2).setCellValue(50000);
         
         try(FileOutputStream fileOut=  new FileOutputStream("EmployeeData.xlsx"))
         {
        	 workbook.write(fileOut);
        	 
         } 
         catch (FileNotFoundException e) 
         {
			e.printStackTrace();
		} 
         catch (IOException e) {
			e.printStackTrace();
		}
         finally 
         {
             try 
             {
                 workbook.close();
             } 
             catch (IOException e) 
             {
                 e.printStackTrace();
             }
         }
		 
	}
	public static void main(String[] args) {
		writeExcel();

	}

}
