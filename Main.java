public class Main {

    public static void main(String[] args) {

        Profesor profesor = new Profesor(100, "John", "Doe");
        Estudiante estudiante = new Estudiante(95348078, "José", "Mercado", "Analista de Sistemas");

        // Agregar materias al objetos estudiante

        estudiante.getMateriasAprobadas().add("Matemáticas");
        estudiante.getMateriasAprobadas().add("Comunicación Visual");
        estudiante.getMateriasAprobadas().add("Introducción a la programación");

        estudiante.getMateriasInscriptas().add("Programaciòn orientada a objetos");
        estudiante.getMateriasInscriptas().add("Sistemas empresariales");

        // Imprimir objetos 'Estudiante' y 'Profesor'
        System.out.println(estudiante.toString());
        System.out.println(profesor.toString());

        // Mètodos ToString()
        estudiante.imprimirMateriasAprobadas();
        estudiante.imprimirMateriasInscriptas();
    }
}
