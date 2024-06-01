package com.excepciones.java.tryrecurso;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class PruebaSQLite {
    public static void main(String[] args) {
        
        //jdbc: java database connector:
        //necesitara el driver especifico p´ra 
        //sqlite
        //1. Establecer la ubi?cación de la base de datos:
        String ubicacion = "jdbc:sqlite:C:/Users/APRENDIZ/Desktop/2826502Ex/excepciones/chinook.db" ;
        String consulta = "SELECT art.Name AS nombre_artista " + 
                          "alb.Title AS titulo_album"+   
                          "FROM artists art, albums alb " + "WHERE art.ArtistId = alb.ArtistId" + "AND art.Name='Aerosmith'";
        
        
        try(Connection conn = DriverManager.getConnection(ubicacion);
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(consulta);  ){
            //2. Establecer (abrir) una conexión a dicho recurso
            //3. Manejar la excepción
            //4. Tratamiento de datos ResulSet
            //5.Presentacion de datos:

            while ((resultSet.next())) {
                //Recorrer lods registros obtenidos
                String nombre = resultSet.getString("nombre_artista"); 
                String titulo = resultSet.getString("titulo_album");   
                System.out.println("Artista: " + nombre + ", Titulo" + titulo);            
            };   
            System.out.println("Conexion exitosa");
            conn.close();
        }catch(SQLException sqlex){
           System.out.println(sqlex.getMessage());
        }finally{
            
        }    
    }


}
