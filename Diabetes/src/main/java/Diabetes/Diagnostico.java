package Diabetes;

import java.util.Scanner;

public class Diagnostico {

    public void testDiagnostico() {

        Scanner leer = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);
        int opcion = 0;
        float resultado = 0;

        do {

            System.out.println("************************ Menú de diagnóstico ************************");
            System.out.println("");
            System.out.println("Seleccione el tipo de diagnóstico que le realizaron");

            System.out.println("1.  A1c (Hemoglobina glucosilada)");
            System.out.println("2.  Glucosa plasmática en ayunas (FPG)");
            System.out.println("3.  Prueba de tolerancia oral a la glucosa");
            System.out.println("4.  Prueba aleatoria (también llamada casual) de glucosa plasmática");
            System.out.println("5.  Regresar al menú principal");

            System.out.print("RESPUESTA ->    ");
            opcion = leer.nextInt();
            System.out.println("");
            System.out.println("**********************************************************************");
            switch (opcion) {
                case 1:

                    System.out.println("----------| Diagnóstico - A1c (Hemoglobina glucosilada) |----------");

                    System.out.print("Escriba el valor del resultado -> ");
                    resultado = valor.nextFloat();

                    System.out.println("VALOR INGRESADO: " + resultado + "%");

                    if (resultado < 5.7) {
                        System.out.println("RESULTADO: Normal");
                    } else {
                        if (resultado >= 5.7 && resultado <= 6.4) {
                            System.out.println("RESULTADO: Prediabético");
                        } else {
                            System.out.println("RESULTADO: Diabético");
                        }
                    }

                    System.out.println("|--------------------------------|");

                    break;

                case 2:

                    System.out.println("----------| Glucosa plasmática en ayunas (FPG) |----------");

                    System.out.print("Escriba el valor del resultado -> ");
                    resultado = valor.nextFloat();

                    System.out.println("VALOR INGRESADO: " + resultado + " mg/dl");

                    if (resultado < 100.0) {
                        System.out.println("RESULTADO: Normal");
                    } else {
                        if (resultado >= 100.0 && resultado <= 125.0) {
                            System.out.println("RESULTADO: Prediabético");
                        } else {
                            System.out.println("RESULTADO: Diabético");
                        }
                    }

                    System.out.println("|--------------------------------|");

                    break;

                case 3:

                    System.out.println("----------| Prueba de tolerancia oral a la glucosa |----------");

                    System.out.print("Escriba el valor del resultado -> ");
                    resultado = valor.nextFloat();

                    System.out.println("VALOR INGRESADO: " + resultado + " mg/dl");

                    if (resultado < 140.0) {
                        System.out.println("RESULTADO: Normal");
                    } else {
                        if (resultado >= 140.0 && resultado <= 199.0) {
                            System.out.println("RESULTADO: Prediabético");
                        } else {
                            System.out.println("RESULTADO: Diabético");
                        }
                    }

                    System.out.println("|--------------------------------|");

                    break;

                case 4:

                    System.out.println("----------| Prueba aleatoria (también llamada casual) de glucosa plasmática |----------");

                    System.out.print("Escriba el valor del resultado -> ");
                    resultado = valor.nextFloat();

                    System.out.println("VALOR INGRESADO: " + resultado + " mg/dl");

                    if (resultado > 200.0) {
                        System.out.println("RESULTADO: Diabético");
                    } else {
                        System.out.println("RESULTADO: Normal");
                    }

                    System.out.println("|--------------------------------|");
                    break;

                case 5:
                    System.out.println("Saliendo del menú diagnóstico");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 5);

    }

}
