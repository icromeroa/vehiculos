/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 301
 */
public class Camion extends Vehiculo {
    
    private double capCarga;
    
    public Automovil(double capCarga, String placa, String marca, double v_max ) {
        super (placa, marca, vMax);
        
        this.capCarga = capCarga;
    }

    public double getCapCarga() {
        return capCarga;
    }
}
