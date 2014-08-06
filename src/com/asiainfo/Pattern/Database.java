package com.asiainfo.Pattern;

import com.asiainfo.dbUtil.DbUtil;
import com.asiainfo.domain.DbMessage;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Company:AsiaInfo Linkage
 * User: YcY_YcY
 * Date: 14-7-30 上午9:17
 * Description:
 */
public abstract class Database {
    /**
     * 根据数据库信息得到数据库Url
     *
     * @param dbMessage
     * @return
     */
    public String getUrl(DbMessage dbMessage) {
        return dbMessage.getDrivername() + dbMessage.getDbAddress() + ":" + dbMessage.getDbPort() + "/" + dbMessage.getDbName();
    }


    /**
     * 获取登陆状态
     *
     * @param dbMessage
     * @return
     */
    public String getlogFlag(DbMessage dbMessage) {
        Connection conn = null;
        String logFlag = "-1";
        DbUtil dbUtil = new DbUtil();
        String url = getUrl(dbMessage);
        try {
            conn = dbUtil.startConn(dbMessage.getClassName(), url, dbMessage.getUser(), dbMessage.getPassWord());
            logFlag = dbUtil.getSqlResult(dbMessage.getSql_log(), conn);
        } catch (ClassNotFoundException e) {
            System.out.println("-1");
        } catch (SQLException e) {
            System.out.println("-1");
        }
        return logFlag;
    }


}
