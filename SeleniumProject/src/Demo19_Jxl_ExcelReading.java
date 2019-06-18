import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Demo19_Jxl_ExcelReading {

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException, BiffException {
		
		File fexcel = new File("C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\Selenium Jars\\test.xls");
		WritableWorkbook writebook = Workbook.createWorkbook(fexcel);
		writebook.createSheet("1stsheet", 0);
		WritableSheet writesheet1 = writebook.getSheet(0);
		Label data = new Label(0,0,"satya");
		writesheet1.addCell(data);

		Label data1 = new Label(0,1,"a");
		writesheet1.addCell(data1);
		
		writebook.createSheet("2ndsheet", 1);
		WritableSheet writesheet2 = writebook.getSheet(1);
		Label data2 = new Label(0,5,"add");
		writesheet2.addCell(data2);

		
		writebook.write();
		writebook.close();
		
		Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\AmbavarapuSatyabrahm\\Downloads\\Selenium Jars\\test.xls"));
		Sheet sheet = null;
		int noofSheets = workbook.getNumberOfSheets();
		Cell cell = null;
		
		for(int s = 0; s<noofSheets; s++)
		{
			sheet = workbook.getSheet(s);
			int noofRows = sheet.getRows();
			int noofColumns = sheet.getColumns();
			System.out.println("Sheet No :"+s +"  "+"No of rows : "+noofRows + "  "+"No of Columns : "+noofColumns );
			for (int row = 0 ; row<noofRows ; row++)
			{
				for(int column = 0; column<noofColumns;column++)
				{
					cell = sheet.getCell(column, row);
					if(cell.getContents().length() >0)
					{
						
						System.out.println(cell.getContents() + "(" +column +","+row +")");
					}
					
				}
			}
		}
		
		
		
	}

}
