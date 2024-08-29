package edu.misena.relacionClases.model;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Bill {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Client client;
    private ItemBill[] items;
    private int indiceItems;
    private static final int MAX_ITEMS = 100;
    private static int ultimoFolio = 0;

    public Bill (String descripcion, Client client) {
        this.descripcion = descripcion;
        this.client = client;
        this.fecha = new Date();
        this.items = new ItemBill[MAX_ITEMS];
        this.indiceItems = 0;
        this.folio = generarFolio();
    }

    private int generarFolio() {
        ultimoFolio++;
        return ultimoFolio;
    }

    public void addItemBill(ItemBill item) {
        if (indiceItems < MAX_ITEMS) {
            items[indiceItems++] = item;
        } else {
            System.out.println("No se pueden agregar más ítems a la factura.");
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemBill item : items) {
            if (item != null) {
                total += item.calcularImporte();
            }
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Numero: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.client.getNombre())
                .append("\t NIF: ")
                .append(client.getnif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n")

        ;

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\t   Nombre\t   $\tCant.\t   Total\n");

        for (ItemBill item : items) {
            if (item == null) {
                continue;
            }
            sb.append(item)
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
