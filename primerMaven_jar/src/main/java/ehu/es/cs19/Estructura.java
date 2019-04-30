package ehu.es.cs19;

public class Estructura {

  /**
   * Elegir estructura.
   *
   * @param dimension the dimension
   * @param cuadrante the cuadrante
   * @param filaTrimino the fila trimino
   * @param columnaTrimino the columna trimino
   * @param dimensionTablero the dimension tablero
   * @return the casilla[]
   */
  public Casilla[] elegirEstructura(int dimension, String cuadrante, int filaTrimino, int columnaTrimino,
      int dimensionTablero) {

    /********** MI COSECHA **********************/
    // Tablero noseque= new Tablero (dimensionTablero);
    // Tablero nuevoTrimino= new Tablero(dimensionTablero);
    /********** HASTA LA FECHA **********************/

    Casilla[] triminoElegido = new Casilla[3];
    int movilidadFila = 0;
    int movilidadCol = 0;

    /********* FILA *****************/
    if (filaTrimino <= dimension) {
      movilidadFila = 0;
    } else {
      int i = 0;
      while ((i + dimension) <= dimensionTablero) {
        if ((filaTrimino > i) && (filaTrimino <= (i + dimension))) {
          movilidadFila = i;
          break;
        }
        i = i + dimension;
      }
    }

    /******** COLUMNA ****************/
    if (columnaTrimino <= dimension) {
      movilidadCol = 0;
    } else {
      int i = 0;
      while ((i + dimension) <= dimensionTablero) {
        if ((columnaTrimino > i) && (columnaTrimino <= (i + dimension))) {
          movilidadCol = i;
          break;
        }
        i = i + dimension;
      }
    }

    if (cuadrante.equals("CSD")) {
      Casilla casilla = new Casilla();
      int fila = dimension / 2;
      int columna = dimension / 2;
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[0] = casilla;
      /********** MI COSECHA **********************/
      // dimension=dimension/2;
      // String nuevoCuadrante= noseque.definirCuadrante(casilla.getFila(),
      // casilla.getColumna(), dimensionTablero);
      // nuevoTrimino.elegirTrimino(casilla.getFila(), casilla.getColumna(),
      // nuevoCuadrante, dimensionTablero, dimension);
      /********** HASTA LA FECHA **********************/

      fila = dimension / 2 + 1;
      columna = dimension / 2;
      casilla = new Casilla();
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[1] = casilla;

      fila = dimension / 2 + 1;
      columna = dimension / 2 + 1;
      casilla = new Casilla();
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[2] = casilla;
    }
    if (cuadrante.equals("CSI")) {
      Casilla casilla = new Casilla();
      int fila = dimension / 2;
      int columna = dimension / 2 + 1;
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[0] = casilla;
      fila = dimension / 2 + 1;
      columna = dimension / 2 + 1;
      casilla = new Casilla();
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[1] = casilla;
      fila = dimension / 2 + 1;
      columna = dimension / 2;
      casilla = new Casilla();
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[2] = casilla;
    }
    if (cuadrante.equals("CID")) {
      Casilla casilla = new Casilla();
      int fila = dimension / 2;
      int columna = dimension / 2 + 1;
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[0] = casilla;
      fila = dimension / 2 + 1;
      columna = dimension / 2;
      casilla = new Casilla();
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[1] = casilla;
      fila = dimension / 2;
      columna = dimension / 2;
      casilla = new Casilla();
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[2] = casilla;
    }
    if (cuadrante.equals("CII")) {
      Casilla casilla = new Casilla();
      int fila = dimension / 2;
      int columna = dimension / 2;
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[0] = casilla;
      fila = dimension / 2;
      columna = dimension / 2 + 1;
      casilla = new Casilla();
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[1] = casilla;
      fila = dimension / 2 + 1;
      columna = dimension / 2 + 1;
      casilla = new Casilla();
      casilla.setFila(fila + movilidadFila);
      casilla.setColumna(columna + movilidadCol);
      triminoElegido[2] = casilla;
    }
    return triminoElegido;
  }

}
