package org.jcoretechnology.com.secondstamps.section5;

import java.io.InputStream;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.util.Iterator;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.secondstamps.section5</p>
　 * <p>Title: Jdbctest.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年8月16日 上午11:52:42
　 * @version 1.0
*/
public class Jdbctest {

    public static void main(String[] args) throws SQLException {
        SQLException sqlException = new SQLException();
        SQLException nextException = sqlException.getNextException();
        Iterator<Throwable> iterator = sqlException.iterator();
        String sqlState = sqlException.getSQLState();
        int errorCode = sqlException.getErrorCode();
        
        Connection connection = DriverManager.getConnection("");
        
        DatabaseMetaData metaData = connection.getMetaData();
//        metaData.getTables(catalog, schemaPattern, tableNamePattern, types)
        
        
        
        PreparedStatement prepareStatement = connection.prepareStatement("");
        boolean execute = prepareStatement.execute();
        
        ResultSet resultSet = prepareStatement.getResultSet();
        
        prepareStatement.getUpdateCount();
        
        int sqlStateType = metaData.getSQLStateType();
        ResultSetMetaData metaData2 = prepareStatement.getMetaData();
        
        SQLWarning warnings = prepareStatement.getWarnings();
        String sqlState2 = warnings.getSQLState();
        int errorCode2 = warnings.getErrorCode();
        
        
        boolean next = resultSet.next();
        
        Blob blob = resultSet.getBlob(1);
        InputStream binaryStream = blob.getBinaryStream();
//        blob.getBytes(pos, length)
        Clob clob = resultSet.getClob(2);
        
        Reader characterStream = clob.getCharacterStream();
//        clob.getSubString(pos, length)
        
        prepareStatement.getMoreResults();
        
        
        
        
        int executeUpdate = prepareStatement.executeUpdate("", Statement.RETURN_GENERATED_KEYS);
        ResultSet generatedKeys = prepareStatement.getGeneratedKeys();
        int key = resultSet.getInt(1);
        
        Statement createStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        boolean execute2 = createStatement.execute("");
        ResultSet resultSet2 = createStatement.getResultSet();
        boolean previous = resultSet2.previous();
        int row = resultSet2.getRow();
        
        
        
        
        
        
        
        
        
    }
}
