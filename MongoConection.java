/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mongo.conection;

/**
 *
 * @author marib
 */
public class MongoConection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conection conexion = new Conection();

        conexion.Mostrar();
           conexion.insertar("Alexis Monjaraz");
        System.out.println("Otro");
          conexion.Mostrar();
        System.out.println("otro mas");
          conexion.Actualizar("Alexis Monjaraz","Axel Garcia");
        conexion.Eliminar("Axel Garcia");
        conexion.Mostrar();
    }
    
}
