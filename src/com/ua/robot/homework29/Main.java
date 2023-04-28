package com.ua.robot.homework29;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("human.xlsx");
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);

        var rowIterator = sheet.rowIterator();
        if (rowIterator.hasNext()) {
            var row = rowIterator.next();
            var cellIterator = row.cellIterator();
            cellIterator.forEachRemaining(cell -> {
                var cellValue = cell.getStringCellValue();
                if (cellValue.equals("Name")) {
                    var index = cell.getColumnIndex();
                    var type = "String";
                }
                if (cellValue.equals("Age")) {
                    var index = cell.getColumnIndex();
                    var type = "Integer";
                }
            });
        }

    List<Human> humans = new ArrayList<>();
        rowIterator.forEachRemaining(row ->
    {
        var name = row.getCell(0).getStringCellValue();
        var age = (int) row.getCell(1).getNumericCellValue();
        var human = new Human(name, age);
        humans.add(human);
    });
        humans.forEach(System.out::println);
        wb.close();


    File fileToWrite = new File("test.xlsx");
    OutputStream os = new FileOutputStream(fileToWrite);

        Workbook workbook = new XSSFWorkbook();
        Sheet sheetNew = workbook.createSheet("Persons");
        sheetNew.setColumnWidth(0, 6000);
        sheetNew.setColumnWidth(1, 4000);

        Row header = sheetNew.createRow(0);

        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFFont font = ((XSSFWorkbook) workbook).createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 14);
        font.setBold(true);
        headerStyle.setFont(font);

        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("Name");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(1);
        headerCell.setCellValue("Age");
        headerCell.setCellStyle(headerStyle);

        Row r1 = sheetNew.createRow(1);
        r1.createCell(0).setCellValue("rfgrfgr");
        r1.createCell(1).setCellValue(51.01);

        workbook.write(os);
        workbook.close();
    }
}
