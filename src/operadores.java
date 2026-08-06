public class operadores {
    static void main(String[] args) {
        final double DESCUENTO = 0.15;
        int subtotal = 42500;
        boolean tieneDescuento = false;
        double valorDescuento = 0;
        double totalPagar = 0;

        if (subtotal>30000){
            valorDescuento = subtotal * DESCUENTO;
            totalPagar = subtotal - valorDescuento;
            tieneDescuento = true;

            System.out.println("Descuento del 15% es: "+valorDescuento+
                    "\nEl total es de: "+totalPagar +
                    "\n¿Tiene derecho al descuento? " + tieneDescuento);
        }else {
            totalPagar = subtotal;
            System.out.println("El total es de: " + subtotal);
        }
    }
}
