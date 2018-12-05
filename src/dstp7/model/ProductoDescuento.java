package dstp7.model;
public class ProductoDescuento {
    private Producto Producto;
    private int Cantidad;
    
    public ProductoDescuento(){}
    public ProductoDescuento(Producto producto,int cantidad){
        Producto = producto;
        Cantidad = cantidad;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
}
