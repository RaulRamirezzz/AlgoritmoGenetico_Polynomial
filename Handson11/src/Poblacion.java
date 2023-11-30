import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poblacion {

    private List<Individuo> individuos;

    public Poblacion(int numGenes, int tamanoPoblacion) {

        this.individuos = new ArrayList<>();
        int grado = numGenes-1;
        Random random = new Random();

        switch (grado) {
            case 1:
                for (int i = 0; i < tamanoPoblacion; i++) {
                    double[] genes = new double[numGenes];
                    genes[0] = 40.0 + random.nextDouble() * 10.0; // Rango de 40 a 50
                    genes[1] = 0.250 + random.nextDouble() * 0.300; // Rango de 0 a 1
                    individuos.add(new Individuo(genes));
                }
                break;
            case 2:
                for (int i = 0; i < tamanoPoblacion; i++) {
                    double[] genes = new double[numGenes];
                    genes[0] = 25.0 + random.nextDouble() * 10.0; // Rango de 25 a 35
                    genes[1] = 0.5 + random.nextDouble(); // Rango de 0.5 a 1.5
                    genes[2] = -1.0 + random.nextDouble(); // Rango de -1 a 0
                    individuos.add(new Individuo(genes));
                }
                break;
            case 3:
                for (int i = 0; i < tamanoPoblacion; i++) {
                    double[] genes = new double[numGenes];
                    genes[0] = 60.0 + random.nextDouble() * 10.0; // Rango de 60 a 70
                    genes[1] = -1 + random.nextDouble(); // Rango de -1 a 0
                    genes[2] = -0.5 + random.nextDouble(); // Rango de -0.5 a 0.5
                    genes[3] = -0.5 + random.nextDouble(); // Rango de -0.5 a 0.5
                    individuos.add(new Individuo(genes));
                }
                break;

            default:
                throw new IllegalArgumentException("Grado no soportado: " + grado);
        }
    }

    public void mostrarPoblacion() {
        for (Individuo individuo : individuos) {
            System.out.println(individuo);
        }
    }

    public boolean haEncontradoSolucion(ArrayList<DataSet> datos, int gradoPolinomio) {
        // Verificar si algún individuo tiene un fittnes dentro del rango deseado
        return individuos.stream()
                .anyMatch(individuo -> {
                    double error = individuo.calcularError(datos, gradoPolinomio);
                    if (error >= 0.900){
                        System.out.println("Se ha encontrado un individuo con un fittnes mayor a 0.900: "+individuo);
                    }
                    return error >= 0.900;
                });
    }

    public Poblacion generarNuevaGeneracion(ArrayList<DataSet> datos, int gradoPolinomio) {
        Random random = new Random();
        List<Individuo> nuevaGeneracion = new ArrayList<>();

        //Obtener primder padre con el mejor fitness
        Individuo padre1 = obtenerMejorFitness(datos, gradoPolinomio);
        //Generar nueva generacion
        for (int i = 0; i < individuos.size(); i++) {
            //Seleccionar segundo padre por el metodo de la ruleta, si se repite el primer padre se repite
            Individuo padre2 = seleccionarPadrePorRuleta(padre1, datos, gradoPolinomio);
            //Crossover
            Individuo hijo = padre1.cruzar(padre2, random);
            //mutacion
            if (random.nextDouble() < PolynomialRegression.PROBABILIDAD_MUTACION) {
                hijo = hijo.mutar(random);
            }

            nuevaGeneracion.add(hijo);
        }

        this.individuos = nuevaGeneracion;

        return this;
    }

    private Individuo obtenerMejorFitness(ArrayList<DataSet> datos, int gradoPolinomio) {
        Individuo mejorIndividuo = null;
        double mejorFitness = Double.MAX_VALUE;

        for (Individuo individuo : individuos) {
            double fitnessActual = individuo.calcularError(datos, gradoPolinomio);
            if (fitnessActual < mejorFitness) {
                mejorFitness = fitnessActual;
                mejorIndividuo = individuo;
            }
        }
        System.out.println("Mejor individuo: "+ mejorIndividuo+", Fitness: " + mejorFitness);
        return mejorIndividuo;
    }

    private Individuo seleccionarPadrePorRuleta(Individuo mejorIndividuo, ArrayList<DataSet>datos, int gradoPolinomio) {
        double sumaFitness = individuos.stream()
                .mapToDouble(individuo -> 1 / (1 + individuo.calcularError(datos, gradoPolinomio)))
                .sum();

        double valorRuleta = Math.random() * sumaFitness;
        double acumulado = 0;

        for (Individuo individuo : individuos) {
            acumulado += 1 / (1 + individuo.calcularError(datos, gradoPolinomio));
            if (acumulado >= valorRuleta && !individuo.equals(mejorIndividuo)) {
                return individuo;
            }
        }

        // Si no se selecciona ningún individuo (esto podría ocurrir en casos extremos),
        // simplemente devolvemos el mejor individuo para evitar errores.
        return mejorIndividuo;
    }
}