/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenvehiculo;

/**
 *
 * @author 301
 */
public class OrdenVehiculo {

    public static void main(String[] args) {
    	
        Automovil auto   = new Automovil(5, "ABC-123", "Toyota", 180.0f);
        Camion    camion = new Camion(10000, "XYZ-789", "Volvo", 120.1f);

        
        Conductor c1 = new Conductor("Carlos López", 1001, "8", auto);
        Conductor c2 = new Conductor("Ana Pérez",    1002, "5", camion);

        
        c1.mostrarInfo();
        System.out.println();
        c2.mostrarInfo();
        
        
    }
    
}
