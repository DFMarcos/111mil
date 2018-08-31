package banco;
public class Cliente {
    private String nombre;
    private int dni;
    private String motivo;
    
    public Cliente (String nombre, int dni, String motivo){
        this.nombre = nombre;
        this.dni = dni;
        this.motivo = motivo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getDni(){
        return dni;
    }
    public void setDni (int dni){
        this.dni = dni;
    }
    public String getMotivo (){
        return motivo;
    }
    public void setMotivo (String motivo){
        this.motivo = motivo;
    }
    
    @Override
    public String toString(){
        return "Cliente: Nombre: "+nombre+". DNI: "+dni+". Motivo: "+motivo;
    }
}