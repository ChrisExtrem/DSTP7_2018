package dstp7.model;
import java.util.ArrayList;
public class Regla3 implements IRegla{
        private static final double porcentaje = 0.3d;
        @Override
        public double RealizarDescuento(Venta venta){
            double descuento = 0;
            ArrayList<ProductoDescuento> productos = new ArrayList<>();
            for (LineaVenta Detalle : venta.Detalle()) {
                if ("Lacteos".equals(Detalle.getProducto().getRubro().getDescripcion()) 
                        || "Verduras".equals(Detalle.getProducto().getRubro().getDescripcion())) {
                    boolean existe = false;
                    for (ProductoDescuento productoDescuento : productos) {
                        if (productoDescuento.getProducto().getCodigo() == Detalle.getProducto().getCodigo()) {
                            existe = true;
                            productoDescuento.setCantidad(productoDescuento.getCantidad() + Detalle.getCantidad());
                            break;
                        }
                    }
                    if (!existe) {
                        productos.add(new ProductoDescuento(Detalle.getProducto(),Detalle.getCantidad()));
                    }
                }
            }

            for(ProductoDescuento productoDescuento : productos)
            {
                if (productoDescuento.getCantidad() == 2)
                {
                    descuento += productoDescuento.getProducto().getPrecio() * porcentaje;
                }
                else if (productoDescuento.getCantidad() > 2 && productoDescuento.getCantidad() <= 5)
                    {
                        descuento += productoDescuento.getProducto().getPrecio() * (productoDescuento.getCantidad()-1) * porcentaje;
                    }    
                    else if(productoDescuento.getCantidad()!=1)
                        {
                            descuento += productoDescuento.getProducto().getPrecio() * 4 * porcentaje;
                        }
            }
            return descuento;
        }
    }
