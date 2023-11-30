import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Individuo {

    public double[] genes;

    public Individuo(double[] genes) {
        this.genes = genes;
    }

    public double[] getGenes() {
        return genes;
    }

    public double calcularError(ArrayList<DataSet> datos, int grado) {
        double fitness=0;
        switch (grado) {
            case 1:
                fitness=calcularFitnessLineal(datos);
                break;
            case 2:
                fitness=calcularFitnessCuadratico(datos);
                break;
            case 3:
                fitness=calcularFitnessCubico(datos);
                break;

            default:
                throw new IllegalArgumentException("Grado no soportado: " + grado);
            }

        return fitness;
    }

    public double calcularFitnessLineal(ArrayList<DataSet> datos) {
        double b0;
        double b1;
        b0= genes[0];
        b1= genes[1];
        double error;
        double SSE = 0.0;
        double SST = 0.0;
        double x, y;
        double sumaY = 0.0;

        for (DataSet p : datos) {
            x = p.factor1;
            y = p.yield;
            double residuo = y - (b0 + b1 * x);
            SSE += residuo * residuo;
        }

        for (DataSet p : datos) {
            sumaY += p.yield;
        }
        double promedioY = sumaY / datos.size();

        for (DataSet p : datos) {
            x = p.factor1;
            y = p.yield;
            double residuo = y - promedioY;
            SST += residuo * residuo;
        }

        // Evitar división por cero
        if (SST == 0.0) {
            error = 0.0;
        } else {
            error = 1.0 - SSE / SST;
        }

        // Asegurar que el valor de error esté en el rango de 0 a 1
        error = Math.max(0.0, Math.min(1.0, error));

        return error;
    }

    public double calcularFitnessCuadratico(ArrayList<DataSet> datos) {
        double a;
        double b;
        double c;

        a= genes[0];
        b= genes[1];
        c= genes[2];

        double error;
        double SSE = 0.0;
        double SST = 0.0;
        double x, y;
        double sumaY = 0.0;

        for (DataSet p : datos) {
            x = p.factor1;
            y = p.yield;
            double residuo = y - (a * x * x + b * x + c);
            SSE += residuo * residuo;
        }

        for (DataSet p : datos) {
            sumaY += p.yield;
        }
        double promedioY = sumaY / datos.size();

        for (DataSet p : datos) {
            x = p.factor1;
            y = p.yield;
            double residuo = y - promedioY;
            SST += residuo * residuo;
        }

        // Evitar división por cero
        if (SST == 0.0) {
            error = 0.0;
        } else {
            error = 1.0 - SSE / SST;
        }

        // Asegurar que el valor de error esté en el rango de 0 a 1
        error = Math.max(0.0, Math.min(1.0, error));

        return error;
    }

    public double calcularFitnessCubico(ArrayList<DataSet> datos) {
        double a;
        double b;
        double c;
        double d;

        a= genes[0];
        b= genes[1];
        c= genes[2];
        d= genes[3];

        double error;
        double SSE = 0.0;
        double SST = 0.0;
        double x, y;
        double sumaY = 0.0;

        for (DataSet p : datos) {
            x = p.factor1;
            y = p.yield;
            double residuo = y - (a * x * x * x + b * x * x + c * x + d);
            SSE += residuo * residuo;
        }

        for (DataSet p : datos) {
            sumaY += p.yield;
        }
        double promedioY = sumaY / datos.size();

        for (DataSet p : datos) {
            x = p.factor1;
            y = p.yield;
            double residuo = y - promedioY;
            SST += residuo * residuo;
        }

        // Evitar división por cero
        if (SST == 0.0) {
            error = 0.0;
        } else {
            error = 1.0 - SSE / SST;
        }

        // Asegurar que el valor de error esté en el rango de 0 a 1
        error = Math.max(0.0, Math.min(1.0, error));

        return error;
    }

    public Individuo cruzar(Individuo otroIndividuo, Random random) {
        if (random.nextDouble() < PolynomialRegression.PROBABILIDAD_CRUCE) {
            // Método de cruce en un solo punto
            int puntoCruce = random.nextInt(genes.length);

            double[] genesHijo = new double[genes.length];
            System.arraycopy(genes, 0, genesHijo, 0, puntoCruce);
            System.arraycopy(otroIndividuo.genes, puntoCruce, genesHijo, puntoCruce, genes.length - puntoCruce);

            return new Individuo(genesHijo);
        } else {
            // No cruzar, devolver padre
            return this;
        }
    }

    public Individuo mutar(Random random) {
        double rangoMutacion = 0.5; // Rango de la mutación

        double[] genesMutados = Arrays.copyOf(genes, genes.length);

        for (int i = 0; i < genesMutados.length; i++) {
            if (random.nextDouble() < PolynomialRegression.PROBABILIDAD_MUTACION) {
                // Sumar o restar un número aleatorio del 1 al 10
                double cambio = (random.nextDouble() * 2 - 1) * rangoMutacion; // Número aleatorio entre -rangoMutacion y rangoMutacion
                genesMutados[i] += cambio;
            }
        }

        return new Individuo(genesMutados);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Individuo: ");
        for (int i = 0; i < genes.length; i++) {
            stringBuilder.append(String.format("%.2f", genes[i]));  // Formato con dos decimales
            if (i < genes.length - 1) {
                stringBuilder.append(", ");
            }
        }

        return stringBuilder.toString();
    }
}
