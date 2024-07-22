package sistema_facturacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Sistema_Facturacion {

    public static double PagarFactura(Factura factura){
        double impuesto, subtotal=0, totalPagar;        
        for(int i = 0; i<factura.getProductos().size();i++){
            Producto articulo = factura.getProductos().get(i);
            subtotal = subtotal + (articulo.getCantidad() * articulo.getPrecio());
        }
        impuesto = subtotal * 0.15;
        totalPagar = subtotal + impuesto;
        return totalPagar;
    }
    
    
    public static void main(String[] args) {
        try{
           CategoriaProducto bebida = new CategoriaProducto("Bebida",1);
           CategoriaProducto comida = new CategoriaProducto("Comida",2);
           CategoriaProducto higiene = new CategoriaProducto("Higiene",3);
           Producto pepsi = new Producto("Pepsi",20.00,bebida,5);
           Producto galleta = new Producto("Galleta",17.00,comida,3);
           Producto desodorante = new Producto("Desodorante",75,higiene,1);
           Cliente cliente1 = new Cliente("Manuel","050119999003090","SPS","94985044");
           Factura factura1 = new Factura(1,"21/07/2024",cliente1);
           factura1.AgregarProducto(pepsi);
           factura1.AgregarProducto(galleta);
           factura1.AgregarProducto(desodorante);
           JOptionPane.showMessageDialog(null,"El total a pagar es: L" + PagarFactura(factura1));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
