public class variablestipodatos {
    static void main(String[] args) {
        String nomproducto = "Capucchino";
        double precio = 2.500;
        int cantinventario = 15;
        boolean disponibilidad = true;
        char codigo = 'R';

        String nomb = String.format("Pedido: %s", nomproducto);
        System.out.println(nomb);

        String valor = String.format("Precio: %.2f", precio);
        System.out.println(valor);

        String inventario = String.format("¿Cuantos hay en inventario?: %d", cantinventario);
        System.out.println(inventario);

        String dispo = String.format("Disponbles: %b", disponibilidad);
        System.out.println(dispo);

        String cod = String.format("Código: %c", codigo);
        System.out.println(cod);
    }
}
