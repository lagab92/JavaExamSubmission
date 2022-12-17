package java_final;




import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\musta\\Desktop\\confid_videos\\java\\EXCEL FILE\\excel3.xlsx";

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int column = sheet.getRow(0).getLastCellNum();

        int row = sheet.getLastRowNum()+1;


        for (int a = 0; a < row; a++) {

            XSSFRow myRow = sheet.getRow(a);

            for ( int b = 0 ; b< column;b++){

                String value = myRow.getCell(b).toString();

                System.out.print(value + "\t\t" );
            }

            System.out.println();

            System.out.println();


        }}}











