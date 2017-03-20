package TestExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by a07 on 2017/3/20.
 * poi解析excel
 */
public class Excel {
    //测试用xls文件路径
    private static String xlspath = "/Users/a07/Documents/财政厅IP访问需求表（移动办公）.xls";

    @Test
    public void test() {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(xlspath)));
            XSSFSheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getLastRowNum();//取得有效的行数
            for (int i = 0; i < rowCount; i++) {
                XSSFRow row = sheet.getRow(i);
                int cellNum=row.getLastCellNum();
                for (int j = i; j < cellNum; j++) {
                    XSSFCell cell = row.getCell(j);
                    System.out.println(cell.getStringCellValue());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
