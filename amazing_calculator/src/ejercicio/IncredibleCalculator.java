package ejercicio;

import java.util.Scanner;

import utilidades.Leer;

public class IncredibleCalculator {

    public static void main(String[] args) {
    	
    	double n1,n2,resultado;

        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: 
            		System.out.println("Escibe el número 1:");
            		n1=Leer.datoDouble();
            		System.out.println("Escibe el número 2:");
            		n2=Leer.datoDouble();
            		resultado=n1+n2;
            		System.out.printf("El resultado es: %.2f",resultado);
                    break;
            case 2: 
            		System.out.println("Escibe el número 1:");
            		n1=Leer.datoDouble();
            		System.out.println("Escibe el número 2:");
            		n2=Leer.datoDouble();
            		resultado=n1-n2;
            		System.out.printf("El resultado es: %.2f",resultado);
                    break;
            case 3: 
            		System.out.println("Escibe el número 1:");
    				n1=Leer.datoDouble();
    				System.out.println("Escibe el número 2:");
		    		n2=Leer.datoDouble();
		    		resultado=n1*n2;
		    		System.out.println("El resultado es: " + resultado);
                    break;
            case 4:
            		System.out.println("Escibe el número 1:");
					n1=Leer.datoDouble();
					System.out.println("Escibe el número 2:");
		    		n2=Leer.datoDouble();
		    		resultado=n1/n2;
		    		System.out.println("El resultado es: " + resultado);
		    		break;
                    
            case 5: 
	            	System.out.println("Escibe el número 1:");
					n1=Leer.datoDouble();
					System.out.println("Escibe el número 2:");
		    		n2=Leer.datoDouble();
		    		resultado=n1/n2;
		    		System.out.printf("El resultado es: %.2f",resultado);
                    break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}