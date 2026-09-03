public class Main {

    public static void main(String[] args) {

        Vino vino = new Vino("Malbec Reserva", "Malbec", 8500, 50);

        vino.venderBotellas(10);

        vino.reponerStock(20);

        vino.mostrarInventario();
    }
}