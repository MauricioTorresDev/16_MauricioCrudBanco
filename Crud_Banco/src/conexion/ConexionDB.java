/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionDB {
      Connection cn;
    
   public ConexionDB(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://informacion.chqioqk0ipth.us-east-1.rds.amazonaws.com:3306/banco_db", "mauricio", "Colegio202420");
    } catch (Exception e)  {
            System.out.println("Error:"+ e);
    }
  }    
   public Connection getConnection(){
       return cn;
   }
}

