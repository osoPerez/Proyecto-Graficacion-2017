
package modelo;

import algoritmos.EcuacionRecta;
import java.awt.Point;

/**
 *
 * @author tutoriales
 */
public class AnimacionCuadroLinea implements Runnable{
    private Primitiva2DLinea alg;
    private Point ini;
    private Point fin;
    private String modo;
    public AnimacionCuadroLinea(Primitiva2DLinea alg, Point ini, Point fin, String modo) {
       this.alg = alg;
       this.ini = ini;
       this.fin = fin;
       this.modo = modo;
    }

    @Override
    public void run() {
        alg.linea(ini, fin, modo);
    }
    
}
