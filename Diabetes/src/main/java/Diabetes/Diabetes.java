package Diabetes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diabetes {

    public static void main(String[] args) {

        FactoresDeRiesgo test = new FactoresDeRiesgo();
        Diagnostico diag = new Diagnostico();

        int opcion = 0;
        Scanner leer = new Scanner(System.in);

        do {

            System.out.println("************************ Menú principal ************************");
            System.out.println("Selecciona una opción");
            System.out.println("1 -> Factores de riesgo");
            System.out.println("2 -> Diagnóstico");
            System.out.println("3 -> Salir");

            System.out.print("RESPUESTA ->  ");
            opcion = Integer.parseInt(leer.next());

            System.out.println("****************************************************************");

            switch (opcion) {
                case 1:
                    test.TestFactores();
                    break;

                case 2:
                    diag.testDiagnostico();
                    break;

                case 3:
                    System.out.println("Gracias por usar la máquina de inferencias");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 3);

    }
}
