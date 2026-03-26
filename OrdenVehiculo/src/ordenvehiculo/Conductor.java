
package ordenvehiculo;


public class Conductor {
    private String nombre;
    private int id;
    private String aniosExp;
    private Vehiculo vehiculoAsignado;

    public Conductor(String nombre, int id, String aniosExp, Vehiculo vehiculoAsignado) {
        super(placa, marca, vMax);
        this.nombre = nombre;
        this.id = id;
        this.aniosExp = aniosExp;
        this.vehiculoAsignado = vehiculoAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getAniosExp() {
        return aniosExp;
    }
    public Vehiculo getVehiculo(){
    	return vehiculoAsignado; 
    }
    
    public void mostrarInfo(){
        System.out.println("-----Informaciòn conductor-----" );
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Años de experiencia" + aniosExp);
        
        System.out.println("-----Informaciòn vehìculo asignado-----" );
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Velocidad màxima: " + getvMax());
        
    }
}
