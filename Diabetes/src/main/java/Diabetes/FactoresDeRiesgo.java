package Diabetes;

import java.util.Scanner;

public class FactoresDeRiesgo {

    private String nombre;

    //Constructor sin parámetros
    public FactoresDeRiesgo() {
        this.nombre = "Los Inges";
    }

    //Constructor con parámetros
    public FactoresDeRiesgo(String nombre) {
        this.nombre = nombre;
    }

    //accesadores
    public String getNombre() {
        return nombre;
    }

    public void TestFactores() {

        int opcion = 0;
        int puntaje = 0;

        Scanner respuesta = new Scanner(System.in);
        Sintomas test = new Sintomas();

        //Pregunta 1
        System.out.println("¿Qué edad tienes?");
        System.out.println("1.  Menos de 40 años"); // 0 PUNTOS
        System.out.println("2.  40 - 49 años"); //1 PUNTO
        System.out.println("3.  50 - 59 años");// 2 PUNTOS
        System.out.println("4.  60 años o más");//3 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje = 0;
        } else {
            if (opcion == 2) {
                puntaje = 1;
            } else {
                if (opcion == 3) {
                    puntaje = 2;
                } else {
                    if (opcion == 4) {
                        puntaje = 3;
                    }
                }
            }
        }

        //Pregunta 2
        System.out.println("¿Es usted hombre o mujer?");
        System.out.println("1.  Hombre");   //1 PUNTO
        System.out.println("2.  Mujer");    //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje++;
        } else {
            if (opcion == 2) {
                puntaje = puntaje + 0;
            }
        }

        if (opcion == 2) {

            //Pregunta 3 (Solo para mujeres)
            System.out.println("¿Tuvo alguna vez diabetes gestacional?");
            System.out.println("1.  Sí");   //1 PUNTO
            System.out.println("2.  No");   //0 PUNTOS

            System.out.print("RESPUESTA ->    ");
            opcion = respuesta.nextInt();
            System.out.println("");

            if (opcion == 1) {
                puntaje++;
            } else {
                if (opcion == 2) {
                    puntaje = puntaje + 0;
                }
            }
        }

        //Pregunta 4 
        System.out.println("¿Tienes familiares (mamá, papá, hermanos, hermanas) que padecen diabetes?");
        System.out.println("1.  Sí");   //1 PUNTO
        System.out.println("2.  No");   //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje++;
        } else {
            if (opcion == 2) {
                puntaje += 0;
            }
        }

        //Pregunta 5
        System.out.println("¿Alguna vez a dicho a un profesional de salud que tiene la presión arterial alta (o hipertención)?");
        System.out.println("1.  Sí");   //1 PUNTO
        System.out.println("2.  No");   //0 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje++;
        } else {
            if (opcion == 2) {
                puntaje += 0;
            }
        }
        
        //Pregunta 6
        System.out.println("¿Realiza algún tipo de actividad física?");
        System.out.println("1.  Sí");   //0 PUNTOS
        System.out.println("2.  No");   //1 PUNTO

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje += 0;
        } else {
            if (opcion == 2) {
                puntaje++;
            }
        }

        //Pregunta 7
        System.out.println("¿Cuál es su IMC?");
        System.out.println("1.  Sobrepeso");    //1 PUNTO
        System.out.println("2.  Obesidad grado 1"); //2 PUNTOS
        System.out.println("3.  Obesidad mayor al segundo grado");  //3 PUNTOS

        System.out.print("RESPUESTA ->    ");
        opcion = respuesta.nextInt();
        System.out.println("");

        if (opcion == 1) {
            puntaje++;
        } else {
            if (opcion == 2) {
                puntaje += 2;
            } else {
                if (opcion == 3) {
                    puntaje += 3;
                }
            }
        }

        //RESULTADOS
        if (puntaje >= 5) {
            System.out.println("****************");
            System.out.println("RESULTADO");
            System.out.println("Equipo: " + nombre);
            System.out.println("Puntaje: " + puntaje);
            System.out.println("Obtuvo 5 o más puntos; existe un mayor riesgo que usted tenga diabetes tipo 2.");
            System.out.println("Es necesario hacer el test de síntomas.");
            System.out.println("****************");
            test.TestSintomas();
        } else {
            if (puntaje >= 1 && puntaje < 5) {
                System.out.println("****************");
                System.out.println("RESULTADO");
                System.out.println("Paciente: " + nombre);
                System.out.println("Puntaje: " + puntaje);
                System.out.println("Obtuvo entre 1 y 4 puntos; existe un bajo riesgo que usted tenga diabetes tipo 2.");
                System.out.println("Es necesario hacer el test de síntomas.");
                System.out.println("****************");
                test.TestSintomas();
            } else {
                System.out.println("****************");
                System.out.println("RESULTADO");
                System.out.println("Paciente: " + nombre);
                System.out.println("Puntaje: " + puntaje);
                System.out.println("Su puntuaje fue de 0; no hay necesidad de hacer el test de síntomas");
                System.out.println("Repetir el test de factores de riesgo el próximo año.");
                System.out.println("****************");
            }
        }
    }

}
