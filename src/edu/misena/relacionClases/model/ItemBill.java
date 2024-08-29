package edu.misena.relacionClases.model;

public class ItemBill {
    private Product product;
    private int cantidad;

    public ItemBill(Product producto, int cantidad) {
        this.product = producto;
        this.cantidad = cantidad;
    }

    public Product getProducto() {
        return product;
    }

    public void setProducto(Product producto) {
        this.product = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float calcularImporte() {
        return (float) (cantidad * product.getPrecio());
    }

    @Override
    public String toString() {
        return product + "\t" + cantidad + "\t" + calcularImporte();
    }
}
