package test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceljava {

	
	public Object[][] javaexcelReader() throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\rajde\\eclipse-workspace1\\Kospat\\src\\Excel.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = Workbook.getSheetAt(0);
		int TotalRows = sheet.getPhysicalNumberOfRows();
		int TotalColumn = sheet.getRow(0).getPhysicalNumberOfCells();

		//HashMap<String, HashMap<String, String>> supermap = new HashMap<String, HashMap<String, String>>();
		
		System.out.println("Total Rows :" + TotalRows);
		System.out.println("Total Column :"+ TotalColumn);	

		Object [][] datas = new Object[TotalRows-1][TotalColumn];

		for (int i = 1; i < TotalRows; i++) {
			//Map<String, String> map = new HashMap<String, String>();
			for (int j = 0; j < TotalColumn; j++) {
				datas[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();					
				//map.put(sheet.getRow(0).getCell(j).getStringCellValue(), CellValue);
				
			}
			//datas[i-1][0]=map;
			//System.out.println(map);
		}
		return datas;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
