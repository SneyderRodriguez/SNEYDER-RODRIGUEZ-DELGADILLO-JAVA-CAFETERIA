public class ciclowhile {
    static void main(String[] args) {
        int unidades = 50;
        int pedido = 3;

        while (unidades>=10){
            unidades -=pedido;
            System.out.println("Inventario restante = " + unidades);
        }
    }
}
