import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ExcelParser {
    public static ArrayList<String[]> parse(String name) {

        ArrayList<String[]> result = new ArrayList<>();
        InputStream in = null;
        HSSFWorkbook wb = null;
        try {
            in = new FileInputStream(name);
            wb = new HSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = Objects.requireNonNull(wb).getSheetAt(0);
        int flag=0;
        for (Row row : sheet) {
            if (flag==0){flag++;continue;}
            String[] res = new String[2];
            int flag1=0;
            for (Cell cell : row) {
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        res[flag1]=cell.getStringCellValue();
                        flag1++;
                        break;
                    /*case Cell.CELL_TYPE_NUMERIC:
                        result.add(String.valueOf(cell.getNumericCellValue()));
                        break;
                    case Cell.CELL_TYPE_FORMULA:
                        result.add(String.valueOf(cell.getNumericCellValue()));
                        break;*/
                    default:
                        result.add(null);
                        break;
                }

            }

            result.add(res);

        }

        return result;
    }


}
