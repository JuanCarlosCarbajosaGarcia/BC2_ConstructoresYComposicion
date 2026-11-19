public class Main {
    static void main() {
        //new Monitor();
        //java: constructor Monitor in class Monitor cannot be applied to given types;
        //required: int
        //found: no arguments
        // monitor tiene un constructo por lo que no crea uno vacio
        Ordenador pc1 = new Ordenador("HP","PRO DESK",8);
        System.out.println("Ordenador pc1: " + pc1);
        Ordenador pc2 = new Ordenador("HP","PRO DESK");
        System.out.println("Ordenador pc2: " + pc2);
        Ordenador pc3 = new Ordenador();
        System.out.println("Ordenador pc3: " + pc3);
    }
}
