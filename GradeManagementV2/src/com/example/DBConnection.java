package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static final String DBDRIVER;
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;

    static {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("./dbinfo.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        DBDRIVER = props.getProperty("DBDRIVER");
        URL = props.getProperty("DBURL");
        USER = props.getProperty("DBUSER");
        PASSWORD = props.getProperty("DBPASSWD");
    }

    public Connection getConnection() {
        try {
            Class.forName(DBDRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
