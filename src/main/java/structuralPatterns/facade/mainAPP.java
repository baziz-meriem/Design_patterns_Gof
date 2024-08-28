package structuralPatterns.facade;
import java.sql.Connection;

public class mainAPP {
    public static void main(String[] args) {
        String tableName="Employee";

        //generating MySql HTML report and Oracle PDF report using Facade

        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
