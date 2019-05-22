'''
Prueba de la clase rectangulo

@author: Rafael Infante
'''

from examen2Eval.Rectangulo import Rectangulo

'''
instancia1
'''
try:
    rectangulo1 = Rectangulo(6,6)
    print(rectangulo1)

except ArithmeticError:
    print("Error, los valores del rectangulo deben estar comprendidos entre 1 y 10")
except TypeError:
    print("Error. Comprueba que el ancho y el alto sean valores enteros.")

print() #salto de linea
'''
instancia2
'''

try:
    rectangulo2 = Rectangulo(9,5)
    print(rectangulo2)

except ArithmeticError:
    print("Error, los valores del rectangulo deben estar comprendidos entre 1 y 10")
except TypeError:
    print("Error. Comprueba que el ancho y el alto sean valores enteros.")

    
    