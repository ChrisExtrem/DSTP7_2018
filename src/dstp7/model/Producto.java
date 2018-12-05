package dstp7.model;
public class Producto {
    
    private int Codigo;
    private String Descripcion;
    private double Precio;
    private Rubro Rubro;
    
    public Producto()
    {

    }
    
    public Producto(int codigo, String descripcion, double precio, Rubro rubro)
    {
        Codigo = codigo;
        Descripcion = descripcion;
        Precio = precio;
        Rubro = rubro;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Rubro getRubro() {
        return Rubro;
    }

    public void setRubro(Rubro Rubro) {
        this.Rubro = Rubro;
    }
        
}
