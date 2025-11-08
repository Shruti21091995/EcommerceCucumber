package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;

public class ExcelReaderUtils {

    private static Workbook workbook;
    private static Sheet sheet;

    // ✅ Initialize Excel file and sheet
    public static void setExcelFile(String filePath, String sheetName) {
        try {
        	//open excel file for reading
            FileInputStream fis = new FileInputStream(filePath);
           // load the workbook from excel file as it reads both .xls and .xlsx format easily
            workbook = WorkbookFactory.create(fis);
            //load the sheet from workbook
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ✅ Get data from a specific cell
    public static String getCellData(int rowNum, int colNum) {
    	//for converting the cell values in text
        DataFormatter formatter = new DataFormatter();
        Cell cell = sheet.getRow(rowNum).getCell(colNum);
        return formatter.formatCellValue(cell);
    }

    // ✅ Get total number of rows
    public static int getRowCount() {
        return sheet.getLastRowNum() + 1; // +1 because rows start from 0
    }

    // ✅ Close workbook after use
    public static void closeExcel() {
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
