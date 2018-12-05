package dstp7.model;
public class Rubro {
 
  private int Codigo;
  private String Descripcion;
  
  public Rubro(){}
  
  public Rubro(int codigo, String descripcion){
     Codigo = codigo;
     Descripcion = descripcion;
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
  
}
