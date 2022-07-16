package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\viji\\Desktop\\SDATA.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
//		Sheet s = wb.createSheet("datas");
//		Row cr = s.createRow(0);
//		Cell cc = cr.createCell(0);
		wb.createSheet("datas").createRow(0);
		wb.getSheet("datas").createRow(0);
		wb.getSheet("datas").createRow(1);
		wb.getSheet("datas").createRow(2);
		wb.getSheet("datas").createRow(3);
		
		wb.getSheet("datas").getRow(0).createCell(0).setCellValue("Student Name");
		wb.getSheet("datas").getRow(1).createCell(2).setCellValue("ram");
		wb.getSheet("datas").getRow(2).createCell(0).setCellValue("raj");
		
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		System.out.println("data written");
		wb.close();
		
		
	}
	


}
