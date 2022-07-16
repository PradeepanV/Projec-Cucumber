package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\viji\\Desktop\\ReadDATA.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row r = sheetAt.getRow(2);
		Cell cell = r.getCell(2);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String scv = cell.getStringCellValue();
			System.out.println("String Value :"+scv);
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double ncv = cell.getNumericCellValue();
			System.out.println("Numeric Value :"+ncv);
		}
		System.out.println("**********************read all data***********************");
		int pnr = sheetAt.getPhysicalNumberOfRows();
		System.out.println("physical no of rows :"+pnr);
		for (int i = 0; i <pnr; i++) {
			Row r1 = sheetAt.getRow(i);
			int pnc = r1.getPhysicalNumberOfCells();
			System.out.println("cell count :"+pnc);
			for (int j = 0; j <pnc; j++) {
				Cell cell2 = r1.getCell(j);
				CellType cellType2 = cell2.getCellType();
				if (cellType2.equals(CellType.STRING)) {
					String scv1 = cell2.getStringCellValue();
					System.out.print(scv1+" ");
				}
				else if (cellType2.equals(CellType.NUMERIC)) {
					double ncv2 = cell2.getNumericCellValue();
					int b = (int) ncv2;
					System.out.print(b+" ");
				}
				
			}System.out.println();
		}
		wb.close();
		
		
	}

}
