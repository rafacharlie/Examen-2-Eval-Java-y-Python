/**2.- (Java) Crea la clase Rectángulo de forma que:
• Un objeto de esta clase se construye pasándole el ancho y el alto. Ninguno de los dos atributos
puede ser menor o igual a cero ni mayor que diez, en esos casos se debe lanzar la excepción
ArithmeticException.
• Mediante getters y setters permite que se acceda y se modifique el ancho y el alto del
rectángulo teniendo en cuenta las restricciones en cuanto a las dimensiones del apartado
anterior.
• Al imprimir en pantalla un objeto de la clase usando System.out.print se debe dibujar el
rectángulo por la pantalla (de manera similar a como se imprime un cuadrado en la página 130
del libro Aprende Java con Ejercicios).
• Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
la posibilidad de comparar objetos cuadrados entre sí.
• Crea los programas de test correspondientes a ambas clases. Debes provocar que se lance la
excepción y capturarla.

@author Rafael Infante
*/
package examen2Eval;

public class Rectangulo {

  // variables de instancia
  private double ancho;
  private double alto;

  /**
   * constructor
   * 
   * @param: double ancho
   * @param: double alto
   */
  public Rectangulo(double ancho, double alto) {
    setAncho(ancho);
    setAlto(alto);

  }

  /**
   * getters y setters con ArithmeticException.
   * 
   */
  public double getAncho() {
    return ancho;
  }

  public void setAncho(double ancho) {

    if (ancho <= 0 || ancho > 10) {
      throw new ArithmeticException("Valor introducido incorrecto");
    } else {
      this.ancho = ancho;
    }
  }

  public double getAlto() {
    return alto;
  }

  public void setAlto(double alto) {
    if (alto <= 0 || alto > 10) {
      throw new ArithmeticException("Valor introducido incorrecto");
    } else {
      this.alto = alto;
    }
  }

  /**
   * toString
   */
  @Override
  public String toString() {
    String resultado = "";
    for (int i = 0; i < ancho; i++) {
      resultado+="**";
    }
    resultado+="\n";
    
    for (int i = 1; i < alto-1; i++) {
      resultado+="**";
      for (int espacios = 1; espacios < ancho-1; espacios++) {
        resultado+="  ";
      }
      resultado+="**\n";
    }
    
    for (int i = 0; i < ancho; i++) {
      resultado+="**";
    }
    resultado+="\n";
    
    return resultado;
  }

}
