package sistema_facturacion;

public class Cliente {
    private String nombre;
    private String rtn;
    private String direccion;
    private String telefono;
    
    Cliente(String nombre, String rtn, String direccion, String telefono) throws Exception{
        if(nombre.isEmpty()){
           throw new Exception("Ingrese un nombre de cliente"); 
        }
        if(rtn.isEmpty()){
           throw new Exception("Por favor ingrese el RTN del cliente " + nombre); 
        }
        if(direccion.isEmpty()){
           throw new Exception("Ingrese la direccion de " + nombre); 
        }
        if(telefono.isEmpty()){
           throw new Exception("Por favor ingrese la direccion del cliente " + nombre); 
        }
        
        this.nombre = nombre;
        this.rtn = rtn;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
