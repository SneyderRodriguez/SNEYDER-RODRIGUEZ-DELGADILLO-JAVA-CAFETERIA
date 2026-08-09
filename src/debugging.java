public class debugging {
    static void main(String[] args) {
        int cantidadVendida = 5; /*El tipo de dato int, solo almacena valores númericos, no texto*/
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario;/*Falta el punto y coma, que es el cierre de la declaración*/
        boolean aplicaDescuento = (total > 20000);
        if (aplicaDescuento == true) /*Error en el operador no está comparando esta asignando*/
        { total = total - (total * 0.10); }
        System.out.println("Total: " + total);
    }
}
