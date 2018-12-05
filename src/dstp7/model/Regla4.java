package dstp7.model;
import java.util.ArrayList;
public class Regla4 implements IRegla{
        private static final double porcentaje = 0.1d;
        @Override
        public double RealizarDescuento(Venta venta){
            if (venta.Total() < 1000) return 0;

            double descuento = 0;
            ArrayList<ProductoDescuento> productos = new ArrayList<>();
            
            for (LineaVenta Detalle : venta.Detalle()) {
                boolean existe = false;
                for (ProductoDescuento productoDescuento : productos) {
                    if (productoDescuento.getProducto().getCodigo() != Detalle.getProducto().getCodigo()) {
                        existe = true;
                        productoDescuento.setCantidad(productoDescuento.getCantidad() + Detalle.getCantidad());
                        break;
                    }
                }
                if (existe) {
                    productos.add(new ProductoDescuento(Detalle.getProducto()));
                }
            }
            for(ProductoDescuento productoDescuento : productos){
                if (productoDescuento.getCantidad() > 3)
                {
                    descuento += productoDescuento.getProducto().getPrecio() *  porcentaje;
                }
            }
            return descuento;
        }
    }
