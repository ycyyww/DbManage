package com.asiainfo.domain;

/**
 * Company:AsiaInfo Linkage
 * User: YcY_YcY
 * Date: 14-7-30 上午9:27
 * Description:
 */
public class DbMessage {
    private String databaseType;
    private String className;
    private String user;
    private String passWord;
    private String dbAddress;
    private String dbPort;
    private String dbName;
    private String url;
    private String tableSpaceName;
    private String drivername ;
    private String sql_log;



    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDbAddress() {
        return dbAddress;
    }

    public void setDbAddress(String dbAddress) {
        this.dbAddress = dbAddress;
    }

    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTableSpaceName() {
        return tableSpaceName;
    }

    public void setTableSpaceName(String tableSpaceName) {
        this.tableSpaceName = tableSpaceName;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getSql_log() {
        return sql_log;
    }

    public void setSql_log(String sql_log) {
        this.sql_log = sql_log;
    }

    /**
     * 根据传入的数组信息 得到封装后的数据库信息对象
     * 判断数据库登陆状态时传入6个参数
     * 判断数据库表空间时传入7个参数
     *
     * @param args
     */
    public DbMessage(String[] args) {
        user = args[0];
        passWord = args[1];
        databaseType = args[2];
        dbAddress = args[3];
        dbPort = args[4];
        dbName = args[5];
    }
}
