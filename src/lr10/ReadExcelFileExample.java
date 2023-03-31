package lr10;
import java.io.FileInputStream;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
public class ReadExcelFileExample {
    public static void main(String[] args) {
        Scanner inputScanner =new Scanner(System.in);
        workbookAtempt:
        for(int i=0, k=0;i<3;i++,k++){
        try {
            System.out.println("Укажите путь до файла: ");
            FileInputStream inputStream = new FileInputStream(inputScanner.nextLine());
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            System.out.println("Введите название листа: ");
                XSSFSheet sheet = workbook.getSheet(inputScanner.nextLine());
                for (Row row : sheet) {
                    for (org.apache.poi.ss.usermodel.Cell cell : row) {
                        System.out.println(cell.toString()+"\t");
                    }
                    System.out.println();
                }  
            workbook.close();
            inputStream.close();
            break workbookAtempt;    
        } catch (Exception e) {
            String ex_name=e.getClass().getSimpleName();
            switch (ex_name) {
                case "NullPointerException":
                    if (i<2) {
                        System.out.println("Такого листа не существует в данной книге. Попробуйте еще раз");
                    }else{
                        System.out.println("Попытки кончились");
                    }    
                break;

                case "FileNotFoundException":
                if (k<2) {
                    System.out.println("Файл не найден. Попробуйте еще раз");
                }else{
                    System.out.println("Попытки кончились");
                }
                break;
            
                default:
                    break;
            }
        }
    }     
    }
}
