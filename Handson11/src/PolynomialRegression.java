import java.util.ArrayList;
import java.lang.Math;

public class PolynomialRegression {

    public static final double PROBABILIDAD_CRUCE = 0.9;
    public static final double PROBABILIDAD_MUTACION = 0.3;

    public static void main(String[] args){
        DataSet.Polynomial();
        ArrayList<DataSet> datos = DataSet.Datos;

        int grado=1;
        int tamanoPoblacion=10;

        // Crear la población inicial
        Poblacion poblacion = new Poblacion(grado+1, tamanoPoblacion);

        int generacion = 1;
        while (true) {
            System.out.println("Generación " + generacion + ":");

            // Mostrar la población actual
            poblacion.mostrarPoblacion();

            // Verificar si se ha encontrado la solución
            if (poblacion.haEncontradoSolucion(datos, grado)) {
                System.out.println("¡Individuo con ECM mínimo encontrado!");
                return;
            }

            // Generar una nueva generación
            poblacion = poblacion.generarNuevaGeneracion(datos, grado);
            generacion++;
        }

    }

}