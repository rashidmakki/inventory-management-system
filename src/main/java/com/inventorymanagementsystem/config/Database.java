package com.inventorymanagementsystem.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Database {
    private static String CONFIG_FILE="application.properties";
    public static Connection connectDB(){
        Properties dbConfig=new Properties();
        InputStream input = null;
      try{
          URL url=ClassLoader.getSystemResource(CONFIG_FILE);
          input = new FileInputStream(url.getFile());;
          dbConfig.load(input);
          Class.forName(dbConfig.getProperty("javafx.jdbc.driver"));
          Connection connection=DriverManager.getConnection(dbConfig.getProperty("javafx.datasource.url"),dbConfig.getProperty("javafx.datasource.username"), dbConfig.getProperty("javafx.datasource.password"));
          return connection;
      }catch (Exception exception){
        exception.printStackTrace();
      }
      return null;
    }
}
