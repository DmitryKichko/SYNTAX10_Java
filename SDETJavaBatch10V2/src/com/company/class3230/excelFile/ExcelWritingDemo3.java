package com.company.class3230.excelFile;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWritingDemo3 {
    public static void main(String[] args) throws IOException {
       /* String path = "/Users/dmitrykicko/Desktop/Memory_Batch10/MyOwnFile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        //Sheet mySheet = xssfWorkbook.createSheet("MySheet");
        Sheet mySheet = xssfWorkbook.getSheet("MySheet");
        Row row = mySheet.createRow(5);
        Cell cell = row.createCell(5);
        cell.setCellValue("My First File");
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);*/

    }
}
