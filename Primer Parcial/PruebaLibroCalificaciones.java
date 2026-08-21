import java.util.Scanner;

public class PruebaLibroCalificaciones {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();

        LibroCalificaciones miLibroCalificacionesIniciado = new LibroCalificaciones("Programacion", "Ana Luisa", 4);

        System.out.printf("El nombre inicial del curso: %s\nEl profesor es: %s\ny las horas a la semana son: %d\n\n",
                miLibroCalificacionesIniciado.getNombreDelCurso(),
                miLibroCalificacionesIniciado.getNombreDelProfesor(),
                miLibroCalificacionesIniciado.getHorasDelCurso());

        System.out.print("Escriba el nombre del curso: ");
        String nombreDelCurso = entrada.nextLine();

        System.out.print("Escriba el nombre del profesor: ");
        String nombreDelProfesor = entrada.nextLine();

        System.out.print("Escriba las horas a la semana del curso: ");
        int horas = entrada.nextInt();

        System.out.println();

        miLibroCalificaciones.setNombreDelProfesor(nombreDelProfesor);
        miLibroCalificaciones.setNombreDelCurso(nombreDelCurso);
        miLibroCalificaciones.setHorasDelCurso(horas);

        System.out.println("\n- Resultados del nuevo libro-");
        miLibroCalificaciones.mostrarMensaje();
        
        entrada.nextLine();

        System.out.println("Vamos a cambiar los valores del objeto mLCIniciado");
        
        System.out.print("Escriba el nuevo nombre del curso para el objeto mLCIniciado: ");
        String elNombre = entrada.nextLine();

        System.out.print("Escriba el nuevo nombre del profesor para el objeto mLCIniciado: ");
        String elProfe = entrada.nextLine();

        System.out.print("Escriba la nueva cantidad de horas por semana del curso para el objeto mLCIniciado: ");
        int horasSemana = entrada.nextInt();

        miLibroCalificacionesIniciado.setNombreDelCurso(elNombre);
        miLibroCalificacionesIniciado.setHorasDelCurso(horasSemana);
        miLibroCalificacionesIniciado.setNombreDelProfesor(elProfe);

        miLibroCalificacionesIniciado.mostrarMensaje();

        entrada.close();
    }
}