public class Vino {
    private String etiqueta;
    private String varietal;
    private double precio;
    private int stockBotellas;


    public Vino(String etiqueta, String varietal, double precio, int stockBotellas) {
        this.etiqueta = etiqueta;
        this.varietal = varietal;
        this.precio = precio;
        this.stockBotellas = (stockBotellas >= 0) ? stockBotellas : 0;
    }

    public void venderBotellas(int cantidad) {
        if (cantidad <= stockBotellas) {
            stockBotellas = stockBotellas - cantidad;
            System.out.println("Venta realizada.");
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }

    public void reponerStock(int cantidad) {
        stockBotellas = stockBotellas + cantidad;
        System.out.println("Stock repuesto.");
    }

    public void mostrarInventario() {
        System.out.println("----- INVENTARIO DEL VINO -----");
        System.out.println("Etiqueta: " + etiqueta);
        System.out.println("Varietal: " + varietal);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stockBotellas + " botellas");
    }
}

