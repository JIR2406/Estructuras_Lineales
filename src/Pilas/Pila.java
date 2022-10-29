package Pilas;

public class Pila {
    protected Object pila[];
    protected int tope;

    public Pila(int t) {
        pila = new Object[t];
        tope = 0;
    }

    public void push(String dato) {
        if (full()) {
            System.out.println("Pila llena");
        } else {
            pila[tope] = (Object) dato;
            tope++;
        }
    }

    public String pop() {
        Object dato;
        if (empty()) {
            System.out.println("Pila vacia");
            return "";
        } else {
            tope--;
            dato = pila[tope];
            return (String) dato;
        }
    }

    public boolean full() {
        if (tope == pila.length) {
            return true;
        }
        return false;
    }

    public boolean empty() {
        if (tope == 0) {
            return true;
        }
        return false;
    }
}
