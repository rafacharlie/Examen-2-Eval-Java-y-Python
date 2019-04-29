/**Prueba de la clase Cuadrado
 * 
 * @author Rafael Infante
 */
package examen2Eval;

public class TestCuadrado {

  public static void main(String[] args) {
    
    Cuadrado cuadrado1 = null;
    Cuadrado cuadrado2=null;
    

    /* objeto cuadrado1 */
    try {
      cuadrado1=new Cuadrado(7);
      System.out.println(cuadrado1);
    } catch (ArithmeticException ae) {
      System.err.println(ae.getMessage());
    }

    System.out.println(); // salto de linea

    /* objeto cuadrado2 */
    try {
      cuadrado2=new Cuadrado(7);
      System.out.println(cuadrado2);

    } catch (ArithmeticException ae) {

      System.err.println(ae.getMessage());
    }

    /* comparacion de dos objetos con equals */
    if (cuadrado1.compareTo(cuadrado2)==0) {
      System.out.println("Son iguales.");
    } else if(cuadrado1.compareTo(cuadrado2)<0){
      System.out.println("cuadrado1 menor a cuadrado2");
    }else {
      System.out.println("cuadrado1 mayor a cuadrado2");
    }

  }
  
  /**
   * PREGUNTAR A RAFA O LOURDES
   * 2 problemas:
   * 1º tal y como esta no coge la excepcion bien y si meto dento de cada try la declaracion
   * del objeto me da error al comparar con el equal.
   * 2º el compareTo me daba error revisar.
   */

}
