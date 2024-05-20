
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.ucu.aed;

/**
 *
 * @author jechague
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear una tabla de tipo THash e insertar las claves del archivo "claves_insertar.txt"
        THash tabla = new THash();
        String[] inserciones = ManejadorArchivosGenerico.leerArchivo("UT6_TA1-main/src/main/java/uy/edu/ucu/aed/claves_insertar.txt");
        for (String clave : inserciones) {
            tabla.insertar(Integer.parseInt(clave));
        }

        
        // Buscar en la tabla creada anteriormente las claves indicadas en el archivo "claves_buscar.txt"
        String[] busquedas = ManejadorArchivosGenerico.leerArchivo("UT6_TA1-main/src/main/java/uy/edu/ucu/aed/claves_buscar.txt");
        for (String clave : busquedas) {
            int intentos = tabla.buscar(Integer.parseInt(clave));
            if (intentos == -1) {
                System.out.println("La clave " + clave + " no se encuentra en la tabla");
            } else {
                System.out.println("La clave " + clave + " se encuentra en la tabla y se encontro tras: " + intentos + " intentos");
            }
        }

        System.out.println(tabla.capacidad);

    }
    
}
