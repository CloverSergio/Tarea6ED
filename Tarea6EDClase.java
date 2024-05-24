
package tarea6ed;
/**
 * Clase Tarea6EDClase la clase funciona para aplicar descuentos a productos dependiendo de la cantidad de productos.
 *
 * @author USER
 */
public class Tarea6EDClase {
    /**
     * 
     * @param precioProducto el precio del producto al que se va a aplciar el descuento.
     * @param numProductos dependiendo de la cantidad de productos se aplica un descuento en específico.
     * 
     */
    public void aplicarDescuento(double precioProducto, int numProductos){     
        introducirDescuento(numProductos, precioProducto);   
    }
    /**
     * 
     * @param numProductos dependiendo de la cantidad de productos se aplica un descuento en específico.
     * @param precioProducto el precio del producto al que se va a aplciar el descuento.
     * 
     * 
     */
    public void introducirDescuento(int numProductos, double precioProducto) {
        //cantidad de la que se va a calcular el total de descuento
        double cantidadTotal;
        if(numProductos>NUMERO_PRODUCTOS_3){
            precioProducto-=5;
            if (numProductos!=SIN_PRODUCTOS){
                cantidadTotal = precioProducto*NUMERO_PAGAR_NO_PRODUCTOS;
                System.out.println("El total a pagar es:"+cantidadTotal);
                System.out.println("Enviado");
            }else {
                cantidadTotal = precioProducto*NUMERO_A_PAGAR_MAYOR_3;
                System.out.println("El total a pagar es:"+cantidadTotal);
                System.out.println("Enviado");

            }
        }
    }
    private static final double NUMERO_A_PAGAR_MAYOR_3 = 0.95;
    private static final double NUMERO_PAGAR_NO_PRODUCTOS = 0.8;
    private static final int SIN_PRODUCTOS = 0;
    private static final int NUMERO_PRODUCTOS_3 = 3;
    
}
