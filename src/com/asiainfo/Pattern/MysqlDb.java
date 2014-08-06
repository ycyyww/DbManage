package com.asiainfo.Pattern;

import com.asiainfo.dbUtil.DbUtil;
import com.asiainfo.domain.DbMessage;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Company:AsiaInfo Linkage
 * User: YcY_YcY
 * Date: 14-7-30 ионГ9:18
 * Description:
 */
public class MysqlDb extends Database {
    /**
     *
     */
    public static DatabaseFactory factory = new DatabaseFactory() {
        public Database getDatabase() {
            return new MysqlDb();
        }
    };
}
