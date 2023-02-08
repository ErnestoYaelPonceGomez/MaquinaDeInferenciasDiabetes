package Diabetes;

import java.util.Scanner;

public class Sintomas {

    public void TestSintomas() {

        int opcion = 0;
        float puntaje = 0;

        Scanner respuesta = new Scanner(System.in);

        //Pregunta 1 
        System.out.println("En estos últimos días, ¿Ha tenido mucha hambre?");
        System.out.println("1.  Sí");   //2 PUNTOS
        System.out.println("2.  No");   //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");      

        if (opcion == 1) {
            puntaje = 2;
        } else {
            if (opcion == 2) {
                puntaje = 0;
            }
        }

        //Pregunta 2 
        System.out.println("En estos últimos días, ¿Ha tenido mucha sed?");
        System.out.println("1.  Sí");   //2 PUNTOS
        System.out.println("2.  No");   //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje += 2;
        } else {
            if (opcion == 2) {
                puntaje += 0;
            }
        }

        //Pregunta 3 
        System.out.println("En estos últimos días, ¿Ha orinado con más frecuencia?");
        System.out.println("1.  Sí");   //2 PUNTOS
        System.out.println("2.  No");   //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje += 2;
        } else {
            if (opcion == 2) {
                puntaje += 0;
            }
        }

        //Pregunta 4 
        System.out.println("En estos últimos días, ¿Se ha sentido más cansado de lo habitual?");
        System.out.println("1.  Sí");   //0.5 PUNTOS
        System.out.println("2.  No");   //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje += 0.5;
        } else {
            if (opcion == 2) {
                puntaje += 0;
            }
        }

        //Pregunta 5 
        System.out.println("En estos últimos días, ¿Ha tenido la piel reseca?");
        System.out.println("1.  Sí"); //0.5 PUNTOS
        System.out.println("2.  No"); //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje += 0.5;
        } else {
            if (opcion == 2) {
                puntaje += 0;
            }
        }

        //Pregunta 6 
        System.out.println("En estos últimos días, ¿Ha tenido infecciones frecuentes?");
        System.out.println("1.  Sí");   //0.5 PUNTOS
        System.out.println("2.  No");   //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje += 0.5;
        } else {
            if (opcion == 2) {
                puntaje += 0;
            }
        }

        //Pregunta 7 
        System.out.println("En estos últimos días, ¿Ha perdido peso sin explicación?");
        System.out.println("1.  Sí");   //0.5 PUNTOS
        System.out.println("2.  No");   //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje += 0.5;
        } else {
            if (opcion == 2) {
                puntaje += 0;
            }
        }

        //Pregunta 8 
        System.out.println("En estos últimos días, ¿Ha tenido nauseas, dolor de estómago o sensación de malestar general?");
        System.out.println("1.  Sí");   //0.5 PUNTOS
        System.out.println("2.  No");   //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje += 0.5;
        } else {
            if (opcion == 2) {
                puntaje += 0;
            }
        }

        //RESULTADOS
        if (puntaje >= 6) {
            System.out.println("****************");
            System.out.println("RESULTADO");
            System.out.println("Puntaje: " + puntaje);
            System.out.println("Obtuvo 6 o más puntos; es necsario realizar un diagnóstico indicado por su médico.");
            System.out.println("****************");
        } else {
            System.out.println("****************");
            System.out.println("RESULTADO");
            System.out.println("Puntaje: " + puntaje);
            System.out.println("Obtuvo menos de 6 puntos; no es necesario realizar un diagnóstico");
            System.out.println("Favor de realizar el test el próximo año.");
            System.out.println("****************");
        }

    }

}
