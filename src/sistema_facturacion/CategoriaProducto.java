package sistema_facturacion;

public class CategoriaProducto {
    private String nombre;
    private int pasillo;
    
    CategoriaProducto(String nombre, int pasillo) throws Exception{
        if(nombre.isEmpty()){
            throw new Exception("Por favor ingrese un nombre a la categoria de producto");
        }
        if(pasillo<0){
            throw new Exception("Por favor ingrese un pasillo valido para la categoria " + nombre);
        }
        this.nombre = nombre;
        this.pasillo = pasillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }
    
    
}
