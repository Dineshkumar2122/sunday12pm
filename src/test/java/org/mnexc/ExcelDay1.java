package org.mnexc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDay1 {

	public static void main(String[] args) throws IOException  {
		/*File f=new File("C:\\Users\\DINU\\Desktop\\FrameExcel\\Excel\\Book1.xlsx.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheet = w.getSheet("login");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row ro = sheet.getRow(i);


			for (int j = 0; j <ro.getPhysicalNumberOfCells() ; j++) {
				
				Cell cell = ro.getCell(j);

				System.out.println(cell);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String name = cell.getStringCellValue();
					System.out.println(name);
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					System.out.println(dateCellValue);
					
					SimpleDateFormat dtfrmt=new SimpleDateFormat("dd/mm/yyy");
					String name = dtfrmt.format(dateCellValue);
					System.out.println(name);
					}
				else {
					double numericCellValue = cell.getNumericCellValue();
				System.out.println(numericCellValue);
				long l=(long)numericCellValue;
				System.out.println(l);
				String name = String.valueOf(l);
				System.out.println(name);
				}
			}
		}
		
	//create excel
		File f=new File("C:\\Users\\DINU\\Desktop\\FrameExcel\\Excel\\newxl.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet createSheet = w.createSheet("sheetname");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("rajaram");
		
		System.out.println(createCell);
	FileOutputStream fo=new FileOutputStream(f);
	w.write(fo);
	System.out.println("done");*/
		
		//update excel
		File f=new File("C:\\Users\\DINU\\Desktop\\FrameExcel\\Excel\\newxl.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet createSheet = w.createSheet("sheetname");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		String stringCellValue = createCell.getStringCellValue();
		if (stringCellValue.startsWith("ra")) {
			createCell.setCellValue("lambogini");
			
		} 
		else {
			createCell.setCellValue("narendhra modi");

		}
		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
		System.out.println("done");
		
		
		
	}
}

