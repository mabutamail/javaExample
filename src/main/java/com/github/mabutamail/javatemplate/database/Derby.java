package com.github.mabutamail.javatemplate.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Derby {

    private static Connection getDerbyConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:derby:memory:test;create=true");
    }

}