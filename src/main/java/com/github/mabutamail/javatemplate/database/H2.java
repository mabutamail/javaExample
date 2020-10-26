package com.github.mabutamail.javatemplate.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2 {

    private static Connection getH2Connection() throws SQLException {
//        return DriverManager.getConnection("jdbc:h2:mem:");
//        return DriverManager.getConnection("jdbc:h2:/file");
        return DriverManager.getConnection("jdbc:h2:mem:database");
//        return DriverManager.getConnection("jdbc:h2:tcp://server/file");
    }

}