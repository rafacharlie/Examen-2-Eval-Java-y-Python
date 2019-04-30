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

public class Cuadrado extends Rectangulo implements Comparable<Cuadrado> {

  /**
   * Constructor
   * 
   * @param lado
   */
  public Cuadrado(double lado) {
    super(lado, lado);
  }

  public double getLado() {
    return this.getAlto();
    // return alto;
  }

  public void setLado(double lado) {
    setAncho(lado);
    setAlto(lado);
    // this.ancho = lado;
    // this.alto = lado;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(getLado());
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  /**
   * metodo equals
   * 
   * @param: objeto cuadrado
   * @return: boolean
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cuadrado other = (Cuadrado) obj;
    if (Double.doubleToLongBits(getLado()) != Double.doubleToLongBits(other.getLado()))
      return false;
    return true;
  }

  @Override
  // public int compareTo(Cuadrado c) {
  // return (int) (this.getAlto() - c.getLado());

  // }
  public int compareTo(Cuadrado c) {
    if (this.getLado() == c.getLado()) {
      return 0;
    } else if (this.getLado() < c.getLado()) {
      return -1;
    } else {
      return 1;
    }
  }

}
