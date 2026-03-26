/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 301
 */
public class Automovil extends Vehiculo {

    private int n_pasajeros;

    public Automovil(int n_pasajeros, String placa, String marca, float v_Max ) {
        super (placa, marca, vMax);
        this.n_pasajeros = n_pasajeros;
    }

    public int getN_pasajeros() {
        return n_pasajeros;
    }
    
}
