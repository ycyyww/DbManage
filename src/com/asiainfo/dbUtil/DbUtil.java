package com.asiainfo.dbUtil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DbUtil {

    public Connection startConn(String className,String url, String user, String passWord) throws ClassNotFoundException,
            SQLException {

        Class.forName(className);
        return DriverManager.getConnection(url, user, passWord);
    }

    /**
     * @param sql
     * @param conn
     * @return
     */
    public String getSqlResult(String sql, Connection conn) {
        Statement stmt = null;
        ResultSet rs = null;
        String str = "";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                str = rs.getString("0");
            }
        } catch (SQLException e) {
        } finally {
            closeConn(rs, stmt);
        }
        return str;
    }


    /**
     * @param sql
     * @param conn
     * @return
     */
    public String getUsedPrecent(String sql, Connection conn) {
        Statement stmt = null;
        ResultSet rs = null;
        String str = "";
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                str = rs.getString("usedprecent");
            }
        } catch (SQLException e) {
        } finally {
            closeConn(rs, stmt);
        }
        return str;
    }

    /**
     * @param rs
     * @param stmt
     */
    public void closeConn(ResultSet rs, Statement stmt) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            System.out.println("-1");
        }
    }

    /**
     * @param stmt
     * @param conn
     */
    public void closeConn(Statement stmt, Connection conn) {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("-1");
        }
    }
}
