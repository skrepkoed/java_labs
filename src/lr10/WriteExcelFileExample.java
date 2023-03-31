package lr10;
import java.io.FileOutputStream;

import org.apache.poi.common.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;
public class WriteExcelFileExample {
    public static void main(String[] args) {
        XSSFWorkbook book =new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet("Товары");
        Row headerRow=sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");
        
        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Жанр: Фантастика Автор Иванов И.И.");
        dataRow1.createCell(2).setCellValue("500,0");

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("IntelCore i5");
        dataRow2.createCell(2).setCellValue("25000");

        String filepath ="src/lr10/example3.xlsx";
        try {
            FileOutputStream outputstream =new FileOutputStream(filepath);
            book.write(outputstream);
            book.close();
            outputstream.close();
            System.out.println("Записано в "+filepath);    
        } catch (Exception e) {
            e.printStackTrace();
        }
        


    }
}
