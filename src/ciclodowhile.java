public class ciclodowhile {
    static void main(String[] args) {
        double monto;
        do{
            monto = 0;
            System.out.println(" Monto invalido: $" +monto);
            monto=10000;
        }while (monto<=0);
        System.out.println("Monto apertura valido: " + monto);
    }
}
