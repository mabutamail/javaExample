package com.github.mabutamail.javatemplate.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HsqlDb {

    private static Connection getHsqldbConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:hsqldb:mem:test");
    }

}