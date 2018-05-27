package soduko;
import soduko.Librerias;
public class Soduko {

   public static void main(String[] args) {
        java.util.Random rnd  = new java.util.Random();
        int numFilas      = 9;
        int filaInicial   = rnd.nextInt(numFilas);
        int colInicial    = rnd.nextInt(numFilas);
        Librerias pr = new Librerias(9);
        pr.resolverProblema(filaInicial, colInicial,1);
        pr.mostrarTablero();
        System.out.printf("Cantidad de veces que entra al ciclo: %,d %n",  pr.contador);
    }
}

