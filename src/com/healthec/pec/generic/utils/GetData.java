package com.healthec.pec.generic.utils;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {
	
	
	public static String fromProperties(String fileName,String key)
	{
		String data=null;
		try{
		File f = new File ("./app-config/"+fileName+".properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		data = p.getProperty(key);
		}
		catch (Exception e)
		{
			System.out.println("Exception in getting data from properties :"+e.getMessage());
		}
		return data;
     }
	public static String fromExcel(String fileName,String sheetName,int rowIndex,int columnIndex)
	{
		String exceldata = null;
		
		try {
			File f = new File ("./testData/"+fileName+".xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowIndex);
			Cell c =r.getCell(columnIndex);
			exceldata=c.toString();
			
		} catch (Exception e) {
			
			System.out.println("Exception in getting data from testData Excel:"+e.getMessage());
		}
		
		return exceldata;
	}
	
}
