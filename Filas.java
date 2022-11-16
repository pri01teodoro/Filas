/**
 * filas
 */
public class Filas {

    public Integer[] fila;
    public Integer primeiro = 0;
    public Integer ultimo = 0;
    public int tamanho = 5;
    

    public Filas() {
        this.fila = new Integer[5];
    }

    public Filas(int tamanho) {
        this.fila = new Integer[this.tamanho];
    }

    public Integer size() {
        return((tamanho - primeiro + ultimo)%tamanho); //this.fila.length
    }

    public boolean isEmpty() {
        return (primeiro == ultimo);
    }

    public Integer front() {
        if (isEmpty()) {
            throw new EmptyQueueException("Fila vazia");
        }
        return fila[primeiro];
    }

    public Integer dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("Fila vazia");
        }

        Integer elemento = fila[primeiro];
        fila[primeiro] = null;
        primeiro = (ultimo + primeiro)%tamanho;

        return elemento;
    }

    public void enqueue(Integer elemento){
        if (size() == tamanho - 1) {
            throw new FullQueueException("Fila cheia");
        }
        fila[ultimo] = elemento;
        ultimo = (ultimo + 1)%tamanho;
    }
}
