public class suitch {
    static void main(String[] args) {
        char categoria = 'B';

        switch (categoria){
            case 'B':
                System.out.println("Bebida caliente" + "\nIVA 0%");
                break;
            case 'F':
                System.out.println("Bebida fría" + "\nIVA 5%");
                break;
            case 'C':
                System.out.println("Comida" + "\nIVA 8%");
                break;
            case 'P':
                System.out.println("Postre" + "\nIVA 8%");
                break;
            default:
                System.out.println("No existe categoria alguna");
                break;
        }
    }
}
