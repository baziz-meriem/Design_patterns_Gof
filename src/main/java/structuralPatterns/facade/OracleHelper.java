package structuralPatterns.facade;
import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        System.out.println("Connecting to Oracle Database...");
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("Generating Oracle PDF report for table " + tableName);
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("Generating Oracle HTML report for table " + tableName);
    }
}
