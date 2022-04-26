package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBase{
    public static void main(String[] args) {
        /*try{
            Connection baglanti=DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement statement= baglanti.createStatement();
            statement.execute("CREATE TABLE Person( vorname TEXT, nachname TEXT, email TEXT");


            statement.close();
            baglanti.close();


        }catch(SQLException e){
            e.printStackTrace();
        }*/
        try(Connection baglanti=DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement statement = baglanti.createStatement();){
            statement.execute("CREATE TABLE kisiler(isim TEXT, email TEXT");
            statement.execute("INSERT INTO kisiler(isim, email) VALUES ('doa','doacagli')");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
