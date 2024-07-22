package sistema_facturacion;

public class Producto {
    private String nombre;
    private double precio;
    private CategoriaProducto categoria;
    private int cantidad;
    
    Producto(String nombre, double precio, CategoriaProducto categoria, int cantidad) throws Exception{
        if(nombre.isEmpty()){
            throw new Exception("Por favor ingrese el nombre del producto");
        }
        if(precio<=0){
            throw new Exception("El precio del producto ingresado: " + nombre + " no es valido");
        }
        if(cantidad<=0){
            throw new Exception("Por favor ingrese una cantidad correcta para: " + nombre);
        }
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
