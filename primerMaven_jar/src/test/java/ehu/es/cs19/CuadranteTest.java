package ehu.es.cs19;

//import com.sun.org.apache.xpath.internal.operations.String;

import junit.framework.TestCase;

public class CuadranteTest extends TestCase {

  protected void setUp() throws Exception {
    super.setUp();
  }

  protected void tearDown() throws Exception {
    super.tearDown();
  }

  public void testDefinirCuadrante() {
    Tablero tab = new Tablero(12);
    String cuadrante =  tab.definirCuadrante(3,10,12);
    String resultado = "CSD";
    assertEquals(cuadrante, resultado);
  }

}
