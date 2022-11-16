public class Main {
    public static void main(String[] args) {
        Filas fila =  new Filas(10);
        
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        // System.out.println(fila.size());
        // System.out.println(fila.isEmpty());

        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        // System.out.println(fila.dequeue());
        /* System.out.println(fila.size()); */

        System.out.println(fila.isEmpty());
    }
}
