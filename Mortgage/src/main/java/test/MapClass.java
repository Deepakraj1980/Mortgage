package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MapClass {
	
	
	public static Object[][] excelReader() throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\rajde\\eclipse-workspace1\\Kospat\\src\\Excel.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = Workbook.getSheetAt(0);
		int TotalRows = sheet.getPhysicalNumberOfRows();
		int TotalColumn = sheet.getRow(0).getPhysicalNumberOfCells();
		
		HashMap<String, HashMap<String, String>> supermap = new HashMap<String, HashMap<String, String>>();
		HashMap<String, String> map = new HashMap<String, String>();
		
			
		System.out.println("Total Rows :" + TotalRows);
		System.out.println("Total Column :"+ TotalColumn);	
		
		Object [][] datas = new Object[TotalRows-1][TotalColumn];
		
		for (int i = 1; i < TotalRows; i++) {
			for (int j = 0; j < TotalColumn; j++) {
				String CellValue = sheet.getRow(i).getCell(j).getStringCellValue();				
				//System.out.println(CellValue);
				datas[i-1][j]= map.put(sheet.getRow(0).getCell(j).getStringCellValue(), CellValue);
				
			}
			System.out.println(map);
			//supermap.put("Master", map);	
			
			
		}
		System.out.println(supermap);
		//return supermap;
		return datas;
		
		
	}
	
	
	public static Object[][] getKeyValue(String key) throws Exception {
		
		Object[][] objects = excelReader();		
		//String retVal = myVal.get(key);
		return objects;		
	}

	
}
