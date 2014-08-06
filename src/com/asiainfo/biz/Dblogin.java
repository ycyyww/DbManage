package com.asiainfo.biz;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.asiainfo.Pattern.*;
import com.asiainfo.dbUtil.DbUtil;
import com.asiainfo.domain.DbMessage;
import com.example.interfaces_better.Service;
import com.example.interfaces_better.ServiceFactory;

public class Dblogin {
    //Test Doc
    /*  String databaseType = args[0];
    String user = args[1];
    String passWord = args[2];
    String dbAddress = args[3];
    String dbPort = args[4];
    String dbName = args[5];

    // MysqlTest
    String user = "almams";
    String passWord = "almams";
    String databaseType = "mysql";   // here
    String dbAddress = "192.168.58.162";
    String dbPort = "3306";
    String dbName = "ALMAMSPUB_SERVER";

    //Oracle Test     jdbc:oracle:thin:@//192.168.58.164:1521/lcdmp2
    String user = "dhcp";
    String passWord = "dhcp123";
    String databaseType = "oracle";
    String dbAddress = "192.168.58.164";
    String dbPort = "1521";
    String dbName = "lcdmp2";

    //com.sybase.jdbc3.jdbc.SybDriver
    //Sybase Test
    String user = "dhcp";
    String passWord = "dhcp123";
    String databaseType = "Sybase";
    String dbAddress = "192.168.58.167";
    String dbPort = "5501";
    String dbName = "LCDMP2X_SYBASE";*/

    public static Database createDb(DatabaseFactory fact) {
        return fact.getDatabase();
    }

    public static void main(String args[]) {
        // args = new String[]{"almams", "almams", "mysql", "192.168.58.162", "3306", "ALMAMSPUB_SERVER"};
        // args = new String[]{"dhcp", "dhcp123", "oracle", "192.168.58.164", "1521", "lcdmp2"};
        // args = new String[]{"dhcp", "dhcp123", "Sybase", "192.168.58.167", "5501", "LCDMP2X_SYBASE"};
        String logFlag = "-1";
        DbMessage dbMessage = new DbMessage(args);
        if (dbMessage.getDatabaseType().toUpperCase().equals("MYSQL")) {
            dbMessage.setDrivername("jdbc:mysql://");
            dbMessage.setClassName("com.mysql.jdbc.Driver");
            dbMessage.setSql_log("select 0");
            Database database = createDb(MysqlDb.factory);
            logFlag = database.getlogFlag(dbMessage);
        }
        if (dbMessage.getDatabaseType().toUpperCase().equals("ORACLE")) {
            dbMessage.setDrivername("jdbc:oracle:thin:@//");
            dbMessage.setClassName("oracle.jdbc.driver.OracleDriver");
            dbMessage.setSql_log("select 0 from dual");
            Database database = createDb(OracleDb.factory);
            logFlag = database.getlogFlag(dbMessage);
        }
        if (dbMessage.getDatabaseType().toUpperCase().equals("SYBASE")) {
            dbMessage.setDrivername("jdbc:sybase:Tds:");
            dbMessage.setClassName("com.sybase.jdbc2.jdbc.SybDriver");
            dbMessage.setSql_log("select 0 as '0'");
            Database database = createDb(SybaseDb.factory);
            logFlag = database.getlogFlag(dbMessage);
        }
        System.out.println(logFlag);
    }


}
