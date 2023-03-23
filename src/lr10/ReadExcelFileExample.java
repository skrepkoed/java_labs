package lr10;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.TextTable.Cell;
import org.apache.poi.common.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;
public class ReadExcelFileExample {
    public static void main(String[] args) {
        String filepath="src/lr10/example3.xlsx";
        try {
            FileInputStream inputStream = new FileInputStream(filepath);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Товары");
            for (Row row : sheet) {
                for (org.apache.poi.ss.usermodel.Cell cell : row) {
                    System.out.println(cell.toString()+"\t");
                }
                System.out.println();
            }
            workbook.close();
            inputStream.close();    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
