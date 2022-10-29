package Colas;

public class Cola {
    protected int frente, fin;
    protected Object cola[];

    public Cola(int t) {
        cola= new Object[t];
        frente = fin = 0;
    }

    public void insert(String dato) {
        if (fin == frente) {
            fin++;
            cola[fin] = dato;
        }
        if (fin == 1) {
            frente = 1;
        } else {
            System.out.println("Cola llena");
        }
    }

    public String remove() {
        if (frente != 0) {
            return (String) cola[fin];
        } else {
            System.out.println("Cola vacia");
        }
        if (frente == fin) {
            frente = fin = 0;
        } else {
            frente++;
        }
        return null;
    }

    public boolean empty() {
    if (frente==0){
        return true;
    }
    return false;
    }
    public boolean full(){
        if (fin==cola.length){
            return true;
        }
        return false;
    }
}
