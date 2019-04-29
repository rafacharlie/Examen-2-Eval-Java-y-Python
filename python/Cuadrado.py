'''
2.- (Java) Crea la clase Rectángulo de forma que:
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

@author: Rafael Infante
'''
from examen2Eval.Rectangulo import Rectangulo

class Cuadrado(Rectangulo):
    
    '''constructor'''
    def __init__(self,lado):
        super().__init__(lado, lado)
        self.__lado = lado
    
    @property
    def lado(self):
        return self.__lado
    
    @lado.setter
    def lado(self, lado):
        self.__lado = lado
        
    '''
    metodo toString
    '''
    def __str__(self):
        figura="";
        for i in range(self.__lado):
            for j in range(self.__lado):
                figura+="*";
            figura+="\n";
        return figura; 
    '''
    sobrecarga de operadores
    '''
    def __gt__(self, Cuadrado):
        return self.__lado > Cuadrado.__lado

    def __lt__(self, Cuadrado):
        return self.__lado < Cuadrado.__lado

    def __ge__(self, Cuadrado):
        return self.__lado >= Cuadrado.__lado

    def __le__(self, Cuadrado):
        return self.__lado <= Cuadrado.__lado

    def __eq__(self, Cuadrado):
        return self.__lado == Cuadrado.__lado

    def __ne__(self, Cuadrado):
        return self.__lado != Cuadrado.__lado 
 

      
    