/**Prueba de la clase Rectangulo
 * 
 * @author Rafael Infante*/
package examen2Eval;

import almacen.Almacen;
import excepciones.ExceptionApareamientoImposible;

public class TestRectangulo {

  public static void main(String[] args) {
    try {
      Rectangulo rectangulo1 = new Rectangulo(10,10);
     
    
      System.out.println(rectangulo1);

      
    }catch(ArithmeticException ae){
      System.err.println(ae.getMessage());
    }
     
  

  }

}
