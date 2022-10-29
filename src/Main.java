import java.util.Scanner;

import Pilas.Pila;

public class Main {
    public static void invertirPila(Pila a, int t){
        Object b[]= new Object[t];
        int i=0,j=0;
        System.out.println("==Orden original==");
        while(!a.empty()){
            b[i]=a.pop();
            System.out.println(b[i]);
            i++;
        }
        while(!a.full()) {
            a.push((String) b[j]);
            j++;
        };
    }
    public static void eliminarElemento(Pila a,String dato, int t){
        Object c;
        Object b[]= new Object[t-1];
        int aux=0;
        int i=0;
        while(!a.empty()){
            c=a.pop();
            if (!c.equals(dato)){
                b[i]=c;
                i++;
            }else{
                aux++;
            }
        }
        for (int j=0;j<b.length;j++){
            a.push((String)b[j]);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pila p;
        char op, op2,op3;
        int t;
        String dato;
        System.out.println("==MENU==\n" +
                "1- Pilas\n" +
                "2- Colas\n" +
                "3- Listas");
        System.out.println("Ingrese una opcion:\t");
        op = s.nextLine().charAt(0);
        switch (op) {
            case '1':
                System.out.println("==MENU PILAS==\n" +
                        "1- Pila estatica");
                System.out.println("Ingresa una opcion:\t");
                op2 = s.nextLine().charAt(0);
                switch (op) {
                    case '1':
                        System.out.println("Ingresa el tamaño de la pila:\t");
                        t = s.nextInt();
                        s.nextLine();
                        p = new Pila(t);
                        do {
                            System.out.println("==Acciones pila==\n" +
                                    "1- Añadir elemento\n" +
                                    "2- Eliminar elemento\n" +
                                    "3- Desplegar pila\n" +
                                    "4- Invertir elementos\n" +
                                    "5- Eliminar elemento\n" +
                                    "6- Salir");
                            op3 = s.nextLine().charAt(0);
                            switch (op3){
                                case '1':
                                    System.out.println("Ingresa el elemento a agregar:\t");
                                    dato=s.nextLine();
                                    p.push(dato);
                                    break;
                                case '2':
                                    p.pop();
                                    break;
                                case '3':
                                    while(!p.empty()){
                                        System.out.println(p.pop());
                                    }
                                    break;
                                case '4':
                                    invertirPila(p,t);
                                    break;
                                case '5':
                                    System.out.println("Ingresa el dato a eliminar:\t");
                                    dato=s.nextLine();
                                    eliminarElemento(p,dato,t);
                                    break;
                            }
                        } while (op3!='6');
                        break;
                }
                break;
            case '2':
            case '3':
        }
    }

}