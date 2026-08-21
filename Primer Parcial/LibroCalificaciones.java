public class LibroCalificaciones {
    
    private String nombreDelCurso;
    private String nombreDelProfesor;
    private int horasDelCurso;

    public LibroCalificaciones() {
        this.nombreDelCurso = "Sin nombre";
        this.nombreDelProfesor = "Sin profesor :C";
        this.horasDelCurso = 0;
    }

    public LibroCalificaciones(String nombre, String profesor, int horas) {
        this.nombreDelCurso = nombre;
        this.nombreDelProfesor = profesor;
        this.horasDelCurso = horas;
    }

    public void setNombreDelCurso(String nombre) {
        this.nombreDelCurso = nombre;
    }

    public void setNombreDelProfesor(String profesor) {
        this.nombreDelProfesor = profesor;
    }

    public void setHorasDelCurso(int horas) {
        this.horasDelCurso = horas;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public String getNombreDelProfesor() {
        return nombreDelProfesor;
    }

    public int getHorasDelCurso() {
        return horasDelCurso;
    }

    public void mostrarMensaje() {
        System.out.printf("\nBienvenido al libro de calificaciones para\n%s!\n", getNombreDelCurso());
        System.out.printf("Tu profesor asignado es : %s\n", getNombreDelProfesor());
        System.out.printf("Tienes %d horas a la semana\n", getHorasDelCurso());
    }
}