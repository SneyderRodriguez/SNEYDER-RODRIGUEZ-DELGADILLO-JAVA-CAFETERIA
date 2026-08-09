public class Cafeteria {
    static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuccino", "Jugo de naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'};
        int[] pedidoProducto ={0,2,1,4,0,3};
        int[] pedidoCantidad = {2,1,3,1,1,2};
        double subTotal;
        double total;
        final double DESCUENTO = 0.10;
        double descuento = 0;
        for (int i=0; i< pedidoProducto.length; i++){
            System.out.println(nombres[pedidoProducto[i]] + " Categoria-" + categorias[pedidoProducto[i]]);
            switch (categorias[pedidoProducto[i]]) {
                case 'B':
                    System.out.println("Bebida caliente");
                    break;
                case 'F':
                    System.out.println("Bebida fría");
                    break;
                case 'C':
                    System.out.println("Comida");
                    break;
                case 'P':
                    System.out.println("Postre");
                    break;
                default:
                    System.out.println("Categoría desconocida");
            }
            subTotal=precios[pedidoProducto[i]] * pedidoCantidad[i];
            total = subTotal;
            if (subTotal>12000){
                descuento = subTotal * DESCUENTO;
                total = subTotal - descuento;
                System.out.println("Descuento aplicado: $" + descuento);
            }else {
                System.out.println("Descuento no aplicado");
            }
            System.out.println("Total: $" + total);
        }
    }
}
