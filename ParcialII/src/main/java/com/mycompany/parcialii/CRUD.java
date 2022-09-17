/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcialii;

import java.sql.*;

/**
 *
 * @author alumno
 */
public class CRUD {
    
    public static void main(String[] args) {
        
         consultanombre();
         sumames();
    }
    
    
   public static void info(){
   
        String url = "jdbc:mysql://localhost:3306/dbvendedores?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
  
            Connection conexion = DriverManager.getConnection(url,"root","12345678");
  
            Statement sentencia = (Statement) conexion.createStatement();

            String sql = "SELECT * FROM empleados";
 
            ResultSet resultado = sentencia.executeQuery(sql);
            System.out.println("\t- INFORMACION GENERAL -");

             while(resultado.next()){
                System.out.println("\n~~NIV~~: "+resultado.getInt(1));
                System.out.println("Nombre del empleado: "+resultado.getString(2));
                System.out.println("Cantidad Enero: "+resultado.getInt(3));
                System.out.println("Cantidad Febrero: "+resultado.getInt(4));
                System.out.println("Cantidad Marzo: "+resultado.getInt(5));
                System.out.println("Cantidad Abril: "+resultado.getInt(6));
                System.out.println("Cantidad Mayo: "+resultado.getInt(7));
                System.out.println("Cantidad Junio: "+resultado.getInt(8));
                
            }

                
            
        } catch (SQLException ex) {
           System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
           
   public static void totalT() {
         
        String url = "jdbc:mysql://localhost:3306/dbvendedores?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {

            Connection conexion = DriverManager.getConnection(url,"root","12345678");

            Statement sentencia = (Statement) conexion.createStatement();

            String sql = "SELECT SUM(enero) + SUM(febrero) + SUM(marzo) + SUM(abril) + SUM(mayo) + SUM(junio) FROM empleados";

            ResultSet resultado = sentencia.executeQuery(sql);

            System.out.println("\t- SUMA TOTAL -");

             while(resultado.next()){
                System.out.println("\n - Total de todos los meses: "+resultado.getInt(1));
              
                
            }

                
            
        } catch (SQLException ex) {
           System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
    
   public static void consultanombre() {
     
        String url = "jdbc:mysql://localhost:3306/dbvendedores?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
  
            Connection conexion = DriverManager.getConnection(url,"root","12345678");

            Statement sentencia = (Statement) conexion.createStatement();
       
            String sql = "SELECT (nombre_vendedor) FROM empleados";

            ResultSet resultado = sentencia.executeQuery(sql);

             System.out.println("\t- NOMBRE DE EMPLEADOS -");
             while(resultado.next()){
               
                System.out.println("- Nombre del empleado: "+resultado.getString(1));
              
                
            }

                
            
        } catch (SQLException ex) {
           System.out.println("Hubo clavo:"+ex.getMessage());
        }
     }
   
   public static void sumames() {
   String url = "jdbc:mysql://localhost:3306/dbvendedores?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
   
            Connection conexion = DriverManager.getConnection(url,"root","12345678");
 
            Statement sentencia = (Statement) conexion.createStatement();

            String sql = "SELECT SUM(enero), SUM(febrero), SUM(marzo), SUM(abril), SUM(mayo), SUM(junio) FROM empleados";

            ResultSet resultado = sentencia.executeQuery(sql);
            System.out.println("\t- TOTAL DE CADA MES -");

             while(resultado.next()){
                System.out.println("- Total del mes de Enero: "+resultado.getInt(1));
                System.out.println("- Total del mes de Febrero: "+resultado.getInt(2));
                System.out.println("- Total del mes de Marzo: "+resultado.getInt(3));
                System.out.println("- Total del mes de Abril: "+resultado.getInt(4));
                System.out.println("- Total del mes de Mayo: "+resultado.getInt(5));
                System.out.println("- Total del mes de Junio: "+resultado.getInt(6));
              
                
            }

                
            
        } catch (SQLException ex) {
           System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
   
    public static void eliminar() {
     
        String url = "jdbc:mysql://localhost:3306/dbvendedores?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
  
            Connection conexion = DriverManager.getConnection(url,"root","12345678");

            Statement sentencia = (Statement) conexion.createStatement();
       
            String sql = "DELETE from empleados where niv=?";

            ResultSet resultado = sentencia.executeQuery(sql);

             System.out.println("\t- NOMBRE DE EMPLEADOS -");
             while(resultado.next()){
               
                System.out.println("- Nombre del empleado: "+resultado.getString(1));
              
                
            }

                
            
        } catch (SQLException ex) {
           System.out.println("Hubo clavo:"+ex.getMessage());
        }
     }
   }






