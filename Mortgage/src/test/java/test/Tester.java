package test;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.apache.poi.xssf.usermodel.XSSFCell;

public class Tester {

	@Test(dataProvider = "testData")
	public void fast(Map<String, String> testCase) {
		
		  System.out.println("This is Name :"+  testCase.get("Name")); 
		   System.out.println("This is City" + testCase.get("City"));
		 
	}


	@DataProvider(name = "testData")
	public Object[][] excelReader() throws Exception {
		FileInputStream file = new FileInputStream("C:\\Users\\rajde\\eclipse-workspace1\\Kospat\\src\\Excel.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = Workbook.getSheetAt(0);
		int TotalRows = sheet.getPhysicalNumberOfRows();
		int TotalColumn = sheet.getRow(0).getPhysicalNumberOfCells();

		//HashMap<String, HashMap<String, String>> supermap = new HashMap<String, HashMap<String, String>>();
		
		System.out.println("Total Rows :" + TotalRows);
		System.out.println("Total Column :"+ TotalColumn);	

		Object [][] datas = new Object[TotalRows-1][1];

		for (int i = 1; i < TotalRows; i++) {
			Map<String, String> map = new HashMap<String, String>();
			for (int j = 0; j < TotalColumn; j++) {
				String CellValue = sheet.getRow(i).getCell(j).getStringCellValue();					
				map.put(sheet.getRow(0).getCell(j).getStringCellValue(), CellValue);
				//datas[i-1][0]=map;
			}
			datas[i-1][0]=map;
			System.out.println(map);
		}
		return datas;

	}

}
