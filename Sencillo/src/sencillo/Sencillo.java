package sencillo;

import java.util.Scanner;

public class Sencillo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo Aqui Nada Más Sin Nada Que Hacer :v");
        System.out.println("Seria tan amabble de ingresar los numeros a para las Operaciones Aritmeticas");
        int x = "";
        Scanner entradanumero = new Scanner (System.in); //Creación de un objeto Scanner
        x = entradanumero.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println ("Entrada recibida por teclado es: \"" + entradanumero +"\"");
        
    }
    
}
