package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ciclo For
        /*
        for(contador=0; contador < numero; contador++) {
            //código que se repite;
        }
         */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = sc.nextInt();
        sc.close();*/

        /*for (int i = 1; i <=10; i++ ) {

            if ( i % 2 == 0) {
                continue;*/
        //aquí salta los pares con el continue
        //pasa a la sig iteracion sin terminar de ejecutar
        //el código de bajo


        //System.out.println(numero + " x " + i + " = " + (numero * i));

            /*if ( i == 8) {
                break;
            }*/


        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = sc.nextInt();
        sc.close();
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);

        for (int i = 1; i <= numero-1; i++) {

            int numsig = num1 + num2;
            num1 = num2;
            num2 = numsig;

            System.out.println(num1);
        }
         */

        //Ciclo while, mientras la condicion se cumpla se va a repetir código

        /*while(condicion) {
            //condicion
        }*/

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número secreto. Ingresa un número");
        int numero = sc.nextInt();
        int numeroSecreto = 33;

        while (numero != numeroSecreto){
                System.out.println("Adivina el número secreto.Ingresa un número");
                numero=sc.nextInt();
        }
        sc.close();
        System.out.println("Felicidades, adivinaste el número secreto");
        */
        //Ciclo do while

        /*
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroSecreto = 33;

        do {
            System.out.println("Adivina el número secreto.Ingresa un número");
            numero=sc.nextInt();
        } while (numero != numeroSecreto);

        sc.close();
        System.out.println("Felicidades, adivinaste el número secreto");
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int factorial = 1;
        int numero =sc.nextInt();

        while (numero !=0) {
            factorial = factorial * numero;
            numero--;
        }

        System.out.println("El factorial es " +factorial);

    }
}
