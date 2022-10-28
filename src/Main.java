import java.util.Scanner;

import Pilas.Pila;

public class Main {

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