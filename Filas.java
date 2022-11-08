/**
 * filas
 */
public class Filas {

    public int[] array;
    public int primeiro = 0;
    public int ultimo = 0;
    

    public Filas(int tamanho) {
        this.array = new int[tamanho];
    }

    public Filas() {
        this.array = new int[5];
    }

    public int size() {
        return((this.array.length - primeiro + ultimo)%this.array.length);
    }

    public boolean isEmpty() {
        return (primeiro == ultimo);
    }

    public int front() {
        if (isEmpty()) {
            throw new EmptyQueueException("Fila vazia");
        }
        return array[primeiro];
    }
}
