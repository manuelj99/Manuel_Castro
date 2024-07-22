package sistema_facturacion;

import java.util.ArrayList;

public class Factura {
    private int numero;
    private String fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    
    void AgregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
    Factura(int numero, String fecha, Cliente cliente) throws Exception{
        if(numero<0){
            throw new Exception("Por favor ingrese numero de factura valido");
        }
        if(fecha.isEmpty()){
            throw new Exception("Por favor ingrese una fecha para la factura numero " + numero);
        }
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        productos = new ArrayList();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> producto) {
        this.productos = producto;
    }
    
    
    
    
}
