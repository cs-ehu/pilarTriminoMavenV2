package ehu.es.cs19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tablero {
  private int dimension;
  private char[][] triminos;
  private String[] cuadrantes = { "CSI", "CSD", "CII", "CID" };
  private Casilla[] triminoElegido;
  static char marca = '0';

  /**
   * Instantiates a new tablero.
   *
   * @param dimension the dimension
   */
  public Tablero(int dimension) {
    this.dimension = dimension;
    triminos = new char[dimension][dimension];
    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++) {
        triminos[i][j] = '*';
      }
    }
  }

  public int getDimension() {
    return dimension;
  }

  public void marcaCasillaInicial(int fila, int columna) {
    char marcaInicial = '#';
    triminos[fila - 1][columna - 1] = marcaInicial;
  }

  /**
   * Elegir trimino.
   *
   * @param fila the fila
   * @param columna the columna
   * @param cuadrante the cuadrante
   * @param dimensionTablero the dimension tablero
   * @param dimension the dimension
   * @return the casilla[]
   */
  public Casilla[] elegirTrimino(int fila, int columna, String cuadrante, int dimensionTablero, int dimension) {
    Estructura estructura = new Estructura();
    triminoElegido = estructura.elegirEstructura(dimension, cuadrante, fila, columna, dimensionTablero);
    marcaTablero(triminoElegido);
    return triminoElegido;
  }

  /**
   * Marca tablero.
   *
   * @param triminoElegido the trimino elegido
   * @return the char[][]
   */
  public char[][] marcaTablero(Casilla[] triminoElegido) {
    boolean buenTrimino = true;
    for (int i = 0; i < triminoElegido.length; i++) {
      Casilla casilla = triminoElegido[i];
      int fila = casilla.getFila();
      int columna = casilla.getColumna();
      if (triminos[fila - 1][columna - 1] != '*') {
        buenTrimino = false;
        break;
      }
    }
    if (buenTrimino) {
      marca = nuevoSimbolo();
      for (int i = 0; i < triminoElegido.length; i++) {
        Casilla casilla = triminoElegido[i];
        int fila = casilla.getFila();
        int columna = casilla.getColumna();
        if (triminos[fila - 1][columna - 1] == '*') {
          triminos[fila - 1][columna - 1] = marca;
        }
      }
    }
    return triminos;

  }

  /**
   * Definir cuadrante.
   *
   * @param fila the fila
   * @param columna the columna
   * @param dimension the dimension
   * @return the string
   */
  public String definirCuadrante(int fila, int columna, int dimension) {
    String cuadrante = "";
    int filaCuadrante = 0;
    int columnaCuadrante = 0;

    /********* FILA *****************/
    if (fila <= dimension) {
      filaCuadrante = fila;
    } else {
      int i = 0;
      int movilidadFila = 0;
      while ((i + dimension) <= this.dimension) {
        if ((fila > i) && (fila <= (i + dimension))) {
          movilidadFila = i;
          break;
        }
        i = i + dimension;
      }
      filaCuadrante = fila - movilidadFila;
    }

    /******** COLUMNA ****************/
    if (columna <= dimension) {
      columnaCuadrante = columna;
    } else {
      int i = 0;
      int movilidadCol = 0;
      while ((i + dimension) <= this.dimension) {
        if ((columna > i) && (columna <= (i + dimension))) {
          movilidadCol = i;
          break;
        }
        i = i + dimension;
      }
      columnaCuadrante = columna - movilidadCol;
    }

    if ((filaCuadrante <= (dimension / 2)) && (filaCuadrante >= 1) && (columnaCuadrante <= (dimension / 2))
        && (columnaCuadrante >= 1)) {
      cuadrante = cuadrantes[0];
    }
    if ((filaCuadrante <= (dimension / 2)) && (filaCuadrante >= 1) && (columnaCuadrante <= dimension)
        && (columnaCuadrante >= ((dimension / 2) + 1))) {
      cuadrante = cuadrantes[1];
    }
    if ((filaCuadrante <= dimension) && (filaCuadrante >= ((dimension / 2) + 1))
        && (columnaCuadrante <= (dimension / 2)) && (columnaCuadrante >= 1)) {
      cuadrante = cuadrantes[2];
    }
    if ((filaCuadrante <= dimension) && (filaCuadrante >= ((dimension / 2) + 1)) && (columnaCuadrante <= dimension)
        && (columnaCuadrante >= ((dimension / 2) + 1))) {
      cuadrante = cuadrantes[3];
    }
    return cuadrante;

  }

  /**
   * Imprime tablero.
   *
   * @param dimension the dimension
   * @param nombreFichero the nombre fichero
   * @throws IOException Signals that an I/O exception has occurred.
   */
  public void imprimeTablero(int dimension, String nombreFichero) throws IOException {
    if (nombreFichero != null) {
      File f = new File(nombreFichero);
      if (f.exists()) {
        throw new IOException("Fichero ya existe");
      } else {
        try {
          FileWriter fw = new FileWriter(nombreFichero);
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < dimension; j++) {
              fw.append(" " + triminos[i][j]);

            }
            fw.append('\n');
          }
          fw.close();

        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    } else {
      for (int i = 0; i < dimension; i++) {
        for (int j = 0; j < dimension; j++) {
          System.out.print(" " + triminos[i][j]);
        }
        System.out.println();
      }
    }
  }

  /**
   * Nuevo simbolo.
   *
   * @return the char
   */
  public char nuevoSimbolo() {
    int marcaInt = (int) marca;
    int nueve = (int) '9';
    if (marcaInt < nueve) {
      marcaInt = marcaInt + 1;
      marca = (char) marcaInt;
    } else {
      if (marca == '9') {
        marca = 'a';
      } else if (marca < 'z' && marca != 'Z') {
        marcaInt = marcaInt + 1;
        marca = (char) marcaInt;
      } else if (marca == 'z') {
        marca = 'A';
      } else if (marca == 'Z') {
        marca = '0';
      }

    }
    return marca;
  }

}
