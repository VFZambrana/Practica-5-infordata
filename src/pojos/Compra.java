package pojos;

import java.util.Date;

public class Compra {
    private Producto producto;
    private Proveedor proveedor;
    private Date fecha;
    private int cantidad;

    public Compra(Producto producto, Proveedor proveedor, Date fecha, int cantidad) {
        this.setProducto(producto);
        this.setProveedor(proveedor);
        this.setFecha(fecha);
        this.setCantidad(cantidad);
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
