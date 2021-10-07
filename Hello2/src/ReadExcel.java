import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) {
		 ReadExcel rc=new  ReadExcel();     
		String vOutput=rc.ReadCellData(2, 2);   
		System.out.println(vOutput);  
		}  
		
		public String ReadCellData(int vRow, int vColumn)  
		{  
		String value=null;           
		Workbook wb=null;            
		try  
		{  
		  
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Mynew1.xlsx");  
	 
		wb=new XSSFWorkbook(fis);  
		}  
		catch(FileNotFoundException e)  
		{  
		e.printStackTrace();  
		}  
		catch(IOException e1)  
		{  
		e1.printStackTrace(); 
		}  
		Sheet sheet=(Sheet) wb.getSheetAt(0);  
		Row row=((XSSFSheet) sheet).getRow(vRow);   
		Cell cell=row.getCell(vColumn);  
		value=cell.getStringCellValue();      
		return value;                

		         
		}  
	}


