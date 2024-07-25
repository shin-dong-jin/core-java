package com.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClose {
    public static void dbClose(Connection connection, Statement statement) {
        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
