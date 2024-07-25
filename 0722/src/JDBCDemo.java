/* [JDBC] Java - Database 연결
    1. import java.sql.*
    2. load MySQL Driver: Connector/J
    3. memory에 loading된 MySQL driver를 이용하여 Connection하자
    4. Statement 객체 생성
    5. Statement 객체를 이용하여 SQL 실행하자
    6. ResultSet의 결과를 Parsing하자
    7. connection, statement, resultSet을 반드시 close하자
 */

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("");
            System.out.println("Class Found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }

//        DriverManager.registerDriver();
        Connection connection = null;
        try {
            String url = "";
            connection = DriverManager.getConnection(url, "", "");
            System.out.println("Connection Established");
        } catch (SQLException e) {
            System.out.println("Connection Failed");
        }
        
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Statement Creation Failed");
        }

        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("SELECT now(), version();"); // SELECT: executeQuery();
        } catch (SQLException e) {
            System.out.println("Query Syntax Error");
        }

        try {
            resultSet.next();
            String now = resultSet.getString(1);
            String version = resultSet.getString(2);
            System.out.println(now + ", " + version);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
