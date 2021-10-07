import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToJava {
	
	
	public static void main(String args[]) throws IOException  
	{  
	ExcelToJava obj=new ExcelToJava();
    String out=obj.ReadValue(1,1);
	System.out.println("value from the excel sheet--"+out);
	}	
	
		 public String ReadValue(int vRow, int vColumn)  {
			// TODO Auto-generated method stub
			String value=null;           
			Workbook wb1=null;
			FileInputStream fis=null;
		try {
   fis=new FileInputStream(new File("C:\\Users\\Admin\\Desktop\\Mynew1.xlsx")); 
			//System.out.println("fis----"+fis);
		
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  XSSFWorkbook wb=null;
	 
	 try {
		 wb=new XSSFWorkbook(fis);   
		//System.out.println("wb-----"+wb);  
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	XSSFSheet sheet=wb.getSheetAt(0);   
	//System.out.println("sheet---"+sheet);
 
	Row row=sheet.getRow(vRow);   
	Cell cell=row.getCell(vColumn); 
	value=cell.getStringCellValue();
	return value; 
	
		 }
}
	//FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
	//System.out.println("formulaevalutor---"+formulaEvaluator);
	/*for(Row row: sheet)       
	{  
	for(Cell cell: row)      
	{  
	switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
	{  
	case Cell.CELL_TYPE_NUMERIC:     
	 
       System.out.print(cell.getNumericCellValue()+ "\t\t"); 
       
       
	break;  
	
	case Cell.CELL_TYPE_STRING:    
		
		
	System.out.print(cell.getStringCellValue()+ "\t\t"); 
	
	
	break;  
	
	}  
	}  
	System.out.println();  	
	}*/
	
		
	

	
	

	


