
package ordenvehiculo;

public class Vehiculo {
    
    private String placa;
    private String marca;
    private float vMax;

    public Vehiculo(String placa, String marca, float vMax) {
        this.placa = placa;
        this.marca = marca;
        this.vMax = vMax;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public float getvMax() {
        return vMax;
    }
    
    
}
