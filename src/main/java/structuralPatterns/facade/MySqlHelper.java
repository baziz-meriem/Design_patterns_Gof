package structuralPatterns.facade;
import java.sql.Connection;


public class MySqlHelper {
    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        System.out.println("Connecting to MYSQL database...");
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("Generating MYSQL PDF report for " + tableName);
    }

    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate html report
        System.out.println("Generating MYSQL HTML report for " + tableName);
    }
}
