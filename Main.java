import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Profesor profesor = new Profesor(100, "John", "Doe");
        Estudiante estudiante = new Estudiante(95348078, "José", "Mercado", "Analista de Sistemas");

        System.out.println(estudiante.toString());
        System.out.println(profesor.toString());
    }
}
