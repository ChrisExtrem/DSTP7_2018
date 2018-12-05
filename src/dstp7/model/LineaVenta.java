package dstp7.model;
public class LineaVenta {
    
    private int Cantidad; 
    private Producto Producto;
    private double Precio;

    public LineaVenta(){}

    public LineaVenta(Producto producto, int cantidad){
          Producto = producto;
          Cantidad = cantidad;
          Precio = producto.getPrecio();
    }

    public double SubTotal(){
       return Precio*Cantidad; 
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
}
